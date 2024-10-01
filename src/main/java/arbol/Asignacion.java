package arbol;

public class Asignacion implements Instruccion {
    private String identificador;
    private Operacion expresion;
    private String tipo; // Añadir un atributo para el tipo de variable

    public Asignacion(String identificador, Operacion expresion) {
        this.identificador = identificador;

        this.expresion = expresion;
    }

    @Override
    public Object ejecutar() {
        Object valor = expresion.ejecutar();
        // Asignar el valor a la variable en la tabla de símbolos
        System.out.println(identificador + ": " + valor);
        TablaSimbolos.asignar(identificador, valor);
        return null;
    }
}
