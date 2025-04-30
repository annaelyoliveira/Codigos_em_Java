package Lista2POO;

import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) { 
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = scan.nextInt();

        int produto = 1;

        for(int i = 1; i < num+1; i++){
            produto *= i;
        }
        System.out.printf("Produto: %d", produto);
        
    }
}

