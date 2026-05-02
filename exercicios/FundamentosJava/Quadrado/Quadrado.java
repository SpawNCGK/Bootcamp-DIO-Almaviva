import java.util.Scanner;

public class Quadrado {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o tamanho da lateral do quadrado:");
        double lateral = leitor.nextDouble();
        double area = lateral * lateral;
        System.out.println("A área do quadrado é: " + area);
        leitor.close();
    }
}

