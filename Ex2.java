import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        int n1, n2, soma;

        System.out.println("Digite o primeiro número: ");

        Scanner sc = new Scanner(System.in);

        n1 = sc.nextInt();

        System.out.println("Digite o segundo número: ");

        Scanner sc2 = new Scanner(System.in);

        n2 = sc2.nextInt();

        soma = n1 + n2;

        System.out.printf("A soma entre %d e %d é %d", n1, n2, soma);

        sc.close();
        sc2.close();
    }
}