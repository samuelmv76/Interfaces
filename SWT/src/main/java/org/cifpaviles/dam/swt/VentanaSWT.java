package org.cifpaviles.dam.swt;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.MessageBox;

public class VentanaSWT {

    public static void main(String[] args) {
        // Crear la ventana principal
        Display display = new Display();
        Shell shell = new Shell(display);
        shell.setText("Interfaz SWT - Puestos");
        shell.setSize(300, 200);
        shell.setLayout(null);

        // Etiqueta descriptiva
        Label label = new Label(shell, SWT.NONE);
        label.setText("Selecciona un número de puesto:");
        label.setBounds(30, 20, 220, 20);

        // Lista desplegable (Combo)
        Combo combo = new Combo(shell, SWT.DROP_DOWN | SWT.READ_ONLY);
        combo.setItems(new String[] { "52 (Yo)", "53 (derecha)", "42 (delante)" });
        combo.select(0);
        combo.setBounds(30, 50, 150, 25);

        // Botón
        Button boton = new Button(shell, SWT.PUSH);
        boton.setText("Mostrar selección");
        boton.setBounds(30, 90, 150, 30);

        // Acción al pulsar el botón
        boton.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                String seleccionado = combo.getText();
                MessageBox mensaje = new MessageBox(shell, SWT.ICON_INFORMATION | SWT.OK);
                mensaje.setText("Puesto seleccionado");
                mensaje.setMessage("Has seleccionado: " + seleccionado);
                mensaje.open();
            }
        });

        // Mostrar ventana
        shell.open();
        while (!shell.isDisposed()) {
            if (!display.readAndDispatch()) {
                display.sleep();
            }
        }
        display.dispose();
    }
}
