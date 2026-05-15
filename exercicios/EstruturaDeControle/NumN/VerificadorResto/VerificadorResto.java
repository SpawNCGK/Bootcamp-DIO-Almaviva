import java.util.Scanner;

public class VerificadorResto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o número inicial (divisor): ");
        int inicial = sc.nextInt();

        while (true) {
            System.out.print("Informe um novo número: ");
            int n = sc.nextInt();

            if (n < inicial) {
                System.out.println("Menor que o inicial. Ignorado.");
                continue; // Volta para o início do loop
            }

            if (n % inicial != 0) {
                System.out.println("Resto diferente de zero. Encerrando.");
                break; // Sai do loop
            }
            
            System.out.println("Resto é zero. Próximo...");
        }
        sc.close();
    }
}