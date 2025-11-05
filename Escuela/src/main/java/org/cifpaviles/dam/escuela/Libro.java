/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

 /*
Crea una clase llamada Libro que represente la información básica de un libro. La clase debe contener los siguientes atributos privados:
• titulo (String): título del libro
• autor (String): nombre del autor
• anioPublicacion (int): año en que se publicó
• paginas (int): número de páginas
• precio (float): precio del libro
Implementa los métodos get y set correspondientes para cada atributo.

 */
package org.cifpaviles.dam.escuela;

/**
 *
 * @author samuelmv
 */
public class Libro {

	private String titulo;
    private String autor;
    private int anioPublicacion;
    private int paginas;
    private float precio;

    public String getTitulo() {
    	return titulo;
    }
    public void setTitulo(String titulo) {
    	this.titulo = titulo;
    }
    public String getAutor() {
    	return autor;
    }
    public void setAutor(String autor) {
    	this.autor = autor;
    }
    public int getAnioPublicacion() {
    	return anioPublicacion;
    }
    public void setAnioPublicacion(int anioPublicacion) {
    	this.anioPublicacion = anioPublicacion;
    }
    public int getPaginas() {
    	return paginas;
    }
    public void setPaginas(int paginas) {
    	this.paginas = paginas;
    }
    public float getPrecio() {
    	return precio;
    }
    public void setPrecio(float precio) {
    	this.precio = precio;
    }
    
}
