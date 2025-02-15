import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual seu nome?");
        String name = scanner.next();
        System.out.println("Qual seu ano de nascimento?");
        int age = scanner.nextInt();
        var anoNascimento = age;
        var idadeAtual = 2024 - age;
        System.out.printf("Olá %s sua idade é: %s", name,idadeAtual);



    }
    }
