import java.io.*;
import java.util.ArrayList;
import java.util.regex.Pattern;

/**
 * PACKAGE_NAME
 * Nombre_project: DAMJava
 * Parking_MiguelAngel_Torres
 * Created by: magua
 * Date : 23/01/2021
 * Description:
 *
 **/

    enum TipusPlacesParking{
        Discapacitat,
        No_Discapacitat
    }

public class Parking_MiguelAngel_Torres {

        /** Inicializo un par de variables y creo dos arraylist **/
        private int places_no_discapacitats;
        private int places_discapacitats;
        private final String expresion = "^[0-9]{4}[A-Z]{3}$";
        ArrayList <String> matriculacoche_nodiscapacitado = new ArrayList<String>(places_no_discapacitats);
        ArrayList <String> matriculacoche_discapacitado = new ArrayList<String>(places_discapacitats);

        /** Constructor **/
        public Parking_MiguelAngel_Torres(int places_no_discapacitats, int places_discapacitats){
            this.places_no_discapacitats = places_no_discapacitats;
            this.places_discapacitats = places_discapacitats;
        }

        /** Metodos **/

        /** Lee las matriculas que le pasas del fichero y te los coloca aleatoriamente en las plazas, si el fichero no es correcto
         * nos salta una excepción **/
        public void llegirMatricules(String path) throws Exception{

            try {
                String palabras;
                FileReader r = new FileReader(path);
                BufferedReader buffer = new BufferedReader(r);
                while ((palabras = buffer.readLine()) != null) {
                        double aleatorio = Math.random();
                        if (aleatorio < 0.5) {
                            entradaCotxe(palabras);
                        } else {
                            entradaCotxeDiscapacitat(palabras);
                        }
                }
                buffer.close();
            }catch (FileNotFoundException e){
                throw new Exception("ALERTA =====> Fitxer incorrecte o inexistent.");
            }
        }

