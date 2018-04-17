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
        boolean flag = true;
        if(bocas <= 0)
            flag = false;
        if (flag){
            macDispositivosConectados.add(router.getMac());
            bocas--;

        }
        return flag;
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

    @Override
    public Boolean conectarAccessPoint(AccessPoint ap) {
        boolean flag = true;
        if(bocas <= 0)
            flag = false;
        if (flag){
            macDispositivosConectados.add(ap.getMac());
            bocas--;

        }
        return flag;
    }

    @Override
    public Boolean conectarServer(Servidor servidor) {
        ArrayList<PlacaDeRed> placasDeServer  = servidor.getPlacas();
        boolean flag = true;
        if(bocas <= 0)
            flag = false;
        if (flag && !placasDeServer.isEmpty()){
            for(int i = 0; i < placasDeServer.size(); i++){
                if(!placasDeServer.get(i).EstaConectado()){
                    macDispositivosConectados.add(placasDeServer.get(i).getMac());
                    bocas--;
                    break;
                }
            }


        }
        return flag;
    }

    @Override
    public Boolean conectarImpresora(Impresora impresora) {
        ArrayList<PlacaDeRed> placasDeImpresora  = impresora.getPlacas();
        boolean flag = true;
        if(bocas <= 0)
            flag = false;
        if (flag && !placasDeImpresora.isEmpty()){
            for(int i = 0; i < placasDeImpresora.size(); i++){
                if(!placasDeImpresora.get(i).EstaConectado()){
                    macDispositivosConectados.add(placasDeImpresora.get(i).getMac());
                    bocas--;
                    break;
                }
            }


        }
        return flag;
    }

    @Override
    public Boolean conectarNotebook(Notebook notebook) {
        return false;
    }

    @Override
    public Boolean conectarPc(Pc pc) {
        ArrayList<PlacaDeRed> placasDePc  = pc.getPlacas();
        boolean flag = true;
        if(bocas <= 0)
            flag = false;
        if (flag && !placasDePc.isEmpty()){
            for(int i = 0; i < placasDePc.size(); i++){
                if(!placasDePc.get(i).EstaConectado()){
                    macDispositivosConectados.add(placasDePc.get(i).getMac());
                    bocas--;
                    break;
                }
            }


        }
        return flag;
    }


}
