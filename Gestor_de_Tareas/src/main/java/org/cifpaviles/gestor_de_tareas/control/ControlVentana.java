package org.cifpaviles.gestor_de_tareas.control;


import javax.swing.*;

import org.cifpaviles.gestor_de_tareas.vista.VentanaPrincipal;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ControlVentana extends WindowAdapter {

    private VentanaPrincipal vista;

    public ControlVentana(VentanaPrincipal vista) {
        this.vista = vista;
    }

    @Override
    public void windowClosing(WindowEvent e) {
        cerrarAplicacion(vista);
    }

    public static void cerrarAplicacion(VentanaPrincipal vista) {
        int r = JOptionPane.showConfirmDialog(
                vista,
                "¿Deseas salir del programa?",
                "Confirmación",
                JOptionPane.YES_NO_OPTION);

        if (r == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }
}
