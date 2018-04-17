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
public class PlacaDeRed extends Dispositivo{
    
    private boolean estaConectado;

    public PlacaDeRed(String mac, String modelo, String tipo, float velocidad, 
                        String normaEthernet, int bocas, String ip) {
        
        estaConectado = false;
        macDispositivosConectados = null;
        this.mac = mac;
        this.modelo =  modelo;
        this.tipo = tipo;
        this.velocidad = velocidad;
        this.normaEthernet = normaEthernet;
        this.bocas= bocas;
        this.ip = ip;
    }

    @Override
    public Boolean conectarSwitch(Switch marianita) {
        boolean flag = true;
        if(bocas <= 0)
            flag = false;
        if (flag){
            bocas--;
            estaConectado = true;
            macDispositivosConectados.add(marianita.getMac());
        }
        return flag;
    }

    public boolean EstaConectado() {
        return estaConectado;
    }

    public void setEstaConectado(boolean estaConectado) {
        this.estaConectado = estaConectado;
    }

    
    
    @Override
    public Boolean conectarRouter(Router router) {
        return false;
    }

    @Override
    public Boolean conectarHub(Hub hub) {
        boolean flag = true;
        if(bocas <= 0)
            flag = false;
        if (flag){
            bocas--;
            estaConectado = true;
            macDispositivosConectados.add(hub.getMac());
        }
        return flag;
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

    public boolean isEstaConectado() {
        return estaConectado;
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
