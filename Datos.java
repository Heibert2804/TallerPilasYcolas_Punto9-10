import java.util.*;

public class Datos {

    // Punto 9
    private Stack<Integer> pila1 = new Stack<>();
    private Stack<Integer> pila2 = new Stack<>();

    // Punto 10
    private int[] horas;
    private int valorHora;

    public Datos(int n) {
        horas = new int[n];
    }

    public Stack<Integer> getPila1() { return pila1; }
    public Stack<Integer> getPila2() { return pila2; }

    public int[] getHoras() { return horas; }

    public int getValorHora() { return valorHora; }
    public void setValorHora(int v) { valorHora = v; }
}