package CLASE_8;

import java.util.Scanner;

public class Funciones {
    public static void main(String[] args) {
        calcularPrecioFinal("Camisa",40,10);
        calcularPrecioFinal("Zapatilla",100,20);
        int num = ingresarNumero();
        System.out.println(num);

    }

    public static void  calcularPrecioFinal(String producto, double precio, double porcentaje_desc){
        double precio_final = precio - (porcentaje_desc*precio)/100;
        System.out.println("El precio final de 1 "+producto+" es: $"+precio_final);
    }
    public static int ingresarNumero(){
        Scanner scan = new Scanner(System.in);

        int numero;
        numero = scan.nextInt();

        return numero;
    }
}
