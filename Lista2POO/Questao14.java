package Lista2POO;

import java.util.Scanner;

public class Questao14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        System.out.print("Digite um número: ");
        int num = scan.nextInt();

        int divisores = 0;

        for (int i = 1; i < num; i++){
            if(num % i == 0){
                divisores += i;
            }
            
        }

        System.out.println(divisores == num ? "É um número perfeito" : "Não é um número perfeito");
    }
}

