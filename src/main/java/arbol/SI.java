package arbol;

import java.util.LinkedList;

public class SI implements Instruccion {
    private final Operacion condicion;
    private final LinkedList<Instruccion> instrucciones;
    private final LinkedList<Instruccion> instruccionesSino; // Instrucciones para el bloque 'sino'

    // Constructor para la sentencia 'si'
    public SI(Operacion condicion, LinkedList<Instruccion> instrucciones) {
        this.condicion = condicion;
        this.instrucciones = instrucciones;
        this.instruccionesSino = null; // Inicialmente no hay bloque 'sino'
    }

    // Constructor para la sentencia 'si' con bloque 'sino'
    public SI(Operacion condicion, LinkedList<Instruccion> instrucciones, LinkedList<Instruccion> instruccionesSino) {
        this.condicion = condicion;
        this.instrucciones = instrucciones;
        this.instruccionesSino = instruccionesSino; // Guardar instrucciones 'sino'
    }

    @Override
    public Object ejecutar() {
        if ((boolean) condicion.ejecutar()) {
            // Si la condición es verdadera, ejecutar las instrucciones
            for (Instruccion instruccion : instrucciones) {
                instruccion.ejecutar();
            }
        } else if (instruccionesSino != null) {
            // Si hay instrucciones 'sino', ejecutarlas
            for (Instruccion instruccion : instruccionesSino) {
                instruccion.ejecutar();
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Si{" +
                "condicion=" + condicion +
                ", instrucciones=" + instrucciones +
                ", instruccionesSino=" + instruccionesSino +
                '}';
    }
}
