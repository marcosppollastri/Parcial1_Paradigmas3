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
public class Router extends Dispositivo{

    private Switch marianita;   //switch conectado llamado marianita por alguna razon
    private ArrayList<Isp> isp;
    private int cantBocasWan;
    private int cantAntenas;

    public Router(Switch marianita, ArrayList<Isp> isp, int cantBocasWan, int cantAntenas) {
        this.marianita = marianita;
        isp = null;
        this.cantBocasWan = cantBocasWan;
        this.cantAntenas = cantAntenas;
    }



    public boolean conectarIsp(Isp isp){
        boolean flag = true;
        if(cantBocasWan <= 0)
            flag = false;
        if (flag){
            cantBocasWan--;
            this.isp.add(isp);
        }
        return flag;

    }

    @Override
    public Boolean conectarSwitch(Switch marianita) {
        boolean flag = true;
        if(bocas <= 0)
            flag = false;
        if (flag){
            bocas--;
            macDispositivosConectados.add(marianita.getMac());
        }
        return flag;
    }

    @Override
    public Boolean conectarRouter(Router router) {
        return false;
    }

    @Override
    public Boolean conectarHub(Hub hub) {
        return false;
    }

    @Override
    public Boolean conectarAccessPoint(AccessPoint ap) {
        return false;
    }

    @Override
    public Boolean conectarServer(Servidor servidor) {
        return false;
    }

    @Override
    public Boolean conectarImpresora(Impresora impresora) {
        return false;
    }

    @Override
    public Boolean conectarNotebook(Notebook notebook) {
        return false;
    }

    @Override
    public Boolean conectarPc(Pc pc) {
        return false;
    }

    public Switch getMarianita() {
        return marianita;
    }

    public ArrayList<Isp> getIsp() {
        return isp;
    }

    public int getCantBocasWan() {
        return cantBocasWan;
    }

    public int getCantAntenas() {
        return cantAntenas;
    }

    public String getMac() {
        return mac;
    }

    public String getModelo() {
        return modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public String getNormaEthernet() {
        return normaEthernet;
    }

    public int getBocas() {
        return bocas;
    }

    public String getIp() {
        return ip;
    }

    public ArrayList<String> getMacDispositivosConectados() {
        return macDispositivosConectados;
    }

    public void setMarianita(Switch marianita) {
        this.marianita = marianita;
    }

    public void setIsp(ArrayList<Isp> isp) {
        this.isp = isp;
    }

    public void setCantBocasWan(int cantBocasWan) {
        this.cantBocasWan = cantBocasWan;
    }

    public void setCantAntenas(int cantAntenas) {
        this.cantAntenas = cantAntenas;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }

    public void setNormaEthernet(String normaEthernet) {
        this.normaEthernet = normaEthernet;
    }

    public void setBocas(int bocas) {
        this.bocas = bocas;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setMacDispositivosConectados(ArrayList<String> macDispositivosConectados) {
        this.macDispositivosConectados = macDispositivosConectados;
    }





}
