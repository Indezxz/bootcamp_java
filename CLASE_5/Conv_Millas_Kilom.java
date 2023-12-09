package CLASE_5;

import java.util.Scanner;

public class Conv_Millas_Kilom {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("----- Ingrese una distancia en millas -----");
        double millas = scan.nextDouble();
        double kilometros = millas*1.60934;

        System.out.println("-------------------------------------------");
        System.out.println("La distancia en Kilometros es: "+kilometros);

    }
}
