/**
 * PACKAGE_NAME
 * Nombre_project: DAMJava
 * DiesEntreDates_MiguelAngel_Torres
 * Created by: magua
 * Date : 16/12/2020
 * Description:
 **/
public class DiesEntreDates_MiguelAngel_Torres extends CalcularDiesEntreDates{


    //Array de los dias del mes
    private final int [] unicodiaMes = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};

    //Se miran los dias
    @Override
    protected int diesMes(int mes) {
        return this.unicodiaMes [mes - 1];
    }

    //Aqui se calcula los dias que quedan en el mes
    @Override
    protected int diesMesInicial(DataXS dataXS) {

         return this.diesMes(dataXS.mes) - dataXS.dia;
    }
//Aquí solo vemos los dias ya que miramos los dias del propio mes por ejemplo del 1 al 10
    @Override
    protected int diesMesDesti(DataXS dataXS) {
          return dataXS.dia;
    }
// Te coje del mes que esta que es el numero de .mes de data inicial hasta el ultimo més.
    @Override
    protected int diesResteAnyInicial(DataXS datainicial) {
        int diarestantesdeinicio = this.diesMesInicial(datainicial);
        int i= datainicial.mes;

        if (i < 12) {
            do {
                diarestantesdeinicio += this.unicodiaMes[i];
                i++;
            } while (i < 12);
        }
        return diarestantesdeinicio - this.diesMesInicial(datainicial);
    }
    //Calcula los dias de el principio hasta el mes puesto
    @Override
    protected int diesResteAnyDesti(DataXS datadesti) {
        int diarestantesdestino = this.diesMesDesti(datadesti);
        int i = 0;

        if (i < datadesti.mes-1){
          do {
              diarestantesdestino += this.unicodiaMes[i];
              i++;
          }while (i < datadesti.mes -1);
        }
        return diarestantesdestino - this.diesMesDesti(datadesti);
    }
    // Calcula los años completos con años no bisiestos
    @Override
    protected int diesNumAnysComplets(DataXS datainicial, DataXS datadesti) {
        int diasAnyComplets = 0;
        int i = datainicial.any + 1;

        if (i < datainicial.any + (datadesti.any - datainicial.any)) {
            do {
                if (!anyDeTraspas(i)) diasAnyComplets += 365;
                i++;
            } while (i < datainicial.any + (datadesti.any - datainicial.any));
        }
        return diasAnyComplets;
    }

    //Lo mismo que el anterior para los años bisiestos
    @Override
    protected int numDiesPerAnysdeTraspas(DataXS datainicial, DataXS datadesti) {
        int diasAnyTraspass = 0;
        int i = datainicial.any + 1;

        if (i < datainicial.any + (datadesti.any - datainicial.any)) {
            do {
                if (anyDeTraspas(i)) diasAnyTraspass += 366;
                i++;
            }while (i < datainicial.any + (datadesti.any - datainicial.any));
        }
        return diasAnyTraspass;
    }
    // Calcula si el año es bisiesto
    @Override
    protected boolean anyDeTraspas(int any) {
            this.unicodiaMes[1] = 29;
            return (any % 400 == 0) || ((any % 4 == 0) && !(any % 100 == 0));

    }
}
