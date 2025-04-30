package Lista2POO;

import java.util.Scanner;

public class Questao19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro da PA: ");
        int num = scan.nextInt();

        System.out.print("Digite a razão da PA (numero): ");
        int razao = scan.nextInt();

        System.out.print("Quantos termos dessa PA você quer ver? ");
        int termo = scan.nextInt();

        for(int i = 0; i < termo; i++){
            System.out.printf("%d, ", num);
            num = num - razao;
        }

    }
}
