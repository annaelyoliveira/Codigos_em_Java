package Lista2POO;

import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int num = scan.nextInt();

        int soma = 0;
        for(int i =1; i < num; i++){
            if(i % 2 != 0){
                soma += i;
            }
        }
        System.out.println("Soma: " + soma);

    }
}
