
package aeropuerto;

import java.util.Date;


public class Aeropuerto {
    
    private String nombre;
    private String ciudadUbicacion;
    private int cantidadDeVuelosAlDia;
    private Date fechaDeApertura;
    private boolean vuelosVip; 


/**atributos de composición*/
private NegociosComerciales economia = null;
    private PistaAerea zonaEspecial;


    public Aeropuerto(String nombre, 
            String ciudadUbicacion, 
            int cantidadDeVuelosAlDia,
            Date fechaDeApertura,
            boolean vuelosVip) {
        this.nombre = nombre;
        this.ciudadUbicacion = ciudadUbicacion;
        this.cantidadDeVuelosAlDia = cantidadDeVuelosAlDia;
        this.fechaDeApertura = fechaDeApertura;
        this.vuelosVip = vuelosVip;


this.zonaEspecial = new PistaAerea (true,"200 metros");
    }
    

public PistaAerea getzonaEspecial (){
        return this.zonaEspecial;
    }
    
    
    public NegociosComerciales geteconomia (){
        return this.economia;
    }
    
    
    public void seteconomia (NegociosComerciales i){
        this.economia = i;
    }


    /**
     Este método aumenta el número de vuelos al día en 2000 y 
     *posibilita los vuelos VIP
     */
    
    public void ventaDeTiques(){
        this.cantidadDeVuelosAlDia += 2000;
        this.vuelosVip = true;
    }
    
    /**
     Este método posbilita el cambio de la fecha de apertura después de
     * la pandemia y cambiar el nombre del Aeropuerto
     * @param nuevaFecha es la nueva fecha de apertura después de la pandemia
     * @param nuevoNombre es el nuevo nombre del Aeropuerto
     */
    
    public void reapertura(Date nuevaFecha, 
            String nuevoNombre){
            this.nombre = nuevoNombre;
            this.fechaDeApertura = nuevaFecha;
                    
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudadUbicacion() {
        return ciudadUbicacion;
    }

    public void setCiudadUbicacion(String ciudadUbicacion) {
        this.ciudadUbicacion = ciudadUbicacion;
    }

    public int getCantidadDeVuelosAlDia() {
        return cantidadDeVuelosAlDia;
    }

    public void setCantidadDeVuelosAlDia(int cantidadDeVuelosAlDia) {
        this.cantidadDeVuelosAlDia = cantidadDeVuelosAlDia;
    }

    public Date getFechaDeApertura() {
        return fechaDeApertura;
    }

    public void setFechaDeApertura(Date fechaDeApertura) {
        this.fechaDeApertura = fechaDeApertura;
    }

    public boolean getVuelosVip() {
        return vuelosVip;
    }

    public void setVuelosVip(boolean vuelosVip) {
        this.vuelosVip = vuelosVip;
    }
    
    
    
    


    public static void main(String[] args) {
        Aeropuerto aeropuertoinf = new Aeropuerto( "Airmarcat",
                "Cali",3000,new Date(),true);
        
        Aeropuerto aeropuertoinf1 = new Aeropuerto("Catmarair",
                "Bogota",5000,new Date(),false);
        
        System.out.println(aeropuertoinf.getNombre());
        System.out.println(aeropuertoinf.getCantidadDeVuelosAlDia());
        System.out.println(aeropuertoinf.getVuelosVip());
        
        aeropuertoinf.ventaDeTiques();
        
        System.out.println(aeropuertoinf.getNombre());
        System.out.println(aeropuertoinf.getCantidadDeVuelosAlDia());
        System.out.println(aeropuertoinf.getVuelosVip());

Dueño Alexandra = new Dueño ("Pollo Krik",20,"comida",7,true);
        
    }
    
}
