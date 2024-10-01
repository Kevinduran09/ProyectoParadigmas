package arbol;

public class Imprimir implements Instruccion {
    private Operacion expresion;

    public Imprimir(Operacion expresion) {
        this.expresion = expresion;
    }

    @Override
    public Object ejecutar() {
        System.out.println(expresion.ejecutar());
        return null;
    }
}
