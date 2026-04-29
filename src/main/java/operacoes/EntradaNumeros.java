package operacoes;
import java.util.Scanner;

public class EntradaNumeros {
    int x;
    int y;

    public void pedirNumeros(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("De o primeiro valor: ");
        x = scanner.nextInt();
        System.out.println("De o segundo valor: ");
        y = scanner.nextInt();
    }
}
