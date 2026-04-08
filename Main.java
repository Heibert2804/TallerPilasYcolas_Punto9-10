import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Cantidad empleados: ");
        int n = sc.nextInt();

        Datos d = new Datos(n);
        Metodos m = new Metodos();

        int op;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Llenar pilas (Punto 9)");
            System.out.println("2. Separar pares e impares");
            System.out.println("3. Ingresar horas (Punto 10)");
            System.out.println("4. Calcular pagos");
            System.out.println("0. Salir");

            op = sc.nextInt();

            switch (op) {

                case 1:
                    m.llenarPilas(d);
                    break;

                case 2:
                    m.separarParImpar(d);
                    break;

                case 3:
                    m.llenarHoras(d);
                    break;

                case 4:
                    m.calcularPagos(d);
                    break;

                case 0:
                    System.out.println("Fin");
                    break;

                default:
                    System.out.println("Error");
            }

        } while (op != 0);

        sc.close();
    }
}