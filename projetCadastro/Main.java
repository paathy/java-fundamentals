import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pergunta ao usuário se ele tem cadastro
        System.out.println("Você tem cadastro? (true para sim, false para não)");
        boolean temCadastro = scanner.nextBoolean();

        // Verifica se o usuário NÃO tem cadastro
        if (!temCadastro) {
            System.out.println("Cadastro necessário para acessar o sistema.");
        } else {
            System.out.println("Acesso permitido! Bem-vindo.");
        }

        scanner.close(); // Fecha o Scanner para evitar vazamento de recursos
    }
}