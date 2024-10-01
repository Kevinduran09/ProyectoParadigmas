package arbol;

public class OperacionMinimo extends Operacion {  // Heredando de Operacion
    public OperacionMinimo(Operacion num1, Operacion num2) {
        super(num1, num2, Tipo.MINIMO); // Llama al constructor de la clase base
    }

    @Override
    public Object ejecutar() {
        // Obtener los valores de las operaciones numéricas
        double valor1 = (double) izquierda.ejecutar();
        double valor2 = (double) derecha.ejecutar();
        return Math.min(valor1, valor2);
    }
}
