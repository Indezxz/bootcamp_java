package CLASE_8;

public class Ejemplo_3 {
    public static void main(String[] args) {
        float sumatoria=0;

        sumatoria += getAreaCuadrado(10,20);
        sumatoria += getAreaCuadrado(30,20);

        System.out.println("LA SUMATORIA ES: "+sumatoria);

    }

    private static float getAreaCuadrado(float ancho, float alto) {

        float area = ancho*alto;

        System.out.println("EL AREA ES: "+area);
        return area;
    }
}
