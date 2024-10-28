import java.util.Scanner;

public class IngresarPalabra {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese la primera palabra");
        String palabra1 = scanner.nextLine();

        System.out.println("ingrese la segunda palabra");
        String palabra2 = scanner.nextLine();

        System.out.println("ingrese la tercera palabra");
        String palabra3 = scanner.nextLine();

        System.out.println("las palabras ingresadas son");
        System.out.println(palabra1);
        System.out.println(palabra2);
        System.out.println(palabra3);

        scanner.close();




    }
}
