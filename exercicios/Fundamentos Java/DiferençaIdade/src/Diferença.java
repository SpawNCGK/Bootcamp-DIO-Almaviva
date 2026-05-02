import java.util.Scanner;

public class DiferençaIdade {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o seu nome? ");
        String name = sc.nextLine();
        System.out.println("Olá, " + name + "!Digite sua idade: ");
        int age = sc.nextInt();
        System.out.println("Qual o nome da outra pessoa? ");
        String otherName = sc.next();
        System.out.println("Olá, " + otherName + "! Qual a idade da outra pessoa? ");
        int otherAge = sc.nextInt();
        System.out.println("A idade da outra pessoa é: " + otherAge);
        sc.close();
        System.out.println("A diferença de idade entre " + name + " e " 
        + otherName + " é: " + Math.abs(age - otherAge) + " anos.");
//Aqui eu queria mencionar que foi a primeira vez que usei o Math.abs, 
// e achei muito interessante, pois ele retorna o valor absoluto de um número, ou seja,
// a diferença entre as idades, independentemente de qual é maior. 
// Isso torna o código mais simples e fácil de entender.
    }
}