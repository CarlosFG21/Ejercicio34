/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio34video40;

import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class Ejercicio34Video40 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Vehiculo al = new Vehiculo();
       
       al.esteblaece_color("ROJO");
       
       furgoneta mifurgoneta1 = new furgoneta(7,580);
       
       mifurgoneta1.esteblaece_color("AZUL");
       
       mifurgoneta1.configura_asientos("si");
       
       mifurgoneta1.configura_climatizador("si");
       
       System.out.println(al.dime_datos_generales() + " " + al.dime_color());
       
       System.out.println(mifurgoneta1.dime_datos_generales() +
               mifurgoneta1.dimeDatosFurgoneta());
        
    }
    
}
