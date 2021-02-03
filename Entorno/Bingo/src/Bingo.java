import java.util.ArrayList;

/**
 * PACKAGE_NAME
 * Nombre_project: DAMJava
 * Bingo
 * Created by: magua
 * Date : 03/02/2021
 * Description:
 **/
public class Bingo {

    ArrayList<Integer> jugador1 = new ArrayList<Integer>(10);
    ArrayList <Integer> jugador2 = new ArrayList<Integer>(10);


    public void Jugar(){
        for (int i = 0; i < 10 ; i++) {
            int ramdom1 = (int) (Math.random() * 99);
            jugador1.add(ramdom1);
            int ramdom2 = (int) (Math.random() * 99);
            jugador2.add(ramdom2);

        }
    }
    public void Juego(){
        while (!jugador1.isEmpty() && !jugador2.isEmpty()){
            int ramdom = (int) (Math.random() * 99);

            if (jugador1.contains(ramdom)){
            jugador1.remove(Integer.valueOf(ramdom));
            }

            if (jugador2.contains(ramdom)){
            jugador2.remove(Integer.valueOf(ramdom));
            }
        }

        if (jugador1.isEmpty() && jugador2.isEmpty()){
            System.out.println("Los jugadores han empatado");
        }else if (jugador1.isEmpty()){
            System.out.println("El Ganador es el jugador 1.");
        }else if (jugador2.isEmpty()){
            System.out.println("El Ganador es el jugador 2.");
        }

    }


    public static void main(String[] args) {

        Bingo bingo = new Bingo();
        bingo.Jugar();
        System.out.println("Jugado 1: " + bingo.jugador1);
        System.out.println("Jugado 2: " + bingo.jugador2);
        bingo.Juego();
        System.out.println("Jugado 1: " + bingo.jugador1);
        System.out.println("Jugado 2: " + bingo.jugador2);

    }

}
