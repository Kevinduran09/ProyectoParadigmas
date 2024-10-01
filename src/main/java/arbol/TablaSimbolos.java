package arbol;

import java.util.HashMap;

public class TablaSimbolos {
    private static HashMap<String, Object> simbolos = new HashMap<>();
    private static HashMap<String, DefinirFuncion> funciones = new HashMap<>();
    public static void asignar(String identificador, Object valor) {
        simbolos.put(identificador, valor);
    }

    public static Object obtener(String identificador) {
        if (simbolos.containsKey(identificador)) {
            return simbolos.get(identificador);
        }
        throw new RuntimeException("Variable no definida: " + identificador);
    }


    public static void agregarFuncion(String nombre, DefinirFuncion funcion) {
        funciones.put(nombre, funcion);
    }

    public static DefinirFuncion obtenerFuncion(String nombre) {
        if (funciones.containsKey(nombre)) {
            return funciones.get(nombre);
        }
        throw new RuntimeException("Función no definida: " + nombre);
    }
}
