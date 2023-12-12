package CLASE_8;

public class Ejemplo_4 {
    public static void main(String[] args) {
        //Generar contraseñas
        String nuevoPassword = generarPassword();
        System.out.println(nuevoPassword);
    }

    private static String generarPassword(){
        double aleatorio = Math.random()*1000000;
        long numeroAleatorio = Math.round(aleatorio);

        String password =  "JDg"+numeroAleatorio;
        return password;
    }
}
