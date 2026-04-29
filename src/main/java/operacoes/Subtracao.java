package operacoes;

import java.util.Scanner;

public class Subtracao {
    public static void main(String[] args) {
        EntradaNumeros entradaNumeros = new EntradaNumeros();
        entradaNumeros.pedirNumeros();
        System.out.println("o resultado é: " + (entradaNumeros.x - entradaNumeros.y));
    }
}
