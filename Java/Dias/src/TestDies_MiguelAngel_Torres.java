/**
 * PACKAGE_NAME
 * Nombre_project: DAMJava
 * TestDies_MiguelAngel_Torres
 * Created by: magua
 * Date : 18/12/2020
 * Description:
 **/
public class TestDies_MiguelAngel_Torres {

    public static void main(String[] args) {

        DiesEntreDates_MiguelAngel_Torres d1 = new DiesEntreDates_MiguelAngel_Torres();

        try {
            DataXS data1 = new DataXS("23/06/2000");
            DataXS data2 = new DataXS("18/12/2020");
            System.out.println("Fecha inicio 1: " + data1.toString());
            System.out.println("Fecha destino 1: " + data2.toString());
            System.out.println(d1.nombreDiesTotals(data1, data2));

            DataXS data3 = new DataXS("12/12/2017");
            DataXS data4 = new DataXS("01/01/2018");
            System.out.println("Fecha inicio 1: " + data3.toString());
            System.out.println("Fecha destino 1: " + data4.toString());
            System.out.println(d1.nombreDiesTotals(data3, data4));


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

