/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1;

import java.util.ArrayList;

/**
 *
 * @author Marcos
 */
public class Servidor extends Equipo {
    private String puertos;
    private String ip;
    private String nombre;

    public Servidor(String id, String modelo, String puertos, String ip, String nombre) {
        this.id = id;
        this.modelo = modelo;
        placas = null;
        
        this.puertos = puertos;
        this.ip = ip;
        this.nombre = nombre;
    }
    
    public void addPlaca(PlacaDeRed plaquita){
        placas.add(plaquita);
    }

    public String getPuertos() {
        return puertos;
    }

    public String getIp() {
        return ip;
    }

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public String getModelo() {
        return modelo;
    }

    public ArrayList<PlacaDeRed> getPlacas() {
        return placas;
    }

    public void setPuertos(String puertos) {
        this.puertos = puertos;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPlacas(ArrayList<PlacaDeRed> placas) {
        this.placas = placas;
    }
}
