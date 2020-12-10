/**
 * PACKAGE_NAME
 * Nombre_project: DAMJava
 * TestCotxe_MiguelAngel_Torres
 * Created by: magua
 * Date : 06/12/2020
 * Description:
 **/
public class TestCotxe_MiguelAngel_Torres {

    public static void main(String[] args) {

        Cotxe_MiguelAngel_Torres carro = new Cotxe_MiguelAngel_Torres("Kia", "1", TipusCanvi.CanviAutomatic, EstatsMotorCotxe.Aturat);

        /** Creamos el objeto carro (coche) y probomos con un try y un catch los que pueden tener un exception **/

        try {
            carro.arrancarMotor();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        try {
            carro.aturarMotor();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }




        /** Mostramos por pantalla las revoluciones del coche **/
        System.out.println(carro.getRevolucions());


    }
}
