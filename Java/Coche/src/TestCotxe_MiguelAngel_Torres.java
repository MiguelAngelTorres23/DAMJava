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

        Cotxe_MiguelAngel_Torres carro = new Cotxe_MiguelAngel_Torres("Kia", "1", TipusCanvi.CanviAutomatic, EstatsMotorCotxe.EnMarxa);

        try {
            carro.arrancarMotor();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println(carro.getRevolucions());


    }
}
