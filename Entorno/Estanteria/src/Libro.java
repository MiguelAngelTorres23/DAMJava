/**
 * PACKAGE_NAME
 * Nombre_project: DAMJava
 * Libro
 * Created by: magua
 * Date : 09/02/2021
 * Description:
 **/
public class Libro {

    public String Titol;
    public String Autor;
    public int Qualificació;

    public Libro(String titol, String autor, int qualificació){
        this.Titol = titol;
        this.Autor = autor;
        this.Qualificació = qualificació;
    }

    @Override
    public String toString(){
        return  "Titulo: " +getTitol() + "\n" + "Autor: " + getAutor() + "\n" + "Cualificacion: " + getQualificació();
    }


    public String getTitol() {
        return Titol;
    }

    public void setTitol(String titol) {
        Titol = titol;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public int getQualificació() {
        return Qualificació;
    }

    public void setQualificació(int qualificació) {
        Qualificació = qualificació;
    }
}
