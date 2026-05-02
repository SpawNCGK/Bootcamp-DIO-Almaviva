import java.util.Scanner; // 1. Importar a ferramenta

public class Idade { // 2. Nome igual ao do arquivo (sem ponto!)
    public static void main(String[] args) {
        // 3. Ligar a ferramenta
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = leitor.nextLine();

        System.out.println("Olá, " + nome + ", seja bem-vindo! Digite o ano que você nasceu: ");
        int anoNascimento = leitor.nextInt();
        int idade = 2026 - anoNascimento;

        System.out.println("Você tem " + idade + " anos.");
        
        leitor.close();
    }
}