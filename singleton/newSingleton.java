/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author Usuario
 */
public class newSingleton {

    private String nombre, apellido, dni;

    private static final newSingleton INSTANCIAR = new newSingleton();


    private newSingleton() {

    }

    public static newSingleton Instanciar() {
        return INSTANCIAR;
    }

    public void mostrar() {
        System.out.println("nombre: " + this.nombre + " apellido: " + this.apellido + " dni: " + this.dni);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

}
