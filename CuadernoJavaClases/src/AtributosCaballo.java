/**
 * PACKAGE_NAME
 * Nombre_project: DAMJava
 * AtributosCaballo
 * Created by: magua
 * Date : 17/11/2020
 * Description:
 **/
public class AtributosCaballo {
    public static void main(String[] args) {
        Caballo caballomiguel;

        caballomiguel = new Caballo();

        caballomiguel.nombre = "Miguel";
        caballomiguel.edad = 19;
        caballomiguel.raza = "Español";
        caballomiguel.peso = 500.70;

        caballomiguel.getinfocaballo();
    }
}
