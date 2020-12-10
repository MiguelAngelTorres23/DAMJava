import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {

        Scanner lecturateclado = new Scanner(System.in);
        System.out.println("Escribe el dia");
        var palabra = lecturateclado.nextLine();

        if (palabra.equals("Lunes") || palabra.equals("Martes") || palabra.equals("Jueves")){
            System.out.println("Toca FOL a pirmera hora");
        }else if (palabra.equals("Miercoles")) {
            System.out.println("Toca Programacion a primera hora");
        }else if (palabra.equals("Viernes")){
            System.out.println("Toca Sistemas a primera hora");
        }else {
            System.out.println("Palabra introduciada no valida, porfavor escriba la primera palabra en mayúsculas");
        }


    }
}
