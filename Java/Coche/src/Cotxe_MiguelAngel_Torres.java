/**
 * PACKAGE_NAME
 * Nombre_project: DAMJava
 * Cotxe_MiguelAngel_Torres
 * Created by: magua
 * Date : 06/12/2020
 * Description:
 **/


public class Cotxe_MiguelAngel_Torres extends CotxeAbstracte {

    protected EstatsMotorCotxe estadomotorcoche;

    public Cotxe_MiguelAngel_Torres(String marca, String model, TipusCanvi tipusCanvi, EstatsMotorCotxe estadomotorcoche){
        super(marca, model, tipusCanvi);
        this.estadomotorcoche = estadomotorcoche;

    }

    @Override
    public void arrancarMotor() throws Exception {
        if (this.estadomotorcoche == EstatsMotorCotxe.Aturat) {
            this.estadomotorcoche = EstatsMotorCotxe.EnMarxa;
            System.out.println("Esta Encendido");
        }
        else {
            throw new Exception ("Ya esta encendido");
        }
    }

    @Override
    public EstatsMotorCotxe comprovaMotor() {
        return this.estadomotorcoche;
    }

    @Override
    public int getRevolucions() {
        if (estadomotorcoche == EstatsMotorCotxe.Aturat){
            return 0;
        }else {
            return (int)(Math.random()*6500+1);
        }
    }

    @Override
    public void aturarMotor() throws Exception {
        if (this.estadomotorcoche == EstatsMotorCotxe.EnMarxa) {
            this.estadomotorcoche = EstatsMotorCotxe.Aturat;
            System.out.println("Esta Apagado");
        }
        else {
            throw new Exception ("Ya esta apagado");
        }
    }
}
