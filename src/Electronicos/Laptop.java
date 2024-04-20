package Electronicos;

import Articulo.Articulo;

public class Laptop extends Articulo implements Vendible{

    private String processor;
    private double ramsize;
    private String graphicard;
    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public double getRamsize() {
        return ramsize;
    }

    public void setRamsize(double ramsize) {
        this.ramsize = ramsize;
    }

    public String getGraphicard() {
        return graphicard;
    }

    public void setGraphicard(String graphicard) {
        this.graphicard = graphicard;
    }

    public Laptop(String nombre, String modelo, String descripcion, double precio, String processor, double ramsize, String graphicard) {
        this.nombre= nombre;
        this.modelo = modelo;
        this.descripcion = descripcion;
        this.precio=precio;
        this.processor = processor;
        this.ramsize = ramsize;
        this.graphicard = graphicard;
    }

    @Override
    public void getPrecio() {
        System.out.println("Precio del telefono" + precio);

    }

    @Override
    public void showDescripcion() {
        System.out.println("Nombre:"+nombre);
        System.out.println("Modelo:"+modelo);
        System.out.println("Descripcion:"+descripcion);
        getPrecio();
        System.out.println("Procesor:"+processor);
        System.out.println("Ramsize:"+ramsize);
        System.out.println("Graphicard:"+graphicard);

    }
}
