package arbol;

public class OperacionPotencia extends Operacion {

    public OperacionPotencia(Operacion base, Operacion exponente) {
        super(base, exponente, Tipo.POTENCIA);
    }

    @Override
    public Object ejecutar() {

        double baseValue = (double) izquierda.ejecutar();
        double exponenteValue = (double) derecha.ejecutar();
        return Math.pow(baseValue, exponenteValue);
    }
}
