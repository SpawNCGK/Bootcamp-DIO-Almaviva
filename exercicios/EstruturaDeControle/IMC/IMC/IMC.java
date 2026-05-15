import java.util.Locale;
import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.print("Digite seu peso (kg): ");
            double peso = sc.nextDouble();
            System.out.print("Digite sua altura (ex: 1.75): ");
            double altura = sc.nextDouble();
            
            double imc = peso / (altura * altura);
            System.out.printf("Seu IMC é: %.2f\n", imc);
            
            if (imc <= 18.5) {
                System.out.println("Abaixo do peso");
            } else if (imc <= 24.9) {
                System.out.println("Peso ideal");
            } else if (imc <= 29.9) {
                System.out.println("Levemente acima do peso");
            } else if (imc <= 34.9) {
                System.out.println("Obesidade Grau I");
            } else if (imc <= 39.9) {
                System.out.println("Obesidade Grau II (Severa)");
            } else {
                System.out.println("Obesidade III (Mórbida)");
            }
        }
    }
}