package arbol;

import java.util.LinkedList;

public class SI implements Instruccion {
    private final Operacion condicion;
    private final LinkedList<Instruccion> instrucciones;

    public SI(Operacion condicion, LinkedList<Instruccion> instrucciones) {
        this.condicion = condicion;
        this.instrucciones = instrucciones;
    }

    @Override
    public Object ejecutar() {

        if ((boolean)condicion.ejecutar()) {
            // Si la condición es verdadera, ejecutar las instrucciones
            for (Instruccion instruccion : instrucciones) {
                instruccion.ejecutar();
            }
        }
        return null;
    }

    // Convierte el resultado numérico de la evaluación en booleano
    private boolean convertirAEnteroABooleano(int valor) {
        // Se considera 0 como falso y cualquier otro valor como verdadero
        return valor != 0;
    }

    @Override
    public String toString() {
        return "Si{" +
                "condicion=" + condicion +
                ", instrucciones=" + instrucciones +
                '}';
    }
}
