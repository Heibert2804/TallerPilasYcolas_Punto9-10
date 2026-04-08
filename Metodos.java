import java.util.*;

public class Metodos {

    Scanner sc = new Scanner(System.in);

    // 🔹 Llenar pilas
    public void llenarPilas(Datos d) {

        System.out.println("PILA 1:");
        ingresarPila(d.getPila1());

        System.out.println("\nPILA 2:");
        ingresarPila(d.getPila2());
    }

    private void ingresarPila(Stack<Integer> pila) {
        boolean seguir = true;

        while (seguir) {
            System.out.print("Número: ");
            pila.push(sc.nextInt());

            System.out.print("¿Seguir? 1=Sí 0=No: ");
            if (sc.nextInt() == 0) seguir = false;
        }
    }

    // 🔥 PUNTO 9
    public void separarParImpar(Datos d) {

        Queue<Integer> pares = new LinkedList<>();
        Queue<Integer> impares = new LinkedList<>();

        procesarPila(d.getPila1(), pares, impares);
        procesarPila(d.getPila2(), pares, impares);

        System.out.println("Cola pares: " + pares);
        System.out.println("Cola impares: " + impares);
    }

    private void procesarPila(Stack<Integer> pila, Queue<Integer> pares, Queue<Integer> impares) {

        Stack<Integer> aux = new Stack<>();

        while (!pila.isEmpty()) {
            int num = pila.pop();

            if (num % 2 == 0) {
                pares.add(num);
            } else {
                impares.add(num);
            }

            aux.push(num);
        }

        while (!aux.isEmpty()) {
            pila.push(aux.pop());
        }
    }

    // 🔥 PUNTO 10
    public void llenarHoras(Datos d) {

        int[] horas = d.getHoras();

        for (int i = 0; i < horas.length; i++) {
            System.out.print("Horas empleado " + i + ": ");
            horas[i] = sc.nextInt();
        }

        System.out.print("Valor por hora: ");
        d.setValorHora(sc.nextInt());
    }

    public void calcularPagos(Datos d) {

        Queue<Double> colaPagos = new LinkedList<>();

        int[] horas = d.getHoras();
        int valor = d.getValorHora();

        for (int h : horas) {

            double pago;

            if (h <= 40) {
                pago = h * valor;
            } else if (h <= 48) {
                pago = (40 * valor) + ((h - 40) * valor * 2);
            } else {
                pago = (40 * valor) + (8 * valor * 2) + ((h - 48) * valor * 3);
            }

            colaPagos.add(pago);
        }

        System.out.println("Pagos en cola: " + colaPagos);
    }
}