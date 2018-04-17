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
public class Switch extends Dispositivo{

    public Switch(String mac, String modelo, String tipo, float velocidad, 
                        String normaEthernet, int bocas, String ip) {
        
        this.mac = mac;
        this.modelo =  modelo;
        this.tipo = tipo;
        this.velocidad = velocidad;
        this.normaEthernet = normaEthernet;
        this.bocas= bocas;
        this.ip = ip;
        
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
    
    

    @Override
    public Boolean conectarSwitch(Switch marianita) {
        return false;
    }

    @Override
    public Boolean conectarRouter(Router router) {
        boolean flag = true;
        if(bocas <= 0)
            flag = false;
        if (flag)
            bocas--;
        return flag;
    }

    @Override
    public Boolean conectarHub(Hub hub) {
        boolean flag = true;
        if(bocas <= 0)
            flag = false;
        if (flag)
            bocas--;
        return flag;
    }

    @Override
    public Boolean conectarAccessPoint(AccessPoint ap) {
        boolean flag = true;
        if(bocas <= 0)
            flag = false;
        if (flag)
            bocas--;
        return flag;
    }

    @Override
    public Boolean conectarServer(Servidor servidor) {
        boolean flag = true;
        if(bocas <= 0)
            flag = false;
        if (flag)
            bocas--;
        return flag;
    }

    @Override
    public Boolean conectarImpresora(Impresora impresora) {
        boolean flag = true;
        if(bocas <= 0)
            flag = false;
        if (flag)
            bocas--;
        return flag;
    }

    @Override
    public Boolean conectarNotebook(Notebook notebook) {
        return false;
    }

    @Override
    public Boolean conectarPc(Pc pc) {
        boolean flag = true;
        if(bocas <= 0)
            flag = false;
        if (flag)
            bocas--;
        return flag;
    }

    
}
