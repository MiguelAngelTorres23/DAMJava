import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {
        Scanner lecturateclado = new Scanner(System.in);
        int numero;
        final int contador = 2;
        do {

            System.out.println("Introduzca el numero");
            numero = lecturateclado.nextInt();

            if (0 <= numero && numero <= 9) {
                for (int mutiplicador = 0; mutiplicador <= 10; mutiplicador++) {
                    int multi = numero * mutiplicador;
                    System.out.println(numero + "x" + mutiplicador + " = " + multi);
                }

                break;

            } else {
                System.out.println("Numero incorrecto");
            }

        } while (contador > 1 );
    }
}
