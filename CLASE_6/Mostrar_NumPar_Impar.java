package CLASE_6;

import java.util.Scanner;

public class Mostrar_NumPar_Impar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("----- Ingresa el Primer Número -----");
        int num1 = scan.nextInt();

       if (num1 % 2 == 0 ){
           System.out.println("Su número es PAR");
       }else {
           System.out.println("Su número es IMPAR");
       }


    }
}
