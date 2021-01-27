/**
 * PACKAGE_NAME
 * Nombre_project: DAMJava
 * Espectador
 * Created by: magua
 * Date : 26/01/2021
 * Description:
 **/
public class Espectador {

    public int edad;
    public int diners;

    public Espectador(){
        setDiners();
        setEdad();
    }

    public int getDiners() {
        return diners;
    }
    public int getEdad() {
        return edad;
    }

    public void setDiners() {
        this.diners = (int) (Math.random() * 100 + 1);
    }
    public void setEdad() {
        this.edad = (int)(Math.random() * 100 + 1);
    }
}
