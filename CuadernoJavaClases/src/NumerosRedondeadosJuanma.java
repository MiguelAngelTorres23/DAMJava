/**
 * PACKAGE_NAME
 * Nombre_project: DAMJava
 * NumerosRedondeadosJuanma
 * Created by: magua
 * Date : 20/11/2020
 * Description:
 **/
public class NumerosRedondeadosJuanma {
    private double numero;
    private double numeroRedondeado;

    public void setNumeroRedondeado(double numero){
        this.numero = numero;
        this.numeroRedondeado = Math.floor(numero + 0.5);
    }

    public double getNumero(){
        return this.numero;
    }

    public double getNumeroRedondeado(){
        return this.numeroRedondeado;
    }
}
class TestNumerosRedondeados {
    public static void main(String[] args) {
        NumerosRedondeadosJuanma numero1 = new NumerosRedondeadosJuanma();
        numero1.setNumeroRedondeado(3.45);
        System.out.println(numero1.getNumero());
        System.out.println(numero1.getNumeroRedondeado());
    }
}
