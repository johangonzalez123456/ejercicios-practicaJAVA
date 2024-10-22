import java.util.Scanner;

public class Condicional1_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double dividendo, divisor;

        // Pedir al usuario los dos números
        System.out.print("Introduzca el dividendo: ");
        dividendo = sc.nextDouble();

        System.out.print("Introduzca el divisor: ");
        divisor = sc.nextDouble();

        // Comprobar si el divisor es cero
        if (divisor == 0) {
            System.out.println("No se puede dividir por cero");
        } else {
            // Mostrar el resultado con formato
            double resultado = dividendo / divisor;
            System.out.printf("%.2f / %.2f = %.2f%n", dividendo, divisor, resultado);
        }

        sc.close(); // Cerrar el Scanner
    }
}
