package CLASE_6;

import java.util.Scanner;

public class Actividad_3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("----- Ingrese el número celular de una persona -----");
        long telefono = scan.nextLong();
        System.out.println("---------------------------------------------------------------------");
        System.out.println(telefono);
        System.out.println("https://api.whatsapp.com/send?phone="+51+telefono);
    }
}
