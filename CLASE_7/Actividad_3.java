package CLASE_7;

import java.util.Scanner;
public class Actividad_3 {
    //Ahora, hay que mostrar el promedio. Para hacer esto se suman todos los números y se divide por 5, ya que el usuario agregó 5 números.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numeros = new int[5];

//        while (cont < 5) {
//            System.out.println("----- Ingrese el " + (cont + 1) + "° número: -----");
//            numeros[cont] = scan.nextInt();
//            cont++;
//        }


        // Codigo para ingresar los 5 números con do while.

        int cont = 0;
        do {
            System.out.println("----- Ingrese el " + (cont + 1) + "° número: -----");
            numeros[cont] = scan.nextInt();
            cont++;
        }while (cont < 5);

        System.out.println("--------------------------------------------");


//        while (cont < numeros.length) {
//            System.out.println("El " + (cont + 1) + "° numero es:" + numeros[cont]);
//            cont++;
//        }

        // Codigo para ingresar los 5 números con for.

        for (int i = 0; i<numeros.length; i++) {
            System.out.println("El " + (i + 1) + "° numero es:" + numeros[i]);
        }
        
        // Codigo para hallar el promedio con for.
        int sumaNumeros = 0;
        for (int j = 0; j < numeros.length; j++) {
        sumaNumeros = sumaNumeros+ numeros[j];

        }
        double promedio;
        promedio= (double) sumaNumeros/numeros.length; // "Casting" para convertir el dato entero a decimal.

        System.out.println("-------------------------------------");
        System.out.println("El Promedio es: "+promedio);

    }
}
