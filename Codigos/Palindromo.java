package Codigos;
import java.util.Scanner;

public class Palindromo {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a palavra: ");
        String palavra =  scan.nextLine();

        String palavraInversa = "";

        for (int i= palavra.length()-1; i >= 0; i--){
            palavraInversa += palavra.charAt(i);
        }
        
        boolean palindromo = palavra.equalsIgnoreCase(palavraInversa);
        
        System.out.println(palindromo ? "É um palíndromo" : "Não é um palíndromo");

    }
}
