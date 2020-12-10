import java.util.Scanner;

public class Ej11 {
    public static void main(String[] args) {
        int numero;
        int contador = 1;

        do {

            Scanner lecturateclado = new Scanner(System.in);
            System.out.print("Numero " + contador + ": ");
            numero = lecturateclado.nextInt();

            int cuadrado = numero * numero;
            int cubo = numero * numero * numero;
            contador++;
            System.out.println( "|" + numero + "|" + cuadrado + "|" + cubo + "|");

        } while (contador <= 5);




    }
}
