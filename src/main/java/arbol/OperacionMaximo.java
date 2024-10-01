package arbol;

public class OperacionMaximo extends Operacion {  // Heredando de Operacion
    public OperacionMaximo(Operacion num1, Operacion num2) {
        super(num1, num2, Tipo.MAXIMO); // Llama al constructor de la clase base
    }

    @Override
    public Object ejecutar() {
        // Obtener los valores de las operaciones numéricas
        double valor1 = (double) izquierda.ejecutar();
        double valor2 = (double) derecha.ejecutar();
        return Math.max(valor1, valor2);
    }
}
