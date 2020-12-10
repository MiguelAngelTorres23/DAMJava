/**
 * PACKAGE_NAME
 * Nombre_project: DAMJava
 * Personas
 * Created by: magua
 * Date : 24/11/2020
 * Description:
 **/
public class Personas {
    /** Nom de la persona ENG: The person's name */
    private String nom;
    /** Edat de la persona ENG: The person's age */
    private int edat;
    /** AlÃ§ada de la persona ENG: The person's height */
    private double alsada;
    /** El sexe d'una persona. Pot ser 'H' (home) o 'D' (dona).
     * TENG: he person's sex. It can be 'H' (man) or 'H' (woman) */
    private char sexe;
    /** Estableix si una persona estÃ  casada o no.
     * ENG: Sets whether the person is married or not */
    private boolean casada;

    // Constructors

    /**
     * Constructor per defecte ENG: Constructor by default.
     */
    public Personas() {
        this.casada = true;
    }

    /**
     * Constructor.
     *
     * @param nom nom de la persona ENG: the person's name.
     */
    public Personas(String nom) {
        this.nom = nom;
    }

    /**
     * Constructor.
     *
     * @param nom nom de la persona ENG: the person's name.
     * @param edat edat de la persona ENG: the person's age.
     * @param alsada alsada de la persona ENG: the person's height
     * @param sexe sexe de la persona Pot ser 'H' (home o 'D' (dona)
     *             ENG: the person's sex. It can be 'H' (man) or 'D' (woman).
     * @param casada true si la persona estÃ  casada, false altrament
     *               ENG: true if the person is married, false otherwise
     */
    public Personas(String nom, int edat, double alsada, char sexe, boolean casada) {
        this.nom = nom;
        this.setEdat(edat); //DE DONDE LO COJE O QUE HACE
        this.alsada = alsada;
        this.sexe = sexe;
        this.casada = casada;
    }

    // Getters and setters

    /**
     * ObtÃ© el nom de la persona; ENG: Gets the person's name.
     *
     * @return el nom de la persona.
     *         ENG: the person's name.
     */
    public String getNom() {
        return this.nom;
    }

    /**
     * Estableix l'edat de la persona; ENG: Sets the person's name.
     *
     * @param nom l'edat de la persona.
     *            ENG: the person's name.
     */
    public void setNom(String nom) {
        this.nom = nom; //PARA QUE SIRVE
    }

    /**
     * ObtÃ© l'edat de la persona; ENG: Gets person's age.
     *
     * @return l'edat de la persona.
     *         ENG: the person's age.
     */
    public int getEdat() {
        return edat;
    }

    /**
     * Estableix l'edat de la persona; ENG: Sets the person's age.
     *
     * @param edat l'edat de la persona.
     *             ENG: the person's age.
     */
    public void setEdat(int edat) {
        if (edat >= 0)
            this.edat = edat;
    }

    /**
     * ObtÃ© l'alÃ§ada de la persona; ENG: Gets the height of the person.
     *
     * @return l'alÃ§ada de la persona.
     *         ENG: the person's height.
     */
    public double getAlsada() {
        return alsada;
    }

    /**
     * Estableix l'alÃ§ada de la persona; ENG: Sets the person's height.
     *
     * @param alsada l'alÃ§ada de la persona.
     *               ENG: the person's height.
     */
    public void setAlsada(double alsada) {
        this.alsada = alsada;
    }

    /**
     * ObtÃ© el sexe de la persona; ENG: Gets the sex of the person.
     *
     * @return el sexe de la persona.
     *          ENG: the person's sex.
     */
    public char getSexe() {
        return sexe;
    }

    /**
     * Estableix el sexe de la persona; ENG: Sets the person's sex.
     *
     * @param sexe el sexe de la persona.
     *             ENG: the person's sex.
     */
    public void setSexe(char sexe) {
        if (sexe == 'D' || sexe == 'H')
            this.sexe = sexe;
    }

    /**
     * ObtÃ© si la persona estÃ  casada; ENG: Gets if the person is married.
     *
     * @return true si la persona estÃ  casada, false altrament.
     *          ENG: true if he/she is married, false otherwise
     */
    public boolean estaCasada() {
        return casada;
    }

    /**
     * Estableix si una persona estÃ  casada o no; ENG: Sets if person is married.
     *
     * @param casada true si la persona estÃ  casada, false altrament
     *               ENG: true if the person is married, false otherwise
     */
    public void setCasada(boolean casada) {
        this.casada = casada;
    }

    // MÃ©s mÃ¨todes // More methods

    /**
     * Incrementa l'edat d'una persona en 1; ENG: Increments person's age by 1.
     */
    public void aniversari() {
        this.edat++;
    }

    /**
     * RepresentaciÃ³ textual de l'objecte; ENG: Textual representation of the object.
     *
     * @return un string que representa a una persona
     *          ENG: a string that represents the person
     */
    public String toString() {
        String s = "El meu nom Ã©s " + this.nom + " i  sÃ³c " + this.sexe;
        return s;
    }
}

