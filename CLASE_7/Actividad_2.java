package CLASE_7;

import java.util.Scanner;

public class Actividad_2 {
    //Después de realizar el ejercicio anterior, agregar que muestre el número mayor y el número menor.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Creación del Arreglo.

        int[] numeros = new int[5];

        // Código para ingresar 5 números.
        int cont=0;
        while (cont<5){
            System.out.println("----- Ingrese el "+(cont+1)+"° número: -----");
            numeros[cont] = scan.nextInt();
            cont++;
        }

        System.out.println("--------------------------------------------");

        // Código para mostrar los 5 números.
        cont=0;
        while (cont<5){
            System.out.println("El "+(cont+1)+"° número es:"+numeros[cont]);
            cont++;
        }

        // Código para hallar el número mayor.
        int numMayor = 0;
        cont = 0;

        while (cont<5){
            if (numMayor<numeros[cont]){
                numMayor=numeros[cont];

            }
            cont++;
        }
        System.out.println("------------------------------------");
        System.out.println("El número mayor es: "+numMayor);

        // Código para hallar el número menor.

        long numMenor = 999999999;
        cont = 0;

        while (cont<5){
            if (numMenor>numeros[cont]){
                numMenor=numeros[cont];

            }
            cont++;
        }
        System.out.println("-----------------------------------");
        System.out.println("El número menor es: "+numMenor);




    }
}
