package org.cifpaviles.dam.escuela;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
Crea una clase llamada Alumno que represente la información básica de un estudiante.
La clase debe contener los siguientes atributos privados:
• nombre (String): nombre del alumno
• edad (int): edad del alumno
• curso (String): curso en el que está matriculado
• notaMedia (float): nota media del alumno
Implementa los métodos get y set correspondientes para cada atributo.

Además, añade un constructor que permita inicializar todos los atributos y un método público llamado mostrarInfo() que muestre por pantalla los datos del alumno con un formato legible.
Ejemplo de salida esperada del método mostrarInfo():

Alumno: Laura Pérez
Edad: 20
Curso: 2º DAM
Nota media: 8.5
*/
/**
 *
 * @author samuelmv
 */
public class Alumno {
	private String nombre;
    private int edad;
    private String curso;
    private float notaMedia;

    public String getNombre() {
    	return nombre;
    }
    public void setNombre(String nombre) {
    	this.nombre = nombre;
    }
    public int getEdad() {
    	return edad;
    }
    public void setEdad(int edad) {
    	this.edad = edad;
    }
    public String getCurso() {
    	return curso;
    }
    public void setCurso(String curso) {
    	this.curso = curso;
    }
    public float getNotaMedia() {
    	return notaMedia;
    }
    public void setNotaMedia(float notaMedia) {
    	this.notaMedia = notaMedia;
    }
    
	public Alumno(String nombre, int edad, String curso, float notaMedia) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.curso = curso;
		this.notaMedia = notaMedia;
		mostrarinfo();
		}
	
	public void mostrarinfo() {
		System.out.println("Alumno: " + nombre);
		System.out.println("Edad: " + edad);
		System.out.println("Curso: " + curso);
		System.out.println("Nota media: " + notaMedia);
	}
    
}
