package Pelicula;

/**
 * Pelicula
 * Nombre_project: DAMJava
 * Pelicula
 * Created by: magua
 * Date : 22/01/2021
 * Description:
 **/
public class Pelicula {

    public String titol;
    public int durada;
    public int edadminima;
    public String director;

    public Pelicula (){
        setDirector();
        setDurada();
        setEdadminima();
        setTitol();

    };

    public String getTitol() {
        return titol;
    }

    public double getDurada() {
        return durada;
    }

    public int getEdadminima() {
        return edadminima;
    }

    public String getDirector() {
        return director;
    }

    public void setDurada() {
        this.durada = 162;
    }
    public void setTitol() {
        this.titol = "Avatar";
    }

    public void setEdadminima() {
        this.edadminima = 3;
    }

    public void setDirector() {
        this.director = "James Cameron";
    }
}
