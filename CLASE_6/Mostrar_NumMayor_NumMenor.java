package CLASE_6;

import java.util.Scanner;

public class Mostrar_NumMayor_NumMenor {
    public static void main(String[] args) {
        int numMenor;
        int numMayor;

        Scanner scan = new Scanner(System.in);
        System.out.println("----- Ingrese el Primer Número -----");
        int num1 = scan.nextInt();
        System.out.println("----- Ingrese el Segundo Número -----");
        int num2 = scan.nextInt();
        System.out.println("----- Ingrese el Tercer Número -----");
        int num3 = scan.nextInt();

        numMenor = num1;
        if (numMenor>num2 ){
            numMenor=num2;
        } if(numMenor>num3){
            numMenor=num3;
        }

        System.out.println("------------------");
        System.out.println("El número menor es: "+numMenor);
        System.out.println("------------------");

        numMayor = num1;
        if (numMayor<num2 ){
            numMayor=num2;
        } if(numMayor<num3){
            numMayor=num3;
        }
        System.out.println("El número mayor es: "+numMayor);
    }
}
