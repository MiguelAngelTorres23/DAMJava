import java.util.Scanner;

/**
 * PACKAGE_NAME
 * Nombre_project: DAMJava
 * ParkingTest_MiguelAngel_Torres
 * Created by: magua
 * Date : 23/01/2021
 * Description:
 **/
public class ParkingTest_MiguelAngel_Torres {

        /** Aqui tenemos un metodo main con mi menus donde nos da varias opciones para elegir por consola. Con un bucle while que no parará
         * hasta que le den a salir **/
    public static void main(String[] args) throws Exception {

        Parking_MiguelAngel_Torres prueba1 = new Parking_MiguelAngel_Torres(5,5);
        String path;
        Scanner consola = new Scanner(System.in);
        if (args.length > 0){
            prueba1.llegirMatricules(args[0]);
        }
        boolean bucle = true;
        while (bucle){
            try {
                System.out.println(" ------------------------- Bienvenido a TU PARKING ------------------------- ");
                System.out.println("Que deseas hacer ?");
                System.out.println("1 Omplir parking a partir de fitxer \n2 Entrar Cotxe \n3 Entrar Cotxe Discapacitat \n4 Surtir Cotxe" +
                        "\n5 Surtir Cotxe Discapacitat \n6 Guardar lista de matricules en fitxer \n7 Sortir");
                System.out.print("Elige la opcion: ");
                switch (Integer.parseInt(consola.nextLine())) {
                    case 1:
                        System.out.println("Cual es la ruta del archivo?");
                        path = consola.nextLine();
                        prueba1.llegirMatricules(path);
                        break;
                    case 2:
                        System.out.println("Cual es la matricula que quiere introducir: ");
                        String matricula = consola.nextLine();
                        prueba1.entradaCotxe(matricula);
                        break;
                    case 3:
                        System.out.println("Cual es la matricula que quiere introducir: ");
                        String matriculaDisc = consola.nextLine();
                        prueba1.entradaCotxeDiscapacitat(matriculaDisc);
                        break;
                    case 4:
                        System.out.println("Cual es la matricula que quieres que salga: ");
                        matricula = consola.nextLine();
                        prueba1.surtCotxe(matricula);
                        break;
                    case 5:
                        System.out.println("Cual es la matricula que quieres que salga: ");
                        matriculaDisc = consola.nextLine();
                        prueba1.surtCotxeDiscapacitats(matriculaDisc);
                        break;
                    case 6:
                        System.out.println("Donde lo quiere guardar: ");
                        path = consola.nextLine();
                        prueba1.guardarMatricula(path);
                        break;
                    case 7:
                        bucle = false;
                        break;
                }
            }catch (Exception e){
                System.out.println(e.getMessage());
            }

        }
    }
}
