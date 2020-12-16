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
        CotxeSegonaPart_MiguelAngel_Torres c1 = new CotxeSegonaPart_MiguelAngel_Torres("Kia", "1", TipusCanvi.CanviAutomatic, EstatsMotorCotxe.Aturat,CanviarMarxaAutomatic.N, null);
        CotxeSegonaPart_MiguelAngel_Torres c2 = new CotxeSegonaPart_MiguelAngel_Torres("Kia", "1", TipusCanvi.CanviManual, EstatsMotorCotxe.Aturat,null, CanviarMarxaManual.N);

        c1.CanviarMarxaAutomatic('+');
        System.out.println("La marcha actual de c1 es: " + c1.getCanviarmarxaautomatic());

        c2.CanviarMarxaManual('-');
        System.out.println("La marcha actual de c2 es: " + c2.getCanviarmarxamanual());


    }
}
