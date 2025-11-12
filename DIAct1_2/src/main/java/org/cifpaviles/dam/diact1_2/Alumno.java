/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.cifpaviles.dam.diact1_2;

import java.awt.event.ActionEvent;

/**
 *
 * @author samuelmv
 */
public class Alumno {
    private String nombre;
    private String apellido;
    private String email;
    private int edad;
    private int telf;
    
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getTelf() {
		return telf;
	}
	public void setTelf(int telf) {
		this.telf = telf;
	}
        public Alumno(String nombre, String apellido, String email, int edad, int telf) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.email = email;
            this.edad = edad;
            this.telf = telf;
        }
    //metodo para indicar si el alumno es mayor de edad
	public boolean mayorEdad() {
		if(this.edad>=18) {
			return true;
		} else {
			return false;
		}
	}
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", edad=" + edad + ", telf="
				+ telf + "]";
	}
        

    
}
