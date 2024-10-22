import java.util.Scanner;

public class ejercic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Crear el Scanner
        int mes;

        System.out.print("Introduzca número de mes: ");
        mes = sc.nextInt();

        // Verificar que el mes esté entre 1 y 12
        if (mes < 1 || mes > 12) {
            System.out.println("Mes incorrecto");
        } else {
            // Mostrar el nombre del mes mediante switch
            switch (mes) {
                case 1:
                    System.out.print("Enero");
                    break;
                case 2:
                    System.out.print("Febrero");
                    break;
                case 3:
                    System.out.print("Marzo");
                    break;
                case 4:
                    System.out.print("Abril");
                    break;
                case 5:
                    System.out.print("Mayo");
                    break;
                case 6:
                    System.out.print("Junio");
                    break;
                case 7:
                    System.out.print("Julio");
                    break;
                case 8:
                    System.out.print("Agosto");
                    break;
                case 9:
                    System.out.print("Septiembre");
                    break;
                case 10:
                    System.out.print("Octubre");
                    break;
                case 11:
                    System.out.print("Noviembre");
                    break;
                case 12:
                    System.out.print("Diciembre");
                    break;
            }

            // Mostrar si el mes tiene 30, 31 o 28 días
            if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                System.out.println(" es un mes de 30 días");
            } else if (mes == 2) {
                System.out.println(" es un mes de 28 días");
            } else {
                System.out.println(" es un mes de 31 días");
            }
        }

        sc.close(); // Cerrar el Scanner
    }
}
