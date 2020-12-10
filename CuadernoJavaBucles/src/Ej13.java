import javax.management.loading.MLetContent;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej13 {
    public static void main(String[] args) {
        int numero;
        int contador = 1;
        int contadornegativo = 0;
        int contadorpositivo = 0;

       try {


           while (contador <= 10) {

               Scanner lecturateclado = new Scanner(System.in);
               System.out.print("Numero " + contador + ": ");
               numero = lecturateclado.nextInt();

               if (numero < 0) {
                   contadornegativo++;
               } else {
                   contadorpositivo++;
               }
               contador++;
           }

           System.out.println("Tenemos " + contadornegativo + " numeros negativos");
           System.out.println("Tenemos " + contadorpositivo + " numeros positivos");
       }catch (InputMismatchException e){
           System.out.println("Pon un numero");
       }
    }
}
