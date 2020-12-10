import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
                menu();
    }

    private static void menu() {

        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        int opcion; //opcion que ha elegido el usuario

        while(!salir){
            System.out.println("Opción 1: Sumar 2 numeros");
            System.out.println("Opción 2: Restar 2 numeros");
            System.out.println("Opción 3: Multiplicar 2 numeros");
            System.out.println("Opción 4: Salir del programa");
            System.out.println("Selecciona una opción: ");
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Suma!");
                    suma();
                    break;
                case 2:
                    System.out.println("Resta!");
                    restar();
                    break;
                case 3:
                    System.out.println("Multiplicacion");
                    multi();
                    break;
                case 4:
                    System.out.println("Salir");
                    salir=true;
                    break;
                default:
                    System.out.println("Selecciona un número entre 1 y 4");
            }

        }

    }

    private static void suma() {
        System.out.println("Aquí va la suma");
    }

    private static void restar(){
        System.out.println("Estoy en la resta");
}

    private static void multi(){
        System.out.println("Estoy en la resta");
    }

}
