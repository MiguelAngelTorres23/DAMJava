/**
 * PACKAGE_NAME
 * Nombre_project: DAMJava
 * TestCotxeSegonaPart_MiguelAngel_Torres
 * Created by: magua
 * Date : 15/12/2020
 * Description:
 **/
public class TestCotxeSegonaPart_MiguelAngel_Torres {
    public static void main(String[] args) {
        CotxeSegonaPart_MiguelAngel_Torres c1 = new CotxeSegonaPart_MiguelAngel_Torres("Kia", "1", TipusCanvi.CanviAutomatic, EstatsMotorCotxe.EnMarxa, CotxeSegonaPart_MiguelAngel_Torres.CanviarMarxaAutomatic.N, null);
        CotxeSegonaPart_MiguelAngel_Torres c2 = new CotxeSegonaPart_MiguelAngel_Torres("Kia", "1", TipusCanvi.CanviManual, EstatsMotorCotxe.EnMarxa,null,CotxeSegonaPart_MiguelAngel_Torres.CanviarMarxaManual.R);
        CotxeSegonaPart_MiguelAngel_Torres c3 = new CotxeSegonaPart_MiguelAngel_Torres("Kia", "1", TipusCanvi.CanviManual, EstatsMotorCotxe.Aturat,null,CotxeSegonaPart_MiguelAngel_Torres.CanviarMarxaManual.R);
        /** Creamos el objeto carro (coche) y probomos con un try y un catch los que pueden tener un exception **/
        try {
            c1.CanviarMarxaAutomatic('+');
            System.out.println("La marcha a subido a " + c1.getCanviarmarxaautomatic());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        /** Este esta puesto mal a proposito para que se pueda ver que el Exception funciona correctamente **/

        try {
            c2.CanviarMarxaManual('-');
            System.out.println( "La marcha a subido a " +c2.getCanviarmarxamanual());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        try {
            c3.CanviarMarxaManual('+');
            System.out.println("La marcha a subido a " + c3.getCanviarmarxaautomatic());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
