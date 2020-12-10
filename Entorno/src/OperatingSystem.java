import jdk.jshell.spi.SPIResolutionException;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * PACKAGE_NAME
 * Nombre_project: DAMJava
 * OperatingSystem
 * Created by: magua
 * Date : 04/12/2020
 * Description:
 **/
public class OperatingSystem {

    private String osName;
    private String osVersion;
    private String osArchitecture;
    private boolean osOnlyCommand;
    private int osSpaceRequirement;
    private int osRamMemmoryRequierement;
    private ArrayList<Software> osSoftware = new ArrayList<Software>();/** Array de software **/

   /** Constructor **/

   public OperatingSystem(String osName, String osVersion, String osArchitecture, boolean osOnlyCommand, int osSpaceRequirement, int osRamMemmoryRequierement) {
       this.osName = osName;
       this.osVersion = osVersion;
       this.osArchitecture = osArchitecture;
       this.osOnlyCommand = osOnlyCommand;
       this.osSpaceRequirement = osSpaceRequirement;
       this.osRamMemmoryRequierement = osRamMemmoryRequierement;
   }



   /** public void installSoftware(Software osSoftware){
        this.osSoftware.add(osSoftware);
    }
    public void uninstallSoftware(Software osSoftware){
        this.osSoftware.remove(osSoftware);
    } **/




    /** Para instalar el sistema operativo si hay espacio **/
/** public void softwareinstall(Computer computer, Software software){
 if ((computer.getHardDisk() >= software.getSoftwareSpaceRequirement()) &&
 (computer.getRamMemory() >= software.getSoftwareRamMemoryRquierement())
 ){
 computer.setHardDisk(computer.getHardDisk() - software.getSoftwareSpaceRequirement());
 computer.setRamMemory(computer.getRamMemory() - software.getSoftwareRamMemoryRquierement());
 System.out.println(software.getSoftwareName() + "se instalo correctamente");

 }
 } **/

    /** Get and Set **/

    public String getOsName() {
        return osName;
    }

    public void setOsName(String osName) {
        this.osName = osName;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public String getOsArchitecture() {
        return osArchitecture;
    }

    public void setOsArchitecture(String osArchitecture) {
        this.osArchitecture = osArchitecture;
    }

    public boolean isOsOnlyCommand() {
        return osOnlyCommand;
    }

    public void setOsOnlyCommand(boolean osOnlyCommand) {
        this.osOnlyCommand = osOnlyCommand;
    }


    public int getOsSpaceRequirement() {
        return osSpaceRequirement;
    }

    public void setOsSpaceRequirement(int osSpaceRequirement) {
        this.osSpaceRequirement = osSpaceRequirement;
    }

    public int getOsRamMemmoryRequierement() {
        return osRamMemmoryRequierement;
    }

    public void setOsRamMemmoryRequierement(int osRamMemmoryRequierement) {
        this.osRamMemmoryRequierement = osRamMemmoryRequierement;
    }

    public ArrayList<Software> getOsSoftware() {
        return osSoftware;
    }

    public void setOsSoftware(ArrayList<Software> osSoftware) {
        this.osSoftware = osSoftware;
    }

    //Array Metodos
    public void ArrayinstallSoftware(Software software){
        this.osSoftware.add(software);
    }
    public void ArraydesinstallSoftware(Software software){
        this.osSoftware.remove(software);
    }


}
