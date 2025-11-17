/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.cifpaviles.dam.agenda;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.MessageBox;

public class VentanaSWT {

    public static void main(String[] args) {
        // Crear Display y Shell (ventana principal)
        Display display = new Display();
        Shell shell = new Shell(display);
        shell.setText("Actividad 1.1 - SWT");
        shell.setSize(300, 200);
        shell.setLayout(null);

        // Crear lista desplegable (Combo)
        Combo combo = new Combo(shell, SWT.DROP_DOWN | SWT.READ_ONLY);
        combo.setBounds(50, 40, 200, 25);

        // Agregar tres números de puesto (ejemplo)
        combo.add("Puesto 12 (yo)");
        combo.add("Puesto 13 (derecha)");
        combo.add("Puesto 7 (delante)");

        // Crear botón
        Button boton = new Button(shell, SWT.PUSH);
        boton.setText("Mostrar selección");
        boton.setBounds(80, 90, 130, 30);

        // Acción del botón
        boton.addListener(SWT.Selection, e -> {
            String seleccionado = combo.getText();
            MessageBox mensaje = new MessageBox(shell);
            mensaje.setMessage("Has seleccionado: " + seleccionado);
            mensaje.open();
        });

        // Mostrar ventana
        shell.open();
        while (!shell.isDisposed()) {
            if (!display.readAndDispatch())
                display.sleep();
        }
        display.dispose();
    }
}
