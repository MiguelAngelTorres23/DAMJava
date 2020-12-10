/**
 * PACKAGE_NAME
 * Nombre_project: DAMJava
 * CargasEstacionamientoJuanma
 * Created by: magua
 * Date : 20/11/2020
 * Description:
 **/
public class CargasEstacionamientoJuanma {

    private int horasEstacionamiento;
    private double precioEstacionamiento;
    private String matricula;

    public void calculateCharges(int horas){
        this.horasEstacionamiento = horas;

        if (this.horasEstacionamiento > 3){
            if (this.horasEstacionamiento >= 14 && this.horasEstacionamiento <= 24){
                precioEstacionamiento = 10.00;
            }
            else if (this.horasEstacionamiento < 14)
                precioEstacionamiento = ((this.horasEstacionamiento - 3) * 0.50) + 2.00;
        }
        else if (this.horasEstacionamiento <= 3){
            precioEstacionamiento = 2.00;
        }
        else if (this.horasEstacionamiento > 24){
            System.out.println("Solo puede estar 24 horas maximo.");
            precioEstacionamiento = 0.00;
        }
    }

    public double getPrecioEstacionamiento(){
        return precioEstacionamiento;
    }
}



class TestEstacionamiento {
    public static void main(String[] args) {
        CargasEstacionamientoJuanma coche1 = new CargasEstacionamientoJuanma();
        coche1.calculateCharges(10);
        System.out.println(coche1.getPrecioEstacionamiento());
    }
}

