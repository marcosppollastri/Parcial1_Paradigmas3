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
public class Hub extends Dispositivo{

        public Hub(String mac, String modelo, String tipo, float velocidad, 
                        String normaEthernet, int bocas) {
        
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean conectarRouter(Router router) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean conectarHub(Hub hub) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean conectarAccessPoint(AccessPoint ap) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean conectarServer(Servidor servidor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean conectarImpresora(Impresora impresora) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean conectarNotebook(Notebook notebook) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean conectarPc(Pc pc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    
    String getMac() {
        return mac;
    }
    
}
