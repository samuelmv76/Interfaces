package org.cifpaviles.gestor_de_tareas.control;


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import org.cifpaviles.gestor_de_tareas.modelo.ModeloLista;
import org.cifpaviles.gestor_de_tareas.vista.VentanaPrincipal;

public class ControladorTeclado implements KeyListener {

    private VentanaPrincipal vista;
    private ModeloLista modelo;

    public ControladorTeclado(VentanaPrincipal vista, ModeloLista modelo) {
        this.vista = vista;
        this.modelo = modelo;
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_DELETE) {
            int index = vista.lista.getSelectedIndex();
            modelo.eliminar(index);
            vista.mostrarEstado("Tarea eliminada");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {}
}
