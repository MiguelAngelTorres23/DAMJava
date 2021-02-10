import java.util.*;
import java.util.Collection;

/**
 * PACKAGE_NAME
 * Nombre_project: DAMJava
 * Estanteria
 * Created by: magua
 * Date : 09/02/2021
 * Description:
 **/
public class Estanteria {

    public Libro libro;
    public String Titol;
    ArrayList<Libro> arrayEstanteria = new ArrayList<Libro>(10);

    public void AfegirLlibre(Libro libro){
        if (arrayEstanteria.size() < 10){
            arrayEstanteria.add(libro);
        }else {
            System.out.println("Lo siento la estanteria esta llena");
        }
    }

    public void EliminarAutor(String Autor){
        for (int i = 0; i < arrayEstanteria.size() ; i++) {
            if (arrayEstanteria.get(i) !=null && arrayEstanteria.get(i).getAutor().equals(Autor)){
                arrayEstanteria.set(i,null);
            }
        }
    }

    public void EliminarTitulo(String Titulo){
        for (int i = 0; i < arrayEstanteria.size() ; i++) {
            if (arrayEstanteria.get(i) !=null && arrayEstanteria.get(i).getTitol().equals(Titulo)){
                arrayEstanteria.set(i,null);
            }
        }
    }

    public void Top10(){

        arrayEstanteria.sort(Comparator.comparing(Libro::getQualificació));
        Collections.reverse(arrayEstanteria);
        VeuresEstanteria();

    }

    public void VeuresEstanteria(){
        for (int i = 0; i < arrayEstanteria.size() ; i++) {
            System.out.println(arrayEstanteria.get(i));

        }

    }


    public static void main(String[] args) {
        Libro libro1 = new Libro("HOLA", "pedro", 1);
        Libro libro2 = new Libro("uo", "marcelo", 2);
        Estanteria estanteria = new Estanteria();
        estanteria.AfegirLlibre(libro1);
        estanteria.AfegirLlibre(libro2);
        //estanteria.Top10();
        estanteria.VeuresEstanteria();


    }

}
