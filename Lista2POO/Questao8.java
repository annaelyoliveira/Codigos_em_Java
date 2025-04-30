package Lista2POO;

import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número: "); 
        int num = scan.nextInt();

        int count = 0; 

        for(int i = 1; i < num+1; i++){
            if(num % i == 0){
                count ++;
            }
        }
        System.out.printf(count == 2 ? "É primo" : "Não é primo");
    }
}

