package org.cifpaviles.gestor_de_tareas.control;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.cifpaviles.gestor_de_tareas.modelo.ModeloLista;
import org.cifpaviles.gestor_de_tareas.vista.VentanaPrincipal;

public class ControladorAgregar implements ActionListener {

    private VentanaPrincipal vista;
    private ModeloLista modelo;

    public ControladorAgregar(VentanaPrincipal vista, ModeloLista modelo) {
        this.vista = vista;
        this.modelo = modelo;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String texto = vista.campoTexto.getText().trim();
        if (!texto.isEmpty()) {
            modelo.agregar(texto);
            vista.mostrarEstado("Tarea añadida");
            vista.campoTexto.setText("");
        }
    }
}
