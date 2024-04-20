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

    public Laptop(Articulo articulo, String processor, double ramsize, String graphicard) {
        super(articulo);
        this.processor = processor;
        this.ramsize = ramsize;
        this.graphicard = graphicard;
    }

    @Override
    public double getPrecio() {
        return 0;
    }

    @Override
    public void showDescripcion() {

    }
}
