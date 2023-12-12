package CLASE_8;

import java.util.Scanner;

public class Ejemplo_1 {
    //Codigo que permite al usuario ingresar 5 números y mostrarlos.
    public static void main(String[] args) {

        System.out.println("----- INGRESE EL TAMAÑO DEL ARRAY -----");
        int tamaño = ingresarNumero();
        int[] numeros = new int[tamaño];



        pedirNumeros(numeros);
        System.out.println("--------------------------------------------");
        mostrarNumeros(numeros);



    }


    //pedir números dependiendo del tamaño del array
    private static void pedirNumeros(int numeros[]){
        int cont = 0;
        while (cont < numeros.length) {
            System.out.println("----- Ingrese el " + (cont + 1) + "° número: -----");
            numeros[cont] = ingresarNumero();

            cont++;
        }
    }
    private static int ingresarNumero(){
        Scanner scan = new Scanner(System.in);

        int numero;
        numero = scan.nextInt();

        return numero;
    }

    private static void mostrarNumeros(int numeros[]){
        int cont = 0;
        while (cont < numeros.length) {
            System.out.println("El " + (cont + 1) + "° numero es:" + numeros[cont]);
            cont++;
        }
    }



}
