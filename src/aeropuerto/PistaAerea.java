

package aeropuerto;

public class PistaAerea {
private Boolean contieneSeñalizacion;
    private String metros;
    
    
    public PistaAerea (Boolean contieneSeñalizacion,String metros){
        this.contieneSeñalizacion = contieneSeñalizacion;
        this.metros = metros;
    }

    public Boolean getContieneSeñalizacion() {
        return contieneSeñalizacion;
    }

    public void setContieneSeñalizacion(Boolean contieneSeñalizacion) {
        this.contieneSeñalizacion = contieneSeñalizacion;
    }

    public String getmetros() {
        return metros;
    }

    public void setmetros(String metros) {
        this.metros = metros;
    }

}
