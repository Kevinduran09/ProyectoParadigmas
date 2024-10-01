package arbol;

public class OperacionAbs extends Operacion {

    public OperacionAbs(Operacion valor) {
        super(valor, Tipo.ABS);
    }

    @Override
    public Object ejecutar() {
        double valorNumerico = (double) izquierda.ejecutar();
        return Math.abs(valorNumerico);

    }
}
