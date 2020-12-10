import java.util.Scanner;

public class Ej12 {
    public static void main(String[] args) {

        int NumeroU;
        int primero = 0;
        int contador = 0;
        int segundo = 1;
        boolean bucle = true;


            Scanner lecturateclado = new Scanner(System.in);
            System.out.print("Pon el numero: ");
            NumeroU = lecturateclado.nextInt();


        while (bucle) {
            int suma = primero + segundo;
            segundo = primero;
            primero = suma;

            contador++;
            System.out.print(suma + " ");

            if (contador == NumeroU) {
                bucle = false;
            }
        }



    }
}
