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
        mostrarmenu(Articulos);
    }
    public static void mostrarmenu(ArrayList<Articulo> articulos){
        try {
            boolean salir= true;
            while(salir){
                System.out.println("ElectroMarket");
                System.out.println("1. Agregar articulo");
                System.out.println("2. Modificar articulo");
                System.out.println("3. Consulta articulo");
                System.out.println("4. Mostrar todos los  articulo");

                Scanner sn = new Scanner(System.in);

                int opcion1 = sn.nextInt();

                switch(opcion1){
                    case 1:
                        System.out.println("ElectroMarket");
                        System.out.println("Inserte nombre");
                        String nombre= sn.nextLine();
                        sn.nextLine();
                        System.out.println("Inserte precio");
                        float precio= sn.nextFloat();

                        System.out.println("Inserte descripcion");
                        String descripcion= sn.nextLine();
                        sn.nextLine();
                        System.out.println("Inserte modelo");
                        String modelo= sn.nextLine();

                        int tipoescogido = tipoarticulo();
                        if(tipoescogido==1){

                            System.out.println("Inserte scrensize");
                            int screensize= sn.nextInt();

                            System.out.println("Inserte batterylife");
                            String battery= sn.nextLine();
                            sn.nextLine();
                            System.out.println("Inserte osversion");
                            String os= sn.nextLine();


                            Articulo celular = new Telefono(nombre,modelo,descripcion,precio,screensize,battery,os);
                            articulos.add(celular);

                        } else if (tipoescogido==2) {

                            System.out.println("Inserte procesor");
                            String processor= sn.nextLine();
                            System.out.println("Inserte ramsize");
                            double ramsize = sn.nextDouble();

                            System.out.println("Inserte graphicard");
                            String graphicard= sn.nextLine();
                            sn.nextLine();
                            Articulo laptop = new Laptop(nombre,modelo,descripcion,precio,processor,ramsize,graphicard);
                            articulos.add(laptop);

                        }
                        break;
                    case 2:
                        System.out.println("Inserte numero a buscar ");
                        int opcion2 = sn.nextInt();
                        consultar(opcion2, articulos);
                        break;
                    case 3:
                        System.out.println("Inserte numero a buscar ");
                        int opcion3 = sn.nextInt();
                         consultar(opcion3,articulos);
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
        Scanner sn = new Scanner(System.in);
        int opcion = sn.nextInt();
        return  opcion;

    }
    public static void modificarprecio(){

    }
    public static void consultar(int e, ArrayList<Articulo> articulos){
        for(int i=0;i < articulos.size();i++){
           if(articulos[i].){

           }

        }
    }
}
