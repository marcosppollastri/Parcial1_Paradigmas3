/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1;

/**
 *
 * @author Marcos
 */
public class Isp {
    private String nombre;
    private float velocidad;
    private String medio;
    private float precio;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }

    public void setMedio(String medio) {
        this.medio = medio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public String getMedio() {
        return medio;
    }

    public float getPrecio() {
        return precio;
    }

    public Isp(String nombre, float velocidad, String medio, float precio) {
        this.nombre = nombre;
        this.velocidad = velocidad;
        this.medio = medio;
        this.precio = precio;
    }
    

}
