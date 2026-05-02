import java.util.Scanner;

public class Retangulo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a largura do retângulo:");
        int largura = leitor.nextInt();

        System.out.println("Digite a altura do retângulo:");
        int altura = leitor.nextInt();

        System.out.println("Área do retângulo: " + (largura * altura));
        System.out.println("Perímetro do retângulo: " + (2 * (largura + altura)));      
        leitor.close();
    }
}