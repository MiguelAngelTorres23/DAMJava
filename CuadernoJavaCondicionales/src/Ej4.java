import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        int horas;
        int precio;
        Scanner lecturateclado = new Scanner(System.in);
        System.out.println("Cuantas horas has trabajado este mes?");
        horas = lecturateclado.nextInt();
        if (horas < 40){
            precio = horas * 12;
            System.out.println("Vas a cobrar: " + precio + "€");

        }else if (horas > 40){
            precio = 40 * 12;
            int resta = horas - 40;
            resta = resta * 16;
            int solucion = resta + precio;
            System.out.println("Vas a cobrar: " + solucion + "€");

        }
    }
}
