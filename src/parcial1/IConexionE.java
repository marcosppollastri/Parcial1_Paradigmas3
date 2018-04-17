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
public interface IConexionE {

    public Boolean conectarServer(Servidor servidor);
    public Boolean conectarImpresora(Impresora impresora);
    public Boolean conectarNotebook(Notebook notebook);
    public Boolean conectarPc(Pc pc);


}
