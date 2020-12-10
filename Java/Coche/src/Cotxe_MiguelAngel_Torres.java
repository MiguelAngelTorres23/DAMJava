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


    /** Como ya tenemos los atributos del padre solo añadimos el estadomotorcoche **/
    public Cotxe_MiguelAngel_Torres(String marca, String model, TipusCanvi tipusCanvi, EstatsMotorCotxe estadomotorcoche){
        super(marca, model, tipusCanvi);
        this.estadomotorcoche = estadomotorcoche;

    }

    /** Este constructor arranca el motor. Si el coche esta parado lo enciende y si esta encendido lanza
     * un exception con el mensaje ya esta encendido**/

    @Override
    public void arrancarMotor() throws Exception {
        if (this.estadomotorcoche == EstatsMotorCotxe.Aturat) {
            this.estadomotorcoche = EstatsMotorCotxe.EnMarxa;
            System.out.println("Se ha Encendido");
        }
        else {
            throw new Exception ("Ya esta encendido");
        }
    }

    /** Retorna el estado del motor **/

    @Override
    public EstatsMotorCotxe comprovaMotor() {
        return this.estadomotorcoche;
    }


    /** Te retorna las revoluciones, si el coche esta parado te da 0 y si esta encendido te da un número
     * random del 1 al 6500 **/
    @Override
    public int getRevolucions() {
        if (estadomotorcoche == EstatsMotorCotxe.Aturat){
            return 0;
        }else {
            return (int)(Math.random()*6500+1);
        }
    }


    /** Este constructor parar el motor. Si el coche esta encendido lo para y si esta parado lanza
     * un exception con el mensaje ya esta parado **/
    @Override
    public void aturarMotor() throws Exception {
        if (this.estadomotorcoche == EstatsMotorCotxe.EnMarxa) {
            this.estadomotorcoche = EstatsMotorCotxe.Aturat;
            System.out.println("Se ha  Apagado");
        }
        else {
            throw new Exception ("Ya esta apagado");
        }
    }
}
