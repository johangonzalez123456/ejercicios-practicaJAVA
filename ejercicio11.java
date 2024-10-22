import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduzca valor de N: ");
        String N = sc.next();  // Leer el número como cadena para manejar cada subcadena
        
        // Imprimir progresivamente subcadenas
        for (int i = 1; i <= N.length(); i++) {
            System.out.println(N.substring(0, i));
        }

        sc.close(); // Cerrar el Scanner
    }
}
