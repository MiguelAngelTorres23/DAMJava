import java.lang.management.OperatingSystemMXBean;

/**
 * PACKAGE_NAME
 * Nombre_project: DAMJava
 * Computer
 * Created by: magua
 * Date : 04/12/2020
 * Description:
 **/
public class Computer {
   private String name;
   private int ramMemory;
   private int hardDisk;
   private OperatingSystem operatingSystem;


    public Computer(String name, int ramMemory, int hardDisk, OperatingSystem operatingSystem) {
        this.name = name;
        this.ramMemory = ramMemory;
        this.hardDisk = hardDisk;
        this.operatingSystem = operatingSystem;
    }

    /** Metodos **/

    public void operatingSystemInstaller(OperatingSystem operatingSystem){
        if (operatingSystem != null){
            this.hardDisk -= operatingSystem.getOsSpaceRequirement();
            this.ramMemory -= operatingSystem.getOsRamMemmoryRequierement();
            this.operatingSystem = operatingSystem;
        }
    }

    public void operatingSystemDesinstaller(OperatingSystem operatingSystem){
        if (operatingSystem != null){
            this.hardDisk += operatingSystem.getOsSpaceRequirement();
            this.ramMemory += operatingSystem.getOsRamMemmoryRequierement();
            this.operatingSystem = operatingSystem;
        }
    }

    public void softwareinstall(Software software){
        /** Para instalar el sistema operativo si hay espacio **/
        if ((this.hardDisk >= software.getSoftwareSpaceRequirement()) &&
                (this.ramMemory >= software.getSoftwareRamMemoryRquierement())
        ){
            setHardDisk(this.hardDisk - software.getSoftwareSpaceRequirement());
            setRamMemory(this.ramMemory - software.getSoftwareRamMemoryRquierement());
            System.out.println(software.getSoftwareName() + "se instalo correctamente");

        }
    }

    public void softwareDesinstall(Software software){
        /** Para instalar el sistema operativo si hay espacio **/
        if ((this.hardDisk >= software.getSoftwareSpaceRequirement()) &&
                (this.ramMemory >= software.getSoftwareRamMemoryRquierement())
        ){
            setHardDisk(this.hardDisk + software.getSoftwareSpaceRequirement());
            setRamMemory(this.ramMemory + software.getSoftwareRamMemoryRquierement());
            System.out.println(software.getSoftwareName() + "se desinstalo correctamente");

        }
    }

    public void format(){
        this.hardDisk = hardDisk+operatingSystem.getOsSpaceRequirement();
        this.ramMemory = ramMemory+operatingSystem.getOsRamMemmoryRequierement();
        this.operatingSystem=null;
    }

    public void uninstallSoftware( Software software, Software software2){
        this.hardDisk = hardDisk + software.getSoftwareSpaceRequirement() + software2.getSoftwareSpaceRequirement();
        this.ramMemory = ramMemory + software.getSoftwareRamMemoryRquierement() + software2.getSoftwareRamMemoryRquierement();
        this.operatingSystem = operatingSystem;
    }




    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;

    }

    public int getRamMemory() {
        return ramMemory;
    }

    public void setRamMemory(int ramMemory) {
        this.ramMemory = ramMemory;
    }

    public int getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(int hardDisk) {
        this.hardDisk = hardDisk;
    }

    public OperatingSystem getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(OperatingSystem operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
}
