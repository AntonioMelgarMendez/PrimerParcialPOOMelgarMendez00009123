import Articulo.Articulo;
import Electronicos.Laptop;
import Electronicos.Telefono;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Articulo> Articulos = new ArrayList<Articulo>();
        mostrarmenu();
    }
    public static void mostrarmenu(){
        try {
            System.out.println("ElectroMarket");
            System.out.println("1. Agregar articulo");
            System.out.println("2. Modificar articulo");
            System.out.println("3. Consulta articulo");
            System.out.println("4. Mostrar todos los  articulo");
            boolean salir= true;
            Scanner sn = new Scanner();
            int opcion = sn.nextInt();
            while(salir){
                switch(opcion){
                    case 1:
                        if(tipoarticulo()==1){
                            System.out.println("ElectroMarket");
                            System.out.println("Inserte nombre");
                            System.out.println("Inserte modelo");
                            System.out.println("Inserte descripcion");
                            System.out.println("Inserte precio");
                            System.out.println("Inserte scrensize");
                            System.out.println("Inserte batterylife");
                            System.out.println("Inserte osversion");


                            Articulo celular = new Telefono();

                        } else if (tipoarticulo()==2) {
                            System.out.println("ElectroMarket");
                            System.out.println("Inserte nombre");
                            System.out.println("Inserte modelo");
                            System.out.println("Inserte descripcion");
                            System.out.println("Inserte procesor");
                            System.out.println("Inserte ramsize");
                            System.out.println("Inserte graphicard");
                            Articulo laptop = new Laptop();
                        }
                        break;
                    case 2:

                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        salir = false;
                        break;


                }
            }



        }
        catch(InputMismatchException e){
            System.out.println("No se inserto una opcion validad, intente de nuevo");
        }
    }
    public static int tipoarticulo(){
        System.out.println("ElectroMarket");
        System.out.println("1.Celular");
        System.out.println("2.Laptop");
        System.out.println("Inserte tipo articulo:");
        Scanner sn = new Scanner();
        int opcion = sn.nextInt();
        return  opcion;

    }
    public void consultar(int e, ArrayList<Articulo> articulos){
        for(int i=0;i < articulos.size();i++){
            if(articulos) {
                System.out.println("Nombre:");
                System.out.println("Modelo:");
                System.out.println("Descripcion:");
                System.out.println("Precio:");


            }
        }
    }
}
