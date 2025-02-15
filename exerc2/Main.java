import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Qual o tamanho lateral do quadrado?");
        var value1 = scanner.nextInt();
        var valorTotal = value1 * value1;
        System.out.printf("A área do cubo é %s", valorTotal);

    }
}
