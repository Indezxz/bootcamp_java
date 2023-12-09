package CLASE_5;

import java.util.Random;
import java.util.Scanner;

public class Adivinar_Numero {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        int numAleatorio= rand.nextInt(100);

        System.out.println("----- Adivina el número aleatorio generado -----");
        int numAdivinado = scan.nextInt();

        System.out.println("----------------------------");
        if (numAleatorio == numAdivinado){
            System.out.println("Adivinaste el número!!");
        }else {
            System.out.println("Número equivocado");
        }
        System.out.println("----------------------------");
        System.out.println("Número generado aleatoriamente: "+numAleatorio);
        System.out.println("Número ingresado : "+numAdivinado);
    }
}
