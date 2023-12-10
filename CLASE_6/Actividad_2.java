package CLASE_6;

import java.util.Scanner;

public class Actividad_2 {
    //Arma un buscador de tweets para Twitter.com.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("----- Ingrese el nombre de una celebridad (de una sola palabra) -----");
        String nombre = scan.next();
        System.out.println("---------------------------------------------------------------------");
        System.out.println("https://twitter.com/search?q="+nombre);
    }
}
