package Lista2POO;

import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    
        System.out.print("Digite um número: "); 
        String num = scan.nextLine();
    
        System.out.printf("O número tem %d dígitos.", num.length());
    
    }
}

