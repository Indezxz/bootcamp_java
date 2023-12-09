package CLASE_5;
import java.util.Scanner;
public class Calculadora_IMC {
    public static void main(String[] args) {

        //Peso en KG / altura en metros al cuadrado
        Scanner scan = new Scanner(System.in);

        System.out.println("---------- INGRESE SU PESO(Kg) ---------");
        double peso = scan.nextDouble();
        System.out.println("---------- INGRESE SU ALTURA --------");
        double altura = scan.nextDouble();
        double indiceMasaCorporal = peso / (altura*altura);

        System.out.println(indiceMasaCorporal);

        //Mayor a 30 Obesidad
        if (indiceMasaCorporal>=30){
            System.out.println("Estas en estado de OBESIDAD");
        }
        //Entre 25 y 30 Sobrepeso
        if (indiceMasaCorporal>=25 && indiceMasaCorporal<30){
            System.out.println("Estas en estado de SOBREPESO");
        }
        //Entre 18.5 y 25 Normal
        if (indiceMasaCorporal>=18.5 && indiceMasaCorporal<25){
            System.out.println("Estas en estado NORMAL");
        }
        //Menor a 18.5 Debajo del Normal
        if (indiceMasaCorporal<18.5){
            System.out.println("Estas en estado DEBAJO DEL NORMAL");
        }
    }
}
