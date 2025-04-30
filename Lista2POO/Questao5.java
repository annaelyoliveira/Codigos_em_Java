package Lista2POO;

import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o número: ");
        int num = scan.nextInt();

        int num1 = 0; 
        int num2 = 1;

        for(int i = 1; i < num+1; i++){
            System.out.println(num1);

            int fibo = num1 + num2;
            num1 = num2;
            num2 = fibo;
        }
        
    }
    
}
