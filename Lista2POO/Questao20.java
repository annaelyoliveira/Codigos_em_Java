package Lista2POO;

import java.util.Scanner;

public class Questao20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        System.out.print("Digite um número: ");
        int num = scan.nextInt();

        int divisores = 0;

        System.out.print("Divisores de " + num + ": ");
        for (int i = 1; i <= num; i++){
            if(num % i == 0){
                divisores += i;
                System.out.print(i + ", ");
            }
            
        }
    }
}
