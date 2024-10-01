package arbol;

public class OperacionRaiz extends Operacion {  // Heredando de Operacion
    public OperacionRaiz(Operacion valor) {
        super(valor, null, Tipo.RAIZ); // Llama al constructor de la clase base, pasando null para el segundo operando
    }

    @Override
    public Object ejecutar() {
        // Obtener el valor de la operación
        double valorNumerico = (double) izquierda.ejecutar();
        return Math.sqrt(valorNumerico);
    }
}
