package CLASE_6;

import java.util.Scanner;

public class Mostrar_Promedio {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("----- Ingresa el Primer Número -----");
        int num1 = scan.nextInt();

        System.out.println("----- Ingresa el Segundo Número -----");
        int num2= scan.nextInt();

        System.out.println("----- Ingresa el Tercer Número -----");
        int num3 = scan.nextInt();

        double promedio = (num1+num2+num3)/3;
        System.out.println("----------------------------");
        System.out.println("EL PROMEDIO ES: "+promedio);
    }
}
