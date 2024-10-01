package org.example;

import javax.swing.*;
import java.io.IOException;
import java.io.OutputStream;

public class TextAreaOutputStream extends OutputStream {
    private final JTextArea textArea;

    public TextAreaOutputStream(JTextArea textArea) {
        this.textArea = textArea;
    }

    @Override
    public void write(int b) throws IOException {
        // Agregar texto al JTextArea
        textArea.append(String.valueOf((char) b));
        // Desplazar automáticamente hacia abajo
        textArea.setCaretPosition(textArea.getDocument().getLength());
    }
}
