import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        System.out.println("Digite 3 números: ");

        Scanner sc = new Scanner(System.in);
        
        int n1, n2, n3, maior;

        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();

        if (n1 >= n2 && n1 >= n3) {
            maior = n1;
        } else if (n2 >= n1 && n2 >= n3) {
            maior = n2;
        } else {
            maior = n3;
        }
        
        System.out.printf("O maior número é %d", maior);

        sc.close();

        
    }
}
