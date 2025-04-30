package Lista2POO;

import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: "); 
        String num = scan.nextLine();

        for(int i = num.length()-1; i >= 0; i--){
            System.out.print(num.charAt(i));
        }

    }
    
}
