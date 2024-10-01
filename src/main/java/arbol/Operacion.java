package arbol;

public class Operacion implements Instruccion {
    public enum Tipo {
        SUMA, RESTA, MULTIPLICACION, DIVISION, MAYOR, MENOR, IGUAL, DIFERENTE, MAYOR_IGUAL, MENOR_IGUAL, CONCATENACION, // Añadir CONCATENACION para cadenas
        CADENA ,NEGATIVO,CARACTER,NUMERO,ID,MAYOR_QUE,MENOR_QUE// Tipo específico para operaciones con cadenas
    }

    private  Operacion izquierda;
    private  Operacion derecha;
    private final Tipo tipo;
    private  Object valor;
    private  String identificador; // Para manejar variables

    // Constructor para operaciones binarias
    public Operacion(Operacion izquierda, Operacion derecha, Tipo tipo) {
        this.izquierda = izquierda;
        this.derecha = derecha;
        this.tipo = tipo;
    }
    /**
     * Constructor para operaciones unarias (un operador), estas operaciones son:
     * NEGATIVO
     * @param operadorIzq Único operador de la operación
     * @param tipo Tipo de operación
     */
    public Operacion(Operacion operadorIzq, Tipo tipo) {
        this.tipo = tipo;
        this.izquierda = operadorIzq;
    }

    // Constructor para valores numéricos
    public Operacion(double valor) {
        this.valor = valor;
        this.tipo = Tipo.NUMERO;
    }

    // Constructor para valores de cadena, caracter e identificadores
    public Operacion(String valor, Tipo tipo_Operacion) {
        this.valor = valor;
        this.tipo = tipo_Operacion;
    }

    // Método para evaluar la operación
    public Object ejecutar() {
        // Operaciones unarias
        switch (tipo) {
            case NUMERO:
                return Double.valueOf(valor.toString());
            case ID:
                return obtenerValorVariable((String) valor); // Recuperar valor con el método específico
            case CADENA:
                return valor.toString();
        }

        // Obtener los valores de los operandos para las operaciones binarias
        Object valorIzquierda = izquierda.ejecutar();
        Object valorDerecha = derecha.ejecutar();

        // Operaciones de concatenación
        if (tipo == Tipo.CONCATENACION) {
            return valorIzquierda.toString() + valorDerecha.toString();
        }

        // Convertir los operandos a números si la operación lo requiere
        Double numIzquierda = convertirANumero(valorIzquierda);
        Double numDerecha = convertirANumero(valorDerecha);

        // Operaciones aritméticas y relacionales
        switch (tipo) {
            case SUMA:
                return numIzquierda + numDerecha;
            case RESTA:
                return numIzquierda - numDerecha;
            case MULTIPLICACION:
                return numIzquierda * numDerecha;
            case DIVISION:
                return numIzquierda / numDerecha;
            case MAYOR_QUE:
                return numIzquierda > numDerecha;
            case MENOR_QUE:
                return numIzquierda < numDerecha;
            case MAYOR_IGUAL:
                return numIzquierda >= numDerecha;
            case MENOR_IGUAL:
                return numIzquierda <= numDerecha;
            case IGUAL:
                return numIzquierda.equals(numDerecha);
            case DIFERENTE:
                return !numIzquierda.equals(numDerecha);
            default:
                throw new IllegalStateException("Operación no soportada");
        }
    }

    // Método auxiliar para convertir valores a números
    private Double convertirANumero(Object valor) {
        if (valor instanceof Double) {
            return (Double) valor;
        } else if (valor instanceof String) {
            return Double.valueOf((String) valor);
        } else {
            throw new IllegalArgumentException("El valor no puede ser convertido a un número: " + valor);
        }
    }


    // Método para obtener el valor de una variable
    private Object obtenerValorVariable(String identificador) {
        Object valor = TablaSimbolos.obtener(identificador); // Simboliza la obtención del valor desde la tabla de símbolos
        return valor;
    }
}
