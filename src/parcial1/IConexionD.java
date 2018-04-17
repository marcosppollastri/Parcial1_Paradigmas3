/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1;

/**
 *
 * @author
 * Marcos J. Peña Pollastri
 * Emanuel A. Cortez Mercado
 * Martín L. Castellitto Secreto
 * Jesus G. Kuti   
 */
public interface IConexionD {
  /*public Boolean conectarDispositivo(Dispositivo dispositivo);
  public Boolean conectarEquipo(Equipo equipo);*/

  public Boolean conectarSwitch(Switch marianita);
  public Boolean conectarRouter(Router router);
  public Boolean conectarHub(Hub hub);
  public Boolean conectarAccessPoint(AccessPoint ap);
}
