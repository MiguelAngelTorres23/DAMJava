/**
 * PACKAGE_NAME
 * Nombre_project: DAMJava
 * PersonasTest
 * Created by: magua
 * Date : 24/11/2020
 * Description:
 **/
public class PersonasTest {
    /**
     * Main method.
     *
     * @param args No utilitzat
     *             Not used
     */
    public static void main(String[] args) {
        Personas p1 = new Personas("", 0, 0, 'W', false);
        Personas p2 = new Personas("", 0, 0, 'W', false);
        mostraPersona(p1);
        mostraPersona(p2);

        p1.aniversari();
        mostraPersona(p1);

        p2.aniversari();
        mostraPersona(p2);

        Personas nina = p1;
        Personas nin = p2;

        nina.aniversari();
        mostraPersona(p1);

        nin.aniversari();
        mostraPersona(p2);

    }

    /**
     * Mostra una representaciÃ³ textual de la persona
     * Prints a textual representation of a person.
     *
     * @param p una persona // a person
     */
    public static void mostraPersona(Personas p) {
        System.out.println("Nom:    " + p.getNom());
        System.out.println("Edat:   " + p.getEdat());
        System.out.println("AlÃ§ada: " + p.getAlsada());
        System.out.println("Sexe:   " + p.getSexe());
        System.out.println("Casat:  " + p.estaCasada());
        System.out.println();
    }

}
