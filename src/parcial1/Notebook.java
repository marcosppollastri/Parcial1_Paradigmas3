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
public class Notebook extends Equipo {
    private String so;
    private String puerto;
    private String ip;
    private String ram;
    private String placaMadre;
    private String discoRigido;
    private String procesador;
    private String placaDeVideo;
    private String lectora;

    public Notebook(String id, String modelo, String so,
            String puerto, String ip, String ram, String placaMadre,
            String discoRigido, String procesador, String placaDeVideo, String lectora) {
        
        //Atributos superclase
        this.modelo = modelo;
        placas = null;
        this.id = id;
        //atributos clase
        this.so = so;
        this.puerto = puerto;
        this.ip = ip;
        this.ram = ram;
        this.placaMadre = placaMadre;
        this.discoRigido = discoRigido;
        this.procesador = procesador;
        this.placaDeVideo = placaDeVideo;
        this.lectora = lectora;

    }

    public String getSo() {
        return so;
    }

    public String getPuerto() {
        return puerto;
    }

    public String getIp() {
        return ip;
    }

    public String getRam() {
        return ram;
    }

    public String getPlacaMadre() {
        return placaMadre;
    }

    public String getDiscoRigido() {
        return discoRigido;
    }

    public String getProcesador() {
        return procesador;
    }

    public String getPlacaDeVideo() {
        return placaDeVideo;
    }

    public String getLectora() {
        return lectora;
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

    public void setSo(String so) {
        this.so = so;
    }

    public void setPuerto(String puerto) {
        this.puerto = puerto;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public void setPlacaMadre(String placaMadre) {
        this.placaMadre = placaMadre;
    }

    public void setDiscoRigido(String discoRigido) {
        this.discoRigido = discoRigido;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public void setPlacaDeVideo(String placaDeVideo) {
        this.placaDeVideo = placaDeVideo;
    }

    public void setLectora(String lectora) {
        this.lectora = lectora;
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
