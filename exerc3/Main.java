import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Qual o valor da altura do retângulo?");
        var value1 = scanner.nextInt();
        System.out.println("Qual o valor da base do retângulo?");
        var value2 = scanner.nextInt();
        var valorTotal = value2 * value1;
        System.out.printf("A área do retângulo é %s", valorTotal);

    }
}
