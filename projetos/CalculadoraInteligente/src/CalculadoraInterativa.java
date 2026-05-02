import java.util.Scanner;

public class CalculadoraInterativa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- Calculadora com Menu Interativo ---");
            System.out.println("1. Realizar uma soma");
            System.out.println("2. Realizar uma subtração");
            System.out.println("3. Realizar uma multiplicação");
            System.out.println("4. Realizar uma divisão (Resultado e Resto)");
            System.out.println("5. Elevar um número a uma potência N");
            System.out.println("6. Sair da calculadora");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            if (opcao >= 1 && opcao <= 5) {
                System.out.print("Informe o primeiro número: ");
                double n1 = scanner.nextDouble();
                
                // Para a potência, o segundo número é o expoente
                String textoSegundoNum = (opcao == 5) ? "Informe a potência N: " : "Informe o segundo número: ";
                System.out.print(textoSegundoNum);
                double n2 = scanner.nextDouble();

                switch (opcao) {
                    case 1:
                        System.out.println("Resultado da Soma: " + (n1 + n2));
                        break;
                    case 2:
                        System.out.println("Resultado da Subtração: " + (n1 - n2));
                        break;
                    case 3:
                        System.out.println("Resultado da Multiplicação: " + (n1 * n2));
                        break;
                    case 4:
                        if (n2 != 0) {
                            System.out.println("Resultado da Divisão: " + (n1 / n2));
                            System.out.println("Resto do cálculo: " + (n1 % n2));
                        } else {
                            System.out.println("Erro: Divisão por zero não permitida!");
                        }
                        break;
                    case 5:
                        System.out.println("Resultado da Potência: " + Math.pow(n1, n2));
                        break;
                }
            } else if (opcao == 6) {
                System.out.println("Encerrando a calculadora... Até logo!");
            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 6);

        scanner.close();
    }
}