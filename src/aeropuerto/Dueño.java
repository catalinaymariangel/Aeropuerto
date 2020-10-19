

package aeropuerto;


public class Dueño extends NegociosComerciales {
    private int cantidadDeAñosLaborando;
    private Boolean buenasVentas;

    public Dueño(String nombre, int cantidadDeEmpleados, String tipoDeVenta,
            int cantidadDeAñosLaborando, Boolean buenasVentas) {
        super(nombre, cantidadDeEmpleados, tipoDeVenta);
        
        this.cantidadDeAñosLaborando = cantidadDeAñosLaborando;
        this.buenasVentas = buenasVentas;
    }
}
