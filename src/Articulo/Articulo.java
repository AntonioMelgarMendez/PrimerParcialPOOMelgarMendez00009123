package Articulo;

public abstract class Articulo {

    private String nombre;

    private String modelo;
    private String descripcion;
    private double precio;
    public static int  contador;
    public  int id=0;

    public Articulo(Articulo articulo) {
        nombre =articulo.nombre;
        modelo = articulo.modelo;
        descripcion = articulo.descripcion;
        precio = articulo.precio;
        id= contador();
    }
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
