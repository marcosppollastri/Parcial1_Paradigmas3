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
public class AccessPoint extends Dispositivo{

    private String ssid;
    private String cifrado;
    private String password;
    private String normaWireless;
    private float velocidadWirelless;
    private String defaultAccess;
    private String pin;
    private String defaultSsid;

    public AccessPoint() {

    }

    public AccessPoint(String mac, String modelo, String tipo, float velocidad,
            String normaEthernet, int bocas, String ip,String ssid, String cifrado,
            String password, String normaWireless, float velocidadWirelless, String defaultAccess,
            String pin, String defaultSsid) {

        //atributos superclase
        this.mac = mac;
        this.modelo =  modelo;
        this.tipo = tipo;
        this.velocidad = velocidad;
        this.normaEthernet = normaEthernet;
        this.bocas= bocas;
        this.ip = ip;

        //atributos clase
        this.ssid = ssid;
        this.cifrado = cifrado;
        this.password = password;
        this.normaWireless = normaWireless;
        this.velocidadWirelless = velocidadWirelless;
        this.defaultAccess = defaultAccess;
        this.pin = pin;
        this.defaultSsid = defaultSsid;
    }



    @Override
    public Boolean conectarSwitch(Switch marianita) {
        boolean flag = true;
        if(bocas <= 0)
            flag = false;
        if (flag){
            macDispositivosConectados.add(marianita.getMac());
            bocas--;

        }
        return flag;
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
            macDispositivosConectados.add(hub.getMac());
            bocas--;

        }
        return flag;
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


    @Override
    public Boolean conectarAccessPoint(AccessPoint ap) {
        return false;
    }

    @Override
    public Boolean conectarServer(Servidor servidor) {
        return true;
    }

    @Override
    public Boolean conectarImpresora(Impresora impresora) {
        return true;
    }

    @Override
    public Boolean conectarNotebook(Notebook notebook) {
        return true;
    }

    @Override
    public Boolean conectarPc(Pc pc) {
        return true;
    }




}
