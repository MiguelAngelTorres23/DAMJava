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


    public CotxeSegonaPart_MiguelAngel_Torres(String marca, String model, TipusCanvi tipusCanvi, EstatsMotorCotxe estadomotorcoche, CanviarMarxaAutomatic canviarmarxaautomatic, CanviarMarxaManual canviarmarxamanual) {
        super(marca, model, tipusCanvi, estadomotorcoche);
        this.canviarmarxaautomatic = canviarmarxaautomatic;
        this.canviarmarxamanual = canviarmarxamanual;

    }


    public void CanviarCotxeAutomatic(char marcha) {
        if (tipuscanvi == TipusCanvi.CanviAutomatic && canviarmarxaautomatic == CanviarMarxaAutomatic.N && marcha == '+') {
            canviarmarxaautomatic = CanviarMarxaAutomatic.R;
        }else if (tipuscanvi == TipusCanvi.CanviAutomatic && canviarmarxaautomatic == CanviarMarxaAutomatic.F && marcha == '+'){
            canviarmarxaautomatic = CanviarMarxaAutomatic.N;
        }else if (tipuscanvi == TipusCanvi.CanviAutomatic && canviarmarxaautomatic == CanviarMarxaAutomatic.N && marcha == '-'){
            canviarmarxaautomatic = CanviarMarxaAutomatic.F;
        }else if (tipuscanvi == TipusCanvi.CanviAutomatic && canviarmarxaautomatic == CanviarMarxaAutomatic.R && marcha == '-'){
            canviarmarxaautomatic = CanviarMarxaAutomatic.N;
        }
    }

}



