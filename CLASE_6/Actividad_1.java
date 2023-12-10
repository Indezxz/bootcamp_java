package CLASE_6;

import java.util.Scanner;

public class Actividad_1 {
    //Arma un buscador de países con Google Maps
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("----- Ingrese un país -----");
        String pais = scan.next();
        System.out.println("---------------------------");
        System.out.println("https://www.google.com/maps/search/"+pais);

    }
}
