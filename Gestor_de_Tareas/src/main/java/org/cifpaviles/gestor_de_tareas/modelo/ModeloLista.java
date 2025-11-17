package org.cifpaviles.gestor_de_tareas.modelo;

import javax.swing.DefaultListModel;

public class ModeloLista {
    private DefaultListModel<String> modelo;

    public ModeloLista() {
        modelo = new DefaultListModel<>();
    }

    public DefaultListModel<String> getModelo() {
        return modelo;
    }

    public void agregar(String tarea) {
        modelo.addElement(tarea);
    }

    public void eliminar(int index) {
        if (index != -1) {
            modelo.remove(index);
        }
    }
}
