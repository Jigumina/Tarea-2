import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        String [] Cadena;

        System.out.println("Ingrese su nombre, profesión y nacionalidad");
        String datos=teclado.nextLine();
        Cadena=datos.split( " ");

        System.out.println("Nombre: "+ Cadena[0]);
        System.out.println("Profesión: "+ Cadena[1]);
        System.out.println("Nacionalidad: "+ Cadena[2]);

    }
}