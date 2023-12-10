package CLASE_6;
import java.util.Random;
import java.util.Scanner;
public class Actividad_8 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Imprimir instrucciones del juego
        System.out.println("Bienvenido al juego de Piedra, Papel, Tijeras!");
        System.out.println("Ingrese su elección: piedra, papel o tijeras");

        // Leer elección del usuario
        String eleccionUsuario = scanner.nextLine();

        // Generar una elección aleatoria para la computadora
        String[] opciones = {"piedra", "papel", "tijeras"};
        Random random = new Random();
        int index = random.nextInt(opciones.length);
        String eleccionComputadora = opciones[index];

        // Imprimir la elección del usuario y la computadora
        System.out.println("Usted eligió: " + eleccionUsuario);
        System.out.println("La computadora eligió: " + eleccionComputadora);

        // Determinar el ganador
        if (eleccionUsuario.equals(eleccionComputadora)) {
            System.out.println("¡Es un empate!");
        } else if ((eleccionUsuario.equals("piedra") && eleccionComputadora.equals("tijeras")) ||
                (eleccionUsuario.equals("papel") && eleccionComputadora.equals("piedra")) ||
                (eleccionUsuario.equals("tijeras") && eleccionComputadora.equals("papel"))) {
            System.out.println("¡Usted gana!");
        } else {
            System.out.println("¡La computadora gana!");
        }

    }
}
