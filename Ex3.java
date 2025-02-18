import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        System.out.println("Digite um número: ");

        Scanner sc = new Scanner(System.in);
        int n1;
        //boolean par_impar;

        n1 = sc.nextInt();

        if (n1 % 2 == 0) {
            System.out.printf("O número %d é par.", n1);
        }
        else {
            System.out.printf("O número %d é ímpar.", n1);
        }

        sc.close();

    }
}