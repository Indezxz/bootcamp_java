package CLASE_8;

public class Ejemplo_2 {
    public static void main(String[] args) {

        calcularArea(10,20);
        calcularArea(30,20);

    }

    private static void calcularArea(float ancho, float alto) {

        float area = ancho*alto;

        System.out.println("EL AREA ES: "+area);
    }
}
