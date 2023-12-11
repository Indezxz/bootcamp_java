package CLASE_7;

import java.util.Scanner;

public class Actividad_1 {
    // Hacer un programa que permita al usuario ingresar 5 números y mostrarlos.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numeros = new int[5];
        int cont = 0;

        while (cont < 5) {
            System.out.println("----- Ingrese el " + (cont + 1) + "° número: -----");
            numeros[cont] = scan.nextInt();
            cont++;
        }
        System.out.println("--------------------------------------------");

        cont = 0;

        while (cont < numeros.length) {
            System.out.println("El " + (cont + 1) + "° numero es:" + numeros[cont]);
            cont++;
        }


    }
}
