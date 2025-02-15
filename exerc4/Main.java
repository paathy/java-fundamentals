import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            var scanner = new Scanner(System.in);
            System.out.println("Qual a idade de Pathy?");
            var value1 = scanner.nextInt();
            System.out.println("Qual a idade de Hennan?");
            var value2 = scanner.nextInt();
            var valorTotal = value2 - value1 ;
            System.out.printf("A diferença de idade é é %s", valorTotal);
    }

}
