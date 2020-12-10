import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        Scanner lecturateclado = new Scanner(System.in);
        final int CONTRA = 1234;
        int mal = 0;
        int ContraU;

        do {
            System.out.println("Porfavor ponga la contraseña");
            ContraU = lecturateclado.nextInt();
            //System.out.println("La contraseña escrita es " + ContraU);
            if (ContraU == CONTRA) {
                System.out.println("Contraseña correcta, tenga un buen dia");
                break;
            } else {
                System.out.println("Lo siento contraseña incorrecta");
                mal ++;
                if (mal == 4){
                    System.out.println("Su cuenta a sido bloqueada por fallar más de 3 veces");
                }
            }
        } while (mal < 4);


    }
}
