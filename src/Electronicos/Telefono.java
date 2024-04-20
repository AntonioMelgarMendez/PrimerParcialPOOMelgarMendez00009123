package Electronicos;

import Articulo.Articulo;

public class Telefono extends Articulo implements Vendible{
    private float screenSize;
            private String OSversion;
            private String batteryLife;

    public Telefono(float screenSize, String OSversion, String batteryLife,Articulo articulo) {
        super(articulo);
        this.screenSize = screenSize;
        this.OSversion = OSversion;
        this.batteryLife = batteryLife;
    }


    @Override
    public double getPrecio() {
        return 0;
    }

    @Override
    public void showDescripcion() {

    }
}
