import java.util.*;

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
            if (arrayEstanteria.get(i).getAutor().equals(Autor)){
                arrayEstanteria.remove(i);
            }
        }
    }

    public void EliminarTitulo(String Titulo){
        for (int i = 0; i < arrayEstanteria.size() ; i++) {
            if (arrayEstanteria.get(i).getTitol().equals(Titulo)){
                arrayEstanteria.remove(i);
            }
        }
    }

    public void Top10(){
        System.out.println("-----------------------------TOP 10 -------------------------------");
        ArrayList<Libro> listaordenada = new ArrayList<>();
         listaordenada.addAll(arrayEstanteria);
        listaordenada.sort(Comparator.comparing(Libro::getQualificació));
        Collections.reverse(listaordenada);
        VeuresEstanteria(listaordenada);

    }

    private void VeuresEstanteria(ArrayList <Libro> Estanteria) {
        for (int i = 0; i < Estanteria.size(); i++) {
            System.out.println(Estanteria.get(i));
        }
    }

    public void VeuresEstanteriaNormal(){
        System.out.println("------------------------NORMAL --------------------------------");
        for (int i = 0; i < arrayEstanteria.size() ; i++) {
            System.out.println(arrayEstanteria.get(i));
        }
    }


    public static void main(String[] args) {
        Libro libro1 = new Libro("HOLA", "pedro", 1);
        Libro libro2 = new Libro("Adios", "fran", 10);
        Libro libro3 = new Libro("Buenas", "ramon", 4);
        Libro libro4 = new Libro("Tarde", "juan", 2);
        Libro libro5 = new Libro("Gente", "patrick", 3);
        Estanteria estanteria = new Estanteria();
        estanteria.AfegirLlibre(libro1);
        estanteria.AfegirLlibre(libro2);
        estanteria.AfegirLlibre(libro3);
        estanteria.AfegirLlibre(libro4);
        estanteria.AfegirLlibre(libro5);
        estanteria.Top10();
        estanteria.EliminarTitulo("Buenas");
        estanteria.VeuresEstanteriaNormal();






    }

}
