package arbol;

public class Imprimir implements Instruccion {
    private Instruccion expresion;  // Cambiar a tipo Instruccion

    public Imprimir(Instruccion expresion) {
        this.expresion = expresion;
    }

    @Override
    public Object ejecutar() {
        Object resultado = expresion.ejecutar();  // Ejecuta cualquier instrucción
        System.out.println(resultado);
        return null;
    }
}
