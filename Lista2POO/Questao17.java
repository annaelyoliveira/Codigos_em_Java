package Lista2POO;

import java.util.Scanner;

public class Questao17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = scan.nextInt();

        System.out.println("Sequência de Collatz:");
        System.out.println(num);

        while(true){
            if(num % 2 == 0){
                num = num/2;
            }else{
                num = num*3 + 1;
            }
            System.out.println(num);
            if(num == 1){
                break;
            }
        }
    }
    
}
