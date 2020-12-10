/**
 * PACKAGE_NAME
 * Nombre_project: DAMJava
 * Persona
 * Created by: magua
 * Date : 23/11/2020
 * Description:
 **/
public class Persona {

    //Primero inicializaremos o crearemos los atributos de perosna, es decir que lo describe
    double peso;
    double altura;
    int edad;
    String sexo;
    String nombre;

    //Cotructores. Estos le dan valor a los "obejetos" o inicializaciones de la clase
    //Podemos poner unos datos base para persona

    public Persona(){
        peso = 60.00;
        altura = 175.50;
        edad = 19;
        sexo = "Mujer";
        nombre = "Maria";
    }



    //Esta es otra forma de dar datos , aqui la persona tendra que escribir lo que esta en parentesis
    public Persona (double peso, double altura, int edad, String sexo, String nombre) {

        //El this se el peso, altura, edad, sexo nativo de Persona

        this.peso = peso;
        this.altura = altura;
        this.edad = edad;
        this.sexo = sexo;
        this.nombre = nombre;

    }

    //Metodos. Son especios de funciones que ejecutan lineas de codigo para lograr algo

    public void CrearPersona(double peso, double altura, int edad, String sexo, String nombre){

        this.peso = peso;
        this.altura = altura;
        this.edad = edad;
        this.sexo = sexo;
        this.nombre = nombre;

    }

    public void PersonaBase(){
        peso = 60.00;
        altura = 175.50;
        edad = 19;
        sexo = "Mujer";
        nombre = "Maria";
    }


    public double getPeso(){
        return peso;
    }

    public double getAltura(){
        return altura;
    }

    public int getEdad(){
        return edad;
    }

    public String getSexo(){
        return sexo;
    }
    public String getNombre(){
        return nombre;
    }


    //Se utiliza para ejecutar

    public static void main(String[] args) {
        // Creamosu un objeto tipo persona (es como si fuera una variable ej: String Maria)
        // Classe persona y la creacion del objeto de persona
        Persona ObjetoPersona = new Persona();
        //Objeto mas el void que es lo que podemos utilizar de la clase
        ObjetoPersona.CrearPersona(13.0, 120.0,5, "Hombre","Juan");
        System.out.println("Persona Creada");
        System.out.println("Nombre: " + ObjetoPersona.getNombre() );
        System.out.println("Altura: " + ObjetoPersona.getAltura() );
        System.out.println("Sexo: " + ObjetoPersona.getSexo() );
        System.out.println("Edad : " + ObjetoPersona.getEdad() );
        System.out.println("Peso: " + ObjetoPersona.getPeso() );
        System.out.println("   ");

        //Aqui creamos otra "variable" o otro objeto para poder utilizar el contructor persona con cosas entre los parentesis
        Persona ObjetoPersona1 = new Persona(100.0, 200.0,80, "Hombre","Pedro");

        System.out.println("Persona Creadad por otro constructor");
        System.out.println("Nombre: " + ObjetoPersona1.getNombre() );
        System.out.println("Altura: " + ObjetoPersona1.getAltura() );
        System.out.println("Sexo: " + ObjetoPersona1.getSexo() );
        System.out.println("Edad : " + ObjetoPersona1.getEdad() );
        System.out.println("Peso: " + ObjetoPersona1.getPeso() );
        System.out.println("   ");



        //Aquí lo que hacemos es sacar por pantalla un void que ya tenia sus atributos creados
        ObjetoPersona.PersonaBase();
        System.out.println("Pesona ya creada");
        System.out.println("Nombre:  " + ObjetoPersona.getNombre() );
        System.out.println("Altura: " + ObjetoPersona.getAltura() );
        System.out.println("Sexo: " + ObjetoPersona.getSexo() );
        System.out.println("Edad : " + ObjetoPersona.getEdad() );
        System.out.println("Peso: " + ObjetoPersona.getPeso() );
    }


}

