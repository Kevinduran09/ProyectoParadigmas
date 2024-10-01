package arbol;

import java.util.LinkedList;

public class LlamarFuncion implements Instruccion {
    private final String nombreFuncion;
    private final LinkedList<Operacion> parametros;

    public LlamarFuncion(String nombreFuncion, LinkedList<Operacion> parametros) {
        this.nombreFuncion = nombreFuncion;
        this.parametros = parametros;
    }

    @Override
    public Object ejecutar() {
        // Obtener la función desde el registro de funciones
        DefinirFuncion funcion = TablaSimbolos.obtenerFuncion(nombreFuncion);
        if (funcion == null) {
            throw new RuntimeException("La función " + nombreFuncion + " no está definida.");
        }

        // Evaluar los parámetros
        LinkedList<Object> valores = new LinkedList<>();
        for (Operacion parametro : parametros) {
            valores.add(parametro.ejecutar());
        }

        // Ejecutar la función con los parámetros evaluados
        return funcion.ejecutarConParametros(valores);
    }
}