        /** Mira si la matricula esta bien escrita, si un sitio tiene la palabra libre (ya que en salidaCotxe por el arraylist sustituyo el coche que saldria
         * por la palabra libre ) mete un garrulo aleatoriamente en un 10% de posibilidad y que no esten ya aparcados, **/
        public int entradaCotxe(String matricula)throws Exception{
            double aleatorio = Math.random();
            double garrulo = aleatorio;
            try {
                if (Pattern.matches(expresion,matricula)) {
                    if (matriculacoche_nodiscapacitado.contains("Libre")){
                        matriculacoche_nodiscapacitado.set(matriculacoche_nodiscapacitado.indexOf("Libre"),matricula);
                    }else if(!matriculacoche_nodiscapacitado.contains(matricula) && !matriculacoche_discapacitado.contains(matricula)) {
                        if ((matriculacoche_nodiscapacitado.size()) < places_no_discapacitats) {
                            if (garrulo > 0.1){
                                matriculacoche_nodiscapacitado.add(matricula);
                                if (matriculacoche_nodiscapacitado.size() * 100 / places_no_discapacitats >= 85) {
                                    throw  new  Exception ("ALERTA =====> Ocupació de places per discapacitats supera el 85%.");
                                }
                            }else{
                                entradaCotxeDiscapacitat(matricula);
                                throw new Exception("ALERTA =====> Garrulo detected!!! Ha aparcat a la plaça: " + (matriculacoche_discapacitado.indexOf(matricula) +1));
                            }
                        } else {
                            throw  new  Exception ("ALERTA =====> Parking per no discapacitats ple.");
                        }
                    }else {
                        throw  new  Exception ("ALERTA =====> El cotxe ja està al parking. No pot estrar.");
                    }
                }else {
                    throw  new  Exception ("ALERTA ======> Matrícula incorrecta.");
                }
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
            return matriculacoche_nodiscapacitado.indexOf(matricula);
        }

        /** Mira si la matricula esta bien escrita, si un sitio tiene la palabra libre (ya que en salidaCotxe por el arraylist sustituyo el coche que saldria
         * por la palabra libre ) mete un garrulo aleatoriamente en un 10% de posibilidad y que no esten ya aparcados. Si en la parte de las plazas no discapacitados hay sitio
         *  y en la plaza de discapacitados no este llena pasará a discapacitados **/

        public int entradaCotxeDiscapacitat (String matricula) throws Exception {
            try {
                if (Pattern.matches(expresion,matricula)) {
                    if (matriculacoche_discapacitado.contains("Libre")){
                        matriculacoche_discapacitado.set(matriculacoche_discapacitado.indexOf("Libre"),matricula);
                    } else if(!matriculacoche_discapacitado.contains(matricula) && !matriculacoche_nodiscapacitado.contains(matricula)) {
                        if (matriculacoche_discapacitado.size() >= places_discapacitats && matriculacoche_nodiscapacitado.size() < places_no_discapacitats){
                            matriculacoche_nodiscapacitado.add(matricula);
                            throw new Exception("ALERTA ======> Parking per discapacitats ple. Ha ocupat plaça normal num: " + (matriculacoche_nodiscapacitado.indexOf(matricula) +1));
                        } else if ((matriculacoche_discapacitado.size()) < places_discapacitats) {
                            matriculacoche_discapacitado.add(matricula);
                            if (matriculacoche_discapacitado.size() * 100 / places_discapacitats >= 85) {
                                throw  new  Exception("ALERTA ======> Ocupació de places per discapacitats supera el 85%.");
                            }
                        } else {
                            throw  new  Exception("ALERTA ======> Parking per discapacitats ple.");
                        }
                    }else {
                        throw  new  Exception("ALERTA ======> El cotxe ja està al parking. No pot estrar.");
                    }
                }else {
                    throw  new  Exception("ALERTA ======> Matrícula incorrecta.");
                }
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
            return matriculacoche_discapacitado.indexOf(matricula);
        }

        /** Sale el coche de no discapacitados, sustituye esa matricula por la palabra libre
         * Si la matrícula que se pasa no esta en el parking, te dará una excepción **/
        public void surtCotxe(String matricula) throws Exception{
            try {
                if (matriculacoche_nodiscapacitado.contains(matricula)){
                    matriculacoche_nodiscapacitado.set(matriculacoche_nodiscapacitado.indexOf(matricula), "Libre");
                }else {
                    throw  new  Exception ("El cotxe no és al parking.");
                }
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }

        /** Sale el coche de discapacitados, ustituye esa matricula por la palabra libre
         * Si la matrícula que se pasa no esta en el parking, te dará una excepción **/

        public void surtCotxeDiscapacitats(String matricula) throws Exception{
            try {
                if (matriculacoche_discapacitado.contains(matricula)) {
                    matriculacoche_discapacitado.set(matriculacoche_discapacitado.indexOf(matricula), "Libre");
                } else {
                    throw new Exception("El cotxe no és al parking.");
                }
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }

        /** Optienes las plazas ocupadas **/
        public int getPlacesOcupades (TipusPlacesParking tipus) {
            int contadornodis = 0;
            int contadordis = 0;

            /** Bucle 1, Cuenta cuatos libres hay en no discapacitados **/
            if (matriculacoche_nodiscapacitado.contains("Libre")) {
                for (String s : matriculacoche_nodiscapacitado) {
                    if (s.equals("Libre")) {
                        contadornodis++;
                    }
                }
            }

            /** Bucle 2, Cuenta cuatos libres hay en discapacitados **/

            if (matriculacoche_discapacitado.contains("Libre")) {
                for (String s : matriculacoche_discapacitado) {
                    if (s.equals("Libre")) {
                        contadordis++;
                    }
                }
            }

            /** Retorna las plazas ocupadas dependiendo del tipo, si es discapacitado o no **/
            if (tipus == (TipusPlacesParking.No_Discapacitat)){
                return matriculacoche_nodiscapacitado.size() - contadornodis;
            }else {
                return matriculacoche_discapacitado.size() - contadordis;
            }
        }

        /** Obtienes las plazas libres **/
        public int getPlacesLliures (TipusPlacesParking tipus) {
            int contadornodis = 0;
            int contadordis = 0;

            /** Bucle 1, Cuenta cuatos libres hay en no_discapacitados **/
            if (matriculacoche_nodiscapacitado.contains("Libre")) {
                for (String s : matriculacoche_nodiscapacitado) {
                    if (s.equals("Libre")) {
                        contadornodis++;
                    }
                }
            }

            /** Bucle 2, Cuenta cuatos libres hay en discapacitados **/

            if (matriculacoche_discapacitado.contains("Libre")) {
                for (String s : matriculacoche_discapacitado) {
                    if (s.equals("Libre")) {
                        contadordis++;
                    }
                }
            }

            /** Retorna las plazas ocupadas dependiendo del tipo, si es discapacitado o no **/
            if (tipus == (TipusPlacesParking.No_Discapacitat)){
                return (places_no_discapacitats + contadornodis) - matriculacoche_nodiscapacitado.size();
            }else {
                return (places_discapacitats + contadordis) - matriculacoche_discapacitado.size();
            }
        }

        /** Guarda las matriculas en una ruta, si la ruta está en blanco salta una excepción **/
        public void guardarMatricula(String path) throws Exception {

            if (path.isBlank()) {
                throw new Exception("ALERTA =====> Fitxer incorrecte o inexistent.");
            } else {
                /** Te elimina la palabra libre en caso de que haya en el array para solo pasar las matriculas al txt en discapacitados **/

                if (matriculacoche_discapacitado.contains("Libre")) {
                    for (int i = 0; i < matriculacoche_discapacitado.size(); i++) {
                        if (matriculacoche_discapacitado.get(i).equals("Libre")) {
                            matriculacoche_discapacitado.remove(i);
                        }
                    }
                }

                /** Te elimina la palabra libre en caso de que haya en el array para solo pasar las matriculas al txt en no discapacitados **/

                if (matriculacoche_nodiscapacitado.contains("Libre")) {
                    for (int i = 0; i < matriculacoche_nodiscapacitado.size(); i++) {
                        if (matriculacoche_nodiscapacitado.get(i).equals("Libre")) {
                            matriculacoche_nodiscapacitado.remove(i);
                        }
                    }
                }

                /** Nos metes las dos arrays ya filtradas al documento **/
                File f = new File(path);
                FileWriter fw = new FileWriter(f);
                BufferedWriter escritura = new BufferedWriter(fw);

                /** Primero nos mete los discapacitados**/
                for (String s : matriculacoche_discapacitado) {
                    escritura.write(s);
                    escritura.newLine();
                }
                /** Despues nos mete los NO discapacitados**/
                for (String s : matriculacoche_nodiscapacitado) {
                    escritura.write(s);
                    escritura.newLine();
                }
                escritura.close();
            }
        }
    }




