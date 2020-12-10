import java.util.Scanner;

/**
 * PACKAGE_NAME
 * Nombre_project: DAMJava
 * Software
 * Created by: magua
 * Date : 04/12/2020
 * Description:
 **/
public class Software {

    private String softwareName;
    private String softwareVersion;
    private int softwareSpaceRequirement;
    private int softwareRamMemoryRquierement;

    public Software(String softwareName, String softwareVersion, int softwareSpaceRequirement, int softwareRamMemoryRquierement) {
        this.softwareName = softwareName;
        this.softwareVersion = softwareVersion;
        this.softwareSpaceRequirement = softwareSpaceRequirement;
        this.softwareRamMemoryRquierement = softwareRamMemoryRquierement;
    }


    public String getSoftwareName() {
        return softwareName;
    }

    public void setSoftwareName(String softwareName) {
        this.softwareName = softwareName;
    }

    public String getSoftwareVersion() {
        return softwareVersion;
    }

    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }

    public int getSoftwareSpaceRequirement() {
        return softwareSpaceRequirement;
    }

    public void setSoftwareSpaceRequirement(int softwareSpaceRequirement) {
        this.softwareSpaceRequirement = softwareSpaceRequirement;
    }

    public int getSoftwareRamMemoryRquierement() {
        return softwareRamMemoryRquierement;
    }

    public void setSoftwareRamMemoryRquierement(int softwareRamMemoryRquierement) {
        this.softwareRamMemoryRquierement = softwareRamMemoryRquierement;
    }
}
