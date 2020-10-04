
package aeropuerto;

public class AeropuertoBaseAerea extends Aeropuerto {

        private boolean munisionArtilleria;
        private int aeronavesDeGuerra;
        private boolean tallerMantenimiento;
        private String funcionarioACargo;


public AeropuertoBaseAerea(String nombre,
            String ciudadUbicacion,
            boolean vuelosVip,
            boolean munisionArtilleria,
            int cantidadDeVuelosAlDia, 
            int aeronavesDeGuerra,
            boolean tallerMantenimiento,
            String funcionarioACargo,
            Date fechaDeApertura) {
        super(nombre, ciudadUbicacion, cantidadDeVuelosAlDia, fechaDeApertura, 
        vuelosVip);
        this.aeronavesDeGuerra = aeronavesDeGuerra;
        this.funcionarioACargo = funcionarioACargo;
        this.munisionArtilleria = munisionArtilleria;
        this.tallerMantenimiento = tallerMantenimiento;
                
    }

/** Este método coloca como true el atributo de municionArtilleria()
     * e incrementa en 6000 el atributo de aeronavesDeGuerra()
     */
    public void recarga (){
        this.aeronavesDeGuerra =+ 6000;
        this.munisionArtilleria = true;
    }
    
    /** El método "agenda" coloca como true el atributo tallerMantenimiento()
     * e indica el nombre de la persona en el atributo funcionarioACargo()
     */
    public void agenda (String nombreAsignado){
        this.tallerMantenimiento = true;
        this.funcionarioACargo =  nombreAsignado;
    }

    public static void main (String[] args){
        AeropuertoBaseAerea aBA = new AeropuertoBaseAerea ("Solpin","Medellín",
        false, true,100,6000,true,"Mario",new Date());
        
        aBA.ventaDeTiques();
      
              
    }


}
