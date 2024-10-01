package arbol;

import java.util.HashMap;

public class TablaSimbolos {
    private static HashMap<String, Object> simbolos = new HashMap<>();

    public static void asignar(String identificador, Object valor) {
        simbolos.put(identificador, valor);
    }

    public static Object obtener(String identificador) {
        if (simbolos.containsKey(identificador)) {
            return simbolos.get(identificador);
        }
        throw new RuntimeException("Variable no definida: " + identificador);
    }
}
