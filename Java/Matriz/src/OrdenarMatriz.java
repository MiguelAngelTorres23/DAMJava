import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * PACKAGE_NAME
 * Nombre_project: DAMJava
 * OrdenarMatriz
 * Created by: magua
 * Date : 18/12/2020
 * Description:
 **/
public class OrdenarMatriz {

    public static void main(String[] args) {

        int[] matriz = new int[]{30, 20, 50, 10, 40};


         for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz.length - 1; j++) {

                if (matriz[j] > matriz[j + 1]) {
                    int numero = matriz[j + 1];
                    matriz[j + 1] = matriz[j];
                    matriz[j] = numero;
                }
            }
        }
        System.out.println(Arrays.toString(matriz));
    }
}



