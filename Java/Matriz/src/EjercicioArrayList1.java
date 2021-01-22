import java.util.ArrayList;
/**
 * PACKAGE_NAME
 * Nombre_project: DAMJava
 * ArrayList
 * Created by: magua
 * Date : 12/01/2021
 * Description:
 **/
public class EjercicioArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();

        a.add("Manuel");
        a.add("Pedro");
        a.add("Juanma");
        a.add("Miguel");

        for (String nombre : a) {
            System.out.println(nombre);
        }

    }
}
