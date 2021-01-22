import java.io.*;

/**
 * PACKAGE_NAME
 * Nombre_project: DAMJava
 * Ficheros
 * Created by: magua
 * Date : 19/01/2021
 * Description:
 **/
public class Ficheros {

    public static void main(String[] args) {

        //LECTURA

       /** try {
            FileReader r = new FileReader("C:\\Users\\magua\\OneDrive\\Escritorio\\hola.txt");
            BufferedReader buffer = new BufferedReader(r);
            System.out.println(buffer.readLine());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }**/


    //ESCRITURA
    try {
        FileWriter w = new FileWriter("C:\\Users\\magua\\OneDrive\\Escritorio\\hola.txt");
        BufferedWriter buffer = new BufferedWriter(w);
        System.out.println(buffer.write());
    } catch (IOException e) {
        System.out.println(e.getMessage());
    }


}



