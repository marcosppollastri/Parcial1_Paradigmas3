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
public class Router extends Dispositivo{
    
    private Switch marianita;   //switch conectado llamado marianita por alguna razon
    private ArrayList<Isp> isp;
    private int cantBocasWan;
    private int cantAntenas;

    public Router(Switch marianita, ArrayList<Isp> isp, int cantBocasWan, int cantAntenas) {
        this.marianita = marianita;
        this.isp = isp;
        this.cantBocasWan = cantBocasWan;
        this.cantAntenas = cantAntenas;
    }
    
    
    
    public boolean conectarIsp(Isp isp){
        boolean flag = true;
        if(cantBocasWan <= 0)
            flag = false;
        if (flag)
            cantBocasWan--;
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



}
