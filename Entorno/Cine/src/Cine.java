import Pelicula.Pelicula;
import java.util.ArrayList;
import java.util.Random;

/**
 * PACKAGE_NAME
 * Nombre_project: DAMJava
 * Cine
 * Created by: magua
 * Date : 22/01/2021
 * Description:
 **/
public class Cine {

    public Pelicula pelicula;
    public double dinero;
    public  int dineroObtenido;
    public Espectador espectador;
    ArrayList<Integer> arrayCine = new ArrayList<Integer>(72);
    ArrayList<String> arrayEspectador = new ArrayList<String>(72);

    public Cine(Pelicula pelicula, int dinero){
        this.dinero = dinero;
        this.pelicula = pelicula;
    }

    public int getDineroObtenido() {
        return dineroObtenido;
    }

    public void Asientos (){

        /** Guarda las 72 posiciones con un numero de 1 al 72**/
        for (int i = 0; i < 72 ; i++) {
            arrayCine.add(arrayCine.indexOf(i));

        }

        for (int i = 0; i < 72 ; i++) {
            arrayEspectador.add("Libre");
        }


    }

    public void Espectadores(){

        while (arrayEspectador.contains("Libre")){
            Espectador espectador = new Espectador();
            Sala(espectador,pelicula);
        }
    }

    public void Sala (Espectador espectador, Pelicula pelicula){
       int ramdom = (int) (Math.random() * 72);
        if (espectador.getEdad() >= pelicula.edadminima && espectador.getDiners() >= dinero);
        {
                if (arrayEspectador.get(ramdom) == "Libre" ){
                    arrayEspectador.set(ramdom,"Ocupado");
                    dineroObtenido += dinero;
                }
        }
        Espectadores();
    }




    public static void main(String[] args) {

        long tiempo = System.currentTimeMillis();
        Pelicula pelicula = new Pelicula();
        Cine cine = new Cine(pelicula, 5);
        cine.Asientos();
        cine.Espectadores();
        System.out.println("Titulo:  " + pelicula.titol);
        System.out.println("Director: " + pelicula.director);
        System.out.println("Duracion: " + pelicula.durada);
        System.out.println("Edad minima: " + pelicula.edadminima);
        System.out.println("La recaudacion total a sido: " + cine.getDineroObtenido() + " euros");
        long fintiempo = System.currentTimeMillis();
        System.out.println("El programa a durado: "+ (fintiempo - tiempo) + " milisegundos");

    }

}
