import java.util.Scanner;

public class Ej9 {
    // MEJORABLE / MAL
    public static void main(String[] args) {

        Scanner lecturateclado = new Scanner(System.in);
        System.out.println("Ponga la palabra");
        String palabra = lecturateclado.nextLine();
        char [] ch = palabra.toCharArray();
        int contador = 0;

        for (int i = 0; i < ch.length; i++){

            contador++;
        }
        System.out.println(contador);
    }
    }
