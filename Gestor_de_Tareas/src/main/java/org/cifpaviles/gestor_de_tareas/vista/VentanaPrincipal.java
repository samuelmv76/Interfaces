package org.cifpaviles.gestor_de_tareas.vista;


import javax.swing.*;

import org.cifpaviles.gestor_de_tareas.control.ControlVentana;
import org.cifpaviles.gestor_de_tareas.control.ControladorAgregar;
import org.cifpaviles.gestor_de_tareas.control.ControladorDobleClick;
import org.cifpaviles.gestor_de_tareas.control.ControladorEliminar;
import org.cifpaviles.gestor_de_tareas.control.ControladorTeclado;
import org.cifpaviles.gestor_de_tareas.modelo.ModeloLista;

import java.awt.*;

public class VentanaPrincipal extends JFrame {

    public JTextField campoTexto;
    public JButton btnAgregar;
    public JButton btnEliminar;
    public JList<String> lista;
    public JLabel lblEstado;

    private ModeloLista modelo;

    public VentanaPrincipal() {
        setTitle("Gestor de Tareas");
        setSize(400, 350);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

        modelo = new ModeloLista();

        JPanel panelSuperior = new JPanel(new BorderLayout());
        campoTexto = new JTextField();
        btnAgregar = new JButton("Agregar");
        btnEliminar = new JButton("Eliminar");

        panelSuperior.add(campoTexto, BorderLayout.CENTER);
        panelSuperior.add(btnAgregar, BorderLayout.EAST);
        panelSuperior.add(btnEliminar, BorderLayout.SOUTH);

        add(panelSuperior, BorderLayout.NORTH);

        lista = new JList<>(modelo.getModelo());
        add(new JScrollPane(lista), BorderLayout.CENTER);

        lblEstado = new JLabel("Listo.");
        add(lblEstado, BorderLayout.SOUTH);

        JMenuBar barra = new JMenuBar();
        JMenu archivo = new JMenu("Archivo");
        JMenuItem salir = new JMenuItem("Salir");
        archivo.add(salir);
        barra.add(archivo);
        setJMenuBar(barra);

        // =====================
        // ASOCIAR CONTROLADORES
        // =====================
        btnAgregar.addActionListener(new ControladorAgregar(this, modelo));
        campoTexto.addActionListener(new ControladorAgregar(this, modelo));

        btnEliminar.addActionListener(new ControladorEliminar(this, modelo));

        lista.addMouseListener(new ControladorDobleClick(this));

        lista.addKeyListener(new ControladorTeclado(this, modelo));

        addWindowListener(new ControlVentana(this));

        salir.addActionListener(e -> ControlVentana.cerrarAplicacion(this));
    }

    public void mostrarEstado(String txt) {
        lblEstado.setText(txt);
    }

    public ModeloLista getModelo() {
        return modelo;
    }
}
