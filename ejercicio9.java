import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        int H, M, S;
        Scanner sc = new Scanner(System.in);

        // Pedir hora, minutos y segundos al usuario
        System.out.print("Introduzca hora: ");
        H = sc.nextInt();
        System.out.print("Introduzca minutos: ");
        M = sc.nextInt();
        System.out.print("Introduzca segundos: ");
        S = sc.nextInt();

        // Validar si la hora es correcta
        if (H >= 0 && H < 24 && M >= 0 && M < 60 && S >= 0 && S < 60) {
            System.out.println("Hora correcta");
        } else {
            System.out.println("Hora incorrecta");
        }

        sc.close(); // Cerrar el Scanner para liberar recursos
    }
}
