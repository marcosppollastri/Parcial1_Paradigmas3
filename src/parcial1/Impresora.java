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
public class Impresora extends Equipo {
    private String tipo;
    private String ip;

    public Impresora(String modelo, String id,String tipo, String ip) {
        this.tipo = tipo;
        this.ip = ip;
        this.modelo = modelo;
        this.id = id;
        placas = null;
    }
    
    public void addPlaca(PlacaDeRed plaquita){
        placas.add(plaquita);
    }

    public String getTipo() {
        return tipo;
    }

    public String getIp() {
        return ip;
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

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setIp(String ip) {
        this.ip = ip;
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
