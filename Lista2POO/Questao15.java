package Lista2POO;

import java.util.Scanner;

public class Questao15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número: ");
        String num = scan.nextLine();
        
        int soma = 0;
        for(int i = 0; i < num.length(); i++){
            int numero = Integer.parseInt(String.valueOf(num.charAt(i))); 
            soma += numero;
        }
        System.out.printf("Soma dos digitos de %s = %d", num, soma);
    }
}
