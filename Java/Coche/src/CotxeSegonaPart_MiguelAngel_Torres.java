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

       /** if(tipusCanvi == TipusCanvi.CanviManual){
            this.canviarmarxamanual = canviarmarxamanual;
            this.canviarmarxaautomatic = null;
        }else {
            this.canviarmarxaautomatic = canviarmarxaautomatic;
            this.canviarmarxamanual = null;
        } **/


        this.canviarmarxaautomatic = canviarmarxaautomatic;
        this.canviarmarxamanual = canviarmarxamanual;

    }


    public void CanviarMarxaAutomatic(char marcha) {
        if (tipuscanvi == TipusCanvi.CanviAutomatic && canviarmarxaautomatic == CanviarMarxaAutomatic.R && marcha == '+') {
            canviarmarxaautomatic = CanviarMarxaAutomatic.N;
        }else if (tipuscanvi == TipusCanvi.CanviAutomatic && canviarmarxaautomatic == CanviarMarxaAutomatic.N && marcha == '+'){
            canviarmarxaautomatic = CanviarMarxaAutomatic.F;
        }else if (tipuscanvi == TipusCanvi.CanviAutomatic && canviarmarxaautomatic == CanviarMarxaAutomatic.F && marcha == '-'){
            canviarmarxaautomatic = CanviarMarxaAutomatic.N;
        }else if (tipuscanvi == TipusCanvi.CanviAutomatic && canviarmarxaautomatic == CanviarMarxaAutomatic.N && marcha == '-'){
            canviarmarxaautomatic = CanviarMarxaAutomatic.R;
        } else {
            System.out.println("Lo que quiere realizar no es posible");
        }
    }

    public void CanviarMarxaManual (char marcha){
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
            System.out.println("Lo que quiere realizar no es posible");
        }


    }

    public CanviarMarxaAutomatic getCanviarmarxaautomatic() {
        return canviarmarxaautomatic;
    }

    public void setCanviarmarxaautomatic(CanviarMarxaAutomatic canviarmarxaautomatic) {
        this.canviarmarxaautomatic = canviarmarxaautomatic;
    }

    public CanviarMarxaManual getCanviarmarxamanual() {
        return canviarmarxamanual;
    }

    public void setCanviarmarxamanual(CanviarMarxaManual canviarmarxamanual) {
        this.canviarmarxamanual = canviarmarxamanual;
    }


}



