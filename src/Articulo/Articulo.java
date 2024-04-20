package Articulo;

public abstract class Articulo {

    protected String nombre;

    protected String modelo;
    protected String descripcion;
    protected double precio;
    public static int  contador;
    public  int id=0;


    public static int contador(){
       return contador ++;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    public void setPrecio(double precio) {
        this.precio = precio;
    }


}
