package Lista2POO;

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = scan.nextInt();

        int soma = 0;

        for(int i = 1; i < num+1; i++){
            soma += i;
        }
        System.out.printf("Soma: %d", soma);
        
    }
}
