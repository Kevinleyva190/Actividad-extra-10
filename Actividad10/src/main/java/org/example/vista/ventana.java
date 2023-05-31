package org.example.vista;

import javax.swing.*;
import java.awt.*;

public class ventana extends JFrame {
    private JButton btnMensaje;
    private JButton btnEntrada;
    private JButton btnOpcion;
    private JLabel resultado;
    public ventana(String title) throws HeadlessException {
        super(title);
        this.setSize(450,200);
        btnMensaje=new JButton("Mensaje");
        btnEntrada=new JButton("Entrada");
        btnOpcion=new JButton("Opcion");
        resultado=new JLabel("...");
        this.getContentPane().setLayout(new FlowLayout());
        this.getContentPane().add(btnMensaje);
        this.getContentPane().add(btnEntrada);
        this.getContentPane().add(btnOpcion);
        this.getContentPane().add(resultado);


        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public JButton getBtnMensaje() {
        return btnMensaje;
    }

    public void setBtnMensaje(JButton btnMensaje) {
        this.btnMensaje = btnMensaje;
    }

    public JButton getBtnEntrada() {
        return btnEntrada;
    }

    public void setBtnEntrada(JButton btnEntrada) {
        this.btnEntrada = btnEntrada;
    }

    public JButton getBtnOpcion() {
        return btnOpcion;
    }

    public void setBtnOpcion(JButton btnOpcion) {
        this.btnOpcion = btnOpcion;
    }

    public JLabel getResultado() {
        return resultado;
    }

    public void setResultado(JLabel resultado) {
        this.resultado = resultado;
    }
}
