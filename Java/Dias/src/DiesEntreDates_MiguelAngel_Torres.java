/**
 * PACKAGE_NAME
 * Nombre_project: DAMJava
 * DiesEntreDates_MiguelAngel_Torres
 * Created by: magua
 * Date : 16/12/2020
 * Description:
 **/
public class DiesEntreDates_MiguelAngel_Torres extends CalcularDiesEntreDates{

    public DiesEntreDates_MiguelAngel_Torres(int diesMes, int diesMesInicial, int diesMesDesti, int diesResteAnyInicial, int diesResteAnyDesti, int diesNumAnysComplets, int numDiesPerAnysdeTraspas, boolean anyDeTraspas, int nombreDiesTotals) {


    }

    @Override
    protected int diesMes(int mes) {
        return 0;
    }

    @Override
    protected int diesMesInicial(DataXS dataXS) {
        return 0;
    }

    @Override
    protected int diesMesDesti(DataXS dataXS) {
        return 0;
    }

    @Override
    protected int diesResteAnyInicial(DataXS datainicial) {
        return 0;
    }

    @Override
    protected int diesResteAnyDesti(DataXS datadesti) {
        return 0;
    }

    @Override
    protected int diesNumAnysComplets(DataXS datainicial, DataXS datadesti) {
        return 0;
    }

    @Override
    protected int numDiesPerAnysdeTraspas(DataXS datainicial, DataXS datadesti) {
        return 0;
    }

    @Override
    protected boolean anyDeTraspas(int any) {
        return false;
    }
}
