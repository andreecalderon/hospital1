package model;

public class datasalas {
    private  String estado;
    private String nombre;

    public datasalas(String estado,String nombre){
        this.estado=estado;
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
