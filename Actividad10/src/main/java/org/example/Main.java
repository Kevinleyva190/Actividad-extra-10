package org.example;

import org.example.controlador.controlador;
import org.example.vista.ventana;

public class Main {
    public static void main(String[] args) { ventana ven=new ventana("JOption");
        controlador controlador=new controlador(ven);
    }

}