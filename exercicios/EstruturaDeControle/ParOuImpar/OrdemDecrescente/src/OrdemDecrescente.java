import java.util.Scanner;

public class OrdemDecrescente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int n1 = sc.nextInt();
        System.out.print("Digite o segundo (maior que o primeiro): ");
        int n2 = sc.nextInt();
        System.out.print("Escolha (par ou impar): ");
        String escolha = sc.next();

        // O i começa no maior (n2) e vai diminuindo até o menor (n1)
        for (int i = n2; i >= n1; i--) {
            if (escolha.equalsIgnoreCase("par") && i % 2 == 0) {
                System.out.println(i);
            } else if (escolha.equalsIgnoreCase("impar") && i % 2 != 0) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}