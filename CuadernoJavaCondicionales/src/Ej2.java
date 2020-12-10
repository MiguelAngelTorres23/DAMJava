import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        int hora;
        Scanner lecturateclado = new Scanner(System.in);
        System.out.println("Pon la hora");
        hora = lecturateclado.nextInt();

        if (hora >= 6 && hora <= 12){
            System.out.println("Bon Dia");
        } else if (hora >= 13 && hora <= 19){
            System.out.println("Bona Tarda");
        } else if (hora >= 20 && hora <= 22){
            System.out.println("Bon Vespre");
        } else{
            System.out.println("Bona Nit");
        }

    }
}
