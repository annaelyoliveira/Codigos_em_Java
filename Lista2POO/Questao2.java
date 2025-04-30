package Lista2POO;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = scan.nextInt();

        for(int i = 1; i < 11; i++){
            System.out.printf("%d x %d = %d\n", num, i, (num*i));
        }

    }
}
