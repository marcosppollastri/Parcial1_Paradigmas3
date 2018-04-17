/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1;

import java.util.ArrayList;

/**
 *
 * @author
 * Marcos J. Peña Pollastri
 * Emanuel A. Cortez Mercado
 * Martín L. Castellitto Secreto
 * Jesus G. Kuti   
 */
public class Pc extends Equipo {
    private String so;
    private String puerto;
    private String ip;
    private String ram;
    private String placaMadre;
    private String discoRigido;
    private String procesador;
    private String fuente;
    private String gabinete;
    private String placaDeVideo;
    private String lectora;

    public Pc(String id, String modelo, String so, String puerto, String ip, String ram, String placaMadre,
            String discoRigido, String procesador, String fuente, String gabinete,
            String placaDeVideo, String lectora) {
        this.id = id;
        this.modelo = modelo;
        placas = null;

        this.so = so;
        this.puerto = puerto;
        this.ip = ip;
        this.ram = ram;
        this.placaMadre = placaMadre;
        this.discoRigido = discoRigido;
        this.procesador = procesador;
        this.fuente = fuente;
        this.gabinete = gabinete;
        this.placaDeVideo = placaDeVideo;
        this.lectora = lectora;
    }

    public void addPlaca(PlacaDeRed plaquita){
        placas.add(plaquita);
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

    public String getFuente() {
        return fuente;
    }

    public String getGabinete() {
        return gabinete;
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

    public void setFuente(String fuente) {
        this.fuente = fuente;
    }

    public void setGabinete(String gabinete) {
        this.gabinete = gabinete;
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
