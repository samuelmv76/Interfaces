/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.cifpaviles.dam.agenda;

/**
 *
 * @author samuelmv
 */
public class Agenda {

    public static void main(String[] args) {
        System.out.println("Hello Worldwwww!");
        
            javax.swing.SwingUtilities.invokeLater(() -> {
              AgendaMainFrame frame = new AgendaMainFrame();
              frame.setVisible(true);
            });
            
    }
}
