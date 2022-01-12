package modelo;

public class Audio {

    String nombre;
    String contenido;
    String ruta;

    public Audio(String nombre, String contenido, String ruta) {
        this.nombre = nombre;
        this.contenido = contenido;
        this.ruta = ruta;
    }

    public Audio() {
        this.nombre = "";
        this.contenido = "";
        this.ruta = "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

}
