/**
 * PACKAGE_NAME
 * Nombre_project: DAMJava
 * TestComputerSimulator
 * Created by: magua
 * Date : 09/12/2020
 * Description:
 **/
public class TestComputerSimulator {
    public static void main(String[] args) {
        Computer c1 = new Computer("C1", 16, 100, null);
        Computer c2 = new Computer("C2", 20, 100, null);
        OperatingSystem op1 = new OperatingSystem("Windows", "XP", "32bits", false, 10, 2);
        OperatingSystem op2 = new OperatingSystem("Windows", "10", "32bits", false, 10, 2);
        Software so1 = new Software("VirtualBox", "32bits", 2, 1);
        Software so2 = new Software("Paint", "32bits", 5, 2);


        /** Para instalar el sistema opertivo **/
        //c1.operatingSystemInstaller(op1);

        /** Para desintalar el sistema opertivo **/
        //c1.operatingSystemDesinstaller(op1);


        /** Para instalar el software **/
        //op1.softwareinstall(c1,so1);
        //op1.softwareinstall(c1,so2);

        /** Para desinstalar el software **/
        //op1.softwaredesinstall(c1,so1);

        /** Para desinstalar dos software a la vez **/
        //c1.uninstallSoftware(so1,so2);


        /** Para borrar (formatear el ordenador) **/
        //c1.format();
        //System.out.println("Queda "+c1.getHardDisk()+" GB de disco duro y queda "+c1.getRamMemory()+" GB de memoria RAM");

        /** BUCLASO Mustra array **/
        String bucle = " ";
        int i = 0;

        for (i=0; i< op1.getOsSoftware().size() ; i++ ){

                bucle = bucle + op1.getOsSoftware().get(i).getSoftwareName() + " ";

        }

        System.out.println("Los software instalados son: " + bucle);

        /** Ver el Ordenador **/

        System.out.println("ORDENADOR: ");
        System.out.println("----------------------");
        System.out.println("Nombre: " + c1.getName());
        System.out.println("MemoriaRAM: " + c1.getRamMemory());
        System.out.println("DiscoDuro: " + c1.getHardDisk());
        //System.out.println("SystemaOperativo: " + c1.getOperatingSystem());
        System.out.println("  ");


        


    }
}
