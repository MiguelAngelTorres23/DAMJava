/**
 * PACKAGE_NAME
 * Nombre_project: DAMJava
 * CotxeSegonaPart_MiguelAngel_Torres
 * Created by: magua
 * Date : 15/12/2020
 * Description:
 **/

public class CotxeSegonaPart_MiguelAngel_Torres extends Cotxe_MiguelAngel_Torres {

    protected CanviarMarxaAutomatic canviarmarxaautomatic;
    protected CanviarMarxaManual canviarmarxamanual;

    /** Como ya tenemos los atributos heredado añadimos CanviarMarxaManual y CanviarMarxaAutomatic **/
    public CotxeSegonaPart_MiguelAngel_Torres(String marca, String model, TipusCanvi tipusCanvi, EstatsMotorCotxe estadomotorcoche, CanviarMarxaAutomatic canviarmarxaautomatic, CanviarMarxaManual canviarmarxamanual) {
        super(marca, model, tipusCanvi, estadomotorcoche);

        this.canviarmarxaautomatic = canviarmarxaautomatic;
        this.canviarmarxamanual = canviarmarxamanual;

    }

    /** Este metodo comprueba que sea automatico y que se sube o se baja correctamente la marcha
     * Si no es asi salta el exception **/
    public void CanviarMarxaAutomatic(char marcha) throws Exception {
        if (tipuscanvi == TipusCanvi.CanviAutomatic && canviarmarxaautomatic == CanviarMarxaAutomatic.R && marcha == '+') {
            canviarmarxaautomatic = CanviarMarxaAutomatic.N;
        }else if (tipuscanvi == TipusCanvi.CanviAutomatic && canviarmarxaautomatic == CanviarMarxaAutomatic.N && marcha == '+'){
            canviarmarxaautomatic = CanviarMarxaAutomatic.F;
        }else if (tipuscanvi == TipusCanvi.CanviAutomatic && canviarmarxaautomatic == CanviarMarxaAutomatic.F && marcha == '-'){
            canviarmarxaautomatic = CanviarMarxaAutomatic.N;
        }else if (tipuscanvi == TipusCanvi.CanviAutomatic && canviarmarxaautomatic == CanviarMarxaAutomatic.N && marcha == '-'){
            canviarmarxaautomatic = CanviarMarxaAutomatic.R;
        } else {
            throw new Exception("Lo que quiere realizar con las marchas automaticas no es posible");
        }
    }
    /** Este metodo comprueba que sea manual y que se sube o se baja correctamente la marcha
     * Si no es asi salta el exception **/
    public void CanviarMarxaManual (char marcha) throws Exception {
        if (tipuscanvi == TipusCanvi.CanviManual && canviarmarxamanual == CanviarMarxaManual.R && marcha == '+'){
            canviarmarxamanual = CanviarMarxaManual.N;
        } else if (tipuscanvi == TipusCanvi.CanviManual && canviarmarxamanual == CanviarMarxaManual.N && marcha == '+'){
            canviarmarxamanual = CanviarMarxaManual.Primera;
        }else if (tipuscanvi == TipusCanvi.CanviManual && canviarmarxamanual == CanviarMarxaManual.Primera && marcha == '+'){
            canviarmarxamanual = CanviarMarxaManual.Segunda;
        }else if (tipuscanvi == TipusCanvi.CanviManual && canviarmarxamanual == CanviarMarxaManual.Segunda && marcha == '+'){
            canviarmarxamanual = CanviarMarxaManual.Tercera;
        }else if (tipuscanvi == TipusCanvi.CanviManual && canviarmarxamanual == CanviarMarxaManual.Tercera && marcha == '+'){
            canviarmarxamanual = CanviarMarxaManual.Cuarta;
        }else if (tipuscanvi == TipusCanvi.CanviManual && canviarmarxamanual == CanviarMarxaManual.Cuarta && marcha == '+'){
            canviarmarxamanual = CanviarMarxaManual.Quinta;
        }else if (tipuscanvi == TipusCanvi.CanviManual && canviarmarxamanual == CanviarMarxaManual.Quinta && marcha == '+'){
            canviarmarxamanual = CanviarMarxaManual.Sexta;


        }else if (tipuscanvi == TipusCanvi.CanviManual && canviarmarxamanual == CanviarMarxaManual.Sexta && marcha == '-'){
            canviarmarxamanual = CanviarMarxaManual.Quinta;
        }else if (tipuscanvi == TipusCanvi.CanviManual && canviarmarxamanual == CanviarMarxaManual.Quinta && marcha == '-'){
            canviarmarxamanual = CanviarMarxaManual.Cuarta;
        }else if (tipuscanvi == TipusCanvi.CanviManual && canviarmarxamanual == CanviarMarxaManual.Cuarta && marcha == '-'){
            canviarmarxamanual = CanviarMarxaManual.Tercera;
        }else if (tipuscanvi == TipusCanvi.CanviManual && canviarmarxamanual == CanviarMarxaManual.Tercera && marcha == '-'){
            canviarmarxamanual = CanviarMarxaManual.Segunda;
        }else if (tipuscanvi == TipusCanvi.CanviManual && canviarmarxamanual == CanviarMarxaManual.Segunda && marcha == '-'){
            canviarmarxamanual = CanviarMarxaManual.Primera;
        }else if (tipuscanvi == TipusCanvi.CanviManual && canviarmarxamanual == CanviarMarxaManual.Primera && marcha == '-'){
            canviarmarxamanual = CanviarMarxaManual.N;
        }else if (tipuscanvi == TipusCanvi.CanviManual && canviarmarxamanual == CanviarMarxaManual.N && marcha == '-'){
            canviarmarxamanual = CanviarMarxaManual.R;
        } else {
            throw new Exception("Lo que quiere realizar con las marchas manuales no es posible");
        }


    }


    /** Aquí tenemos dos enum que los utilizamos para saber que marchas tiene cada tipo de coche**/
    /** Este enum es para el marchas automaticas **/
    public enum CanviarMarxaAutomatic {
        F,
        N,
        R
    }
    /** Este enum es para el marchas manuales **/
    public enum CanviarMarxaManual {
        R,
        N,
        Primera,
        Segunda,
        Tercera,
        Cuarta,
        Quinta,
        Sexta
    }

    /** Estos son los gets para poder ver que marcha tienen en ese momento **/

    public CanviarMarxaAutomatic getCanviarmarxaautomatic() {
        return canviarmarxaautomatic;
    }



    public CanviarMarxaManual getCanviarmarxamanual() {
        return canviarmarxamanual;
    }




}



