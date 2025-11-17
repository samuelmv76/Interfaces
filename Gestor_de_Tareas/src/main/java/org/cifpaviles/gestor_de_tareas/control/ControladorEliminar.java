package org.cifpaviles.gestor_de_tareas.control;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.cifpaviles.gestor_de_tareas.modelo.ModeloLista;
import org.cifpaviles.gestor_de_tareas.vista.VentanaPrincipal;

public class ControladorEliminar implements ActionListener {

    private VentanaPrincipal vista;
    private ModeloLista modelo;

    public ControladorEliminar(VentanaPrincipal vista, ModeloLista modelo) {
        this.vista = vista;
        this.modelo = modelo;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int index = vista.lista.getSelectedIndex();
        modelo.eliminar(index);
        vista.mostrarEstado("Tarea eliminada");
    }
}
