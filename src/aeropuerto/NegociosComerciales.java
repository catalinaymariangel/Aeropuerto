
package aeropuerto;


public class NegociosComerciales {
private String nombre;
    private int cantidadDeEmpleados;
    private String tipoDeVenta;
    
    
    public NegociosComerciales (String nombre,int cantidadDeEmpleados,
            String tipoDeVenta){
        this.nombre = nombre;
        this.cantidadDeEmpleados = cantidadDeEmpleados;
        this.tipoDeVenta = tipoDeVenta;
    
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadDeEmpleados() {
        return cantidadDeEmpleados;
    }

    public void setCantidadDeEmpleados(int cantidadDeEmpleados) {
        this.cantidadDeEmpleados = cantidadDeEmpleados;
    }

    public String getTipoDeVenta() {
        return tipoDeVenta;
    }

    public void setTipoDeVenta(String tipoDeVenta) {
        this.tipoDeVenta = tipoDeVenta;
    }

}
