
package ejercicio34video40;


public class Vehiculo {
    
    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso_plataforma;
    private String color;
    private int peso_total;
    private boolean asientos_cuero,climatizador;
    
    public Vehiculo(){
        
        ruedas = 4;
        largo= 2000;
        ancho=300;
        motor=1600;
        peso_plataforma=500;
    }
    
    public String dime_datos_generales(){
        
        return "LA PLATAFORMA DEL VEHICULO TIENE " + ruedas + " RUEDAS " +
                ".MIDE " + largo/1000 + " METROS CON UN ANCHO DE " + ancho + 
                " CM Y UN PESO DE PLATAFORMA DE " + peso_plataforma + " KG ";
    }
    
    public void esteblaece_color(String color_coche){
        
        color = color_coche;
    }
    
    public String dime_color(){
        
        return " EL COLOR DEL COCHE ES " + color;
    }
    
    public void configura_asientos(String asientos_cuero){
        
        if(asientos_cuero.equalsIgnoreCase("si")){
            
            this.asientos_cuero=true;
        }else{
            
            this.asientos_cuero=false;
            
        }
        
    }
    
    public String dime_asientos(){
        
        if(asientos_cuero==true){
            
            return "EL COCHE TIENE ASIENTOS DE CUERO";
        }else{
            
            return "EL COCHE TIENE ASIENTOS DE SERIE";
        }
    }
    
    public void configura_climatizador(String climatizador){
        
        if(climatizador.equalsIgnoreCase("si")){
            
            this.climatizador=true;
        }else{
            this.climatizador=false;
        }
        
    }
    
    public String dime_climatizador(){
        
        if(climatizador==true){
            
            return "EL COCHE INCORPORA CLIMATIZADOR";
        }else{
            return "EL COCHE LLEVA AIRE ACONDICIONADO";
        }
    }
    
    public String dime_peso_coche(){
        
        int peso_carroceria=500;
        
        peso_total = peso_plataforma+peso_carroceria;
        
        if(asientos_cuero==true){
            
            peso_total=peso_total+50;
        }
        if(climatizador==true){
            peso_total=peso_total+20;
        }
        
        return "EL PESO DEL COCHE ES " + peso_total;
    }
}
