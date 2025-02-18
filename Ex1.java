import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        System.out.println("Bem-vindo à disciplina de Estrutura de Dados!");

        Scanner sc = new Scanner(System.in);
        String nome;

        nome = sc.nextLine();

        System.out.printf("Bem vindo %s!", nome);

        sc.close();

    }
}