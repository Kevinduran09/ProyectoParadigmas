package arbol;

import java.util.LinkedList;

public class DefinirFuncion implements Instruccion {
    private final String nombre;
    private final LinkedList<String> parametros;
    private final LinkedList<Instruccion> instrucciones;

    public DefinirFuncion(String nombre, LinkedList<String> parametros, LinkedList<Instruccion> instrucciones) {
        this.nombre = nombre;
        this.parametros = parametros;
        this.instrucciones = instrucciones;
    }

    @Override
    public Object ejecutar() {
        // Registrar la función en la tabla de símbolos
        TablaSimbolos.agregarFuncion(nombre, this);
        return null;
    }

    public Object ejecutarConParametros(LinkedList<Object> valores) {
        // Asignar los valores de los parámetros antes de ejecutar
        for (int i = 0; i < parametros.size(); i++) {
            String parametro = parametros.get(i);
            Object valor = valores.get(i);
            TablaSimbolos.asignar(parametro, valor);
        }
        // Ejecutar las instrucciones de la función
        for (Instruccion instruccion : instrucciones) {
            instruccion.ejecutar();
        }
        return null;
    }
}
