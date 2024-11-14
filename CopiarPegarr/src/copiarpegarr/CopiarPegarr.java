package copiarpegarr;

import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CopiarPegarr extends JFrame {
    private JLabel labeltitulo = new JLabel("Copiar y Pegar");
    private JLabel labelCopiar = new JLabel("Texto a Copiar:");
    private JLabel labelPegar = new JLabel("Texto Pegado:");
    private JTextField textoCopiar = new JTextField(10);
    private JTextField textoPegar = new JTextField(10);
    private JButton btnCopiar = new JButton("Copiar");
    private JButton btnPegar = new JButton("Pegar");
    private String textoCopiado; // Variable para almacenar el texto copiado

    public CopiarPegarr() {
        setTitle("Copiar y Pegar");
        setSize(450, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Para cerrar la ventana
        setLocationRelativeTo(null); // Para centrar la ventana
        setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20)); // Para alinear a la izquierda

        // Añadir componentes a la ventana
        add(labeltitulo);
        add(labelCopiar);
        add(textoCopiar);
        add(btnCopiar);
        add(labelPegar);
        add(textoPegar);
        add(btnPegar);

        // Acción para el botón "Copiar"
        btnCopiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textoCopiado = textoCopiar.getText(); // Copiar el texto al variable temporal
            }
        });
        btnPegar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textoPegar.setText(textoCopiado); // Pegar el texto almacenado en el campo de texto
            }
        });
    }
    public static void main(String[] args) {
        CopiarPegarr ventana = new CopiarPegarr(); // Crear la ventana
        ventana.setVisible(true); // Mostrar la ventana
    }
}