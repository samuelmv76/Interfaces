package org.cifpaviles.gestor_de_tareas.control;


import javax.swing.*;

import org.cifpaviles.gestor_de_tareas.vista.VentanaPrincipal;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ControladorDobleClick extends MouseAdapter {

    private VentanaPrincipal vista;

    public ControladorDobleClick(VentanaPrincipal vista) {
        this.vista = vista;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getClickCount() == 2 && vista.lista.getSelectedValue() != null) {
            String tarea = vista.lista.getSelectedValue();
            JOptionPane.showMessageDialog(vista, 
                    "Has hecho doble clic sobre la tarea: " + tarea);
        }
    }
}
