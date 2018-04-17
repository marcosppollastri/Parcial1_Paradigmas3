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
public abstract class Dispositivo implements IConexionD, IConexionE{
    
   protected String mac;
   protected String modelo;
   protected String tipo;
   protected float velocidad;
   protected String normaEthernet;
   protected int bocas;
   protected String ip;
   protected ArrayList<String> macDispositivosConectados;
   
   
    
}
