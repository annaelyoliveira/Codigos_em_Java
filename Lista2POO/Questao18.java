package Lista2POO;

import java.util.Scanner;

public class Questao18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String numeros [] = new String[5];

        
        for (int i = 0; i < 5; i++){
            System.out.print("Digite o número: ");
            numeros[i] = scan.next();
        }

        System.out.println("Números palíndromos no intervalo:");
        for (int i = 0; i < 5; i++){
           if(ehPalindromo(numeros[i])){
                System.out.println(numeros[i]);
            }
        }

    }

    public static boolean ehPalindromo(String numero) {
        String numeroInverso = "";

        for (int i= numero.length()-1; i >= 0; i--){
            numeroInverso += numero.charAt(i);
        }
        
        boolean palindromo = numero.equals(numeroInverso);
        
        
        return palindromo;
    }
}
