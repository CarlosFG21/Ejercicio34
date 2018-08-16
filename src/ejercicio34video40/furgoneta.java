
package ejercicio34video40;

import java.util.*;

public class furgoneta extends Vehiculo {
    
  private int capacidad_carga;
  
    private int plaza_extra;
    
    public furgoneta(int plazas_extra,int capacidad_carga){
        
        super();
        
        this.capacidad_carga = capacidad_carga;
        
        this.plaza_extra = plaza_extra;
       
    }
    
    public String dimeDatosFurgoneta(){
        
        return "LA CAPACIDAD DE CARGA ES: " + capacidad_carga + " Y LAS PLAZAS SON : " +
                plaza_extra;
    }
}
