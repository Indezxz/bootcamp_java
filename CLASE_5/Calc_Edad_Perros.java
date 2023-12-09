package CLASE_5;

import java.util.Scanner;

public class Calc_Edad_Perros {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("----- Ingrese la Edad de su Perro -----");
        int edadPerro = scan.nextInt();
        int edadReal = edadPerro*7;
        System.out.println("-----------------------------------");
        System.out.println("La Edad en Años perro es: "+edadReal);
    }
}
