import java.util.Scanner;

public class Ej10 {
    public static void main(String[] args) {

        boolean bucle = true;
        int numero;
        int contador = 0;
        int sum = 0;

        //Este bucle nos proporciona un bucle "infinito" siempre y cuando la variable bucle sea true.

        while (bucle) {
                //Scanner utilizado para pregutar una pregunta y lo que se introduzca se guarde en una variable
                Scanner lecturateclado = new Scanner(System.in);
                System.out.println("Introduzca el numero");
                numero = lecturateclado.nextInt();

                // Una vez tenemos el numero vemos si es mayor que 0 hara lo que està dentro del if
            if (numero > 0) {
                //Le suma 1 cada vez a contador
                contador++;

                //Cuenta suma el numero introducido mas 0 en el primer caso
                int cuenta = numero + sum;
                //sum pasa a ser la suma de numero ma+sum por lo tanto al siguiente paso sum valdria el resultado anterior
                sum = cuenta;

                //System.out.println(sum);
            }else {
                //Si es menor a se pare el bucle ya que while bucle = folsa y haria la operacion mitjana y la enseñaria por pantalla
                bucle = false;
                int mitjana = sum / contador;
                System.out.println("La mitjana de los numeros introducidos son " + mitjana);

            }




        }

    }
}
