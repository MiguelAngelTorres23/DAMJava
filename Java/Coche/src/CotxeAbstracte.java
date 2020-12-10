/**
 * PACKAGE_NAME
 * Nombre_project: DAMJava
 * CotxeAbstracte
 * Created by: magua
 * Date : 04/12/2020
 * Description:
 **/

public abstract class CotxeAbstracte implements InterfaceCotxe {

    protected String marca;
    protected String model;
    protected TipusCanvi tipuscanvi;
    public CotxeAbstracte(String marca, String model, TipusCanvi tipuscanvi) {
        this.marca=marca;
        this.model=model;
        this.tipuscanvi=tipuscanvi;
    }

}
