package org.example.controlador;

import org.example.vista.ventana;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class controlador extends MouseAdapter {
    private ventana view;

    public controlador(ventana view) {
        this.view = view;
        this.view.getBtnEntrada().addMouseListener(this);
        this.view.getBtnMensaje().addMouseListener(this);
        this.view.getBtnOpcion().addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource()==view.getBtnMensaje()){
            ImageIcon icono=new ImageIcon("exito.png");
            JOptionPane.showMessageDialog(view,"Hola desde el ejemplo","titulo personalizado",JOptionPane.INFORMATION_MESSAGE,icono);
        }
        if (e.getSource()==view.getBtnEntrada()){
            String datos= JOptionPane.showInputDialog(view,"Ejemplo de entrada");
            this.view.getResultado().setText(datos);
        }
        if (e.getSource()==view.getBtnOpcion()){
           int respuesta= JOptionPane.showConfirmDialog(view,"Estas seguro de borrar el registro","confirmacion",JOptionPane.YES_NO_OPTION);
            if (respuesta==JOptionPane.YES_NO_OPTION){
                this.view.getResultado().setText("Elegiste la opcion si");
            }else{
                this.view.getResultado().setText("Elegiste la opcion no");
            }
        }
    }
}
