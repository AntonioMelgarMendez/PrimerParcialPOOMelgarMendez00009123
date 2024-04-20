package Electronicos;

import Articulo.Articulo;

public class Telefono extends Articulo implements Vendible{
    private float screenSize;
            private String OSversion;
            private String batteryLife;

    public Telefono(String nombre, String modelo, String descripcion, double precio,float screenSize, String OSversion, String batteryLife) {
        this.nombre= nombre;
        this.modelo = modelo;
        this.descripcion = descripcion;
        this.precio=precio;
        this.screenSize = screenSize;
        this.OSversion = OSversion;
        this.batteryLife = batteryLife;
    }


    @Override
    public void getPrecio() {
        System.out.println("Precio de la laptop" + precio);

    }

    @Override
    public void showDescripcion() {
        System.out.println("Nombre:"+nombre);
        System.out.println("Modelo:"+modelo);
        System.out.println("Descripcion:"+descripcion);
        getPrecio();
        System.out.println("Screensize:"+screenSize);
        System.out.println("Batterylife:"+batteryLife);

    }
}
