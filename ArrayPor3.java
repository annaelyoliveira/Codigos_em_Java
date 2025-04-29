import java.util.Scanner;
import java.util.Arrays; 

/* Escreva um algoritmo que leia 8 elementos em um vetor inteiro A. Construa outro vetor B, de mesma
* dimensão de A, com seus elementos sendo a multiplicação do elemento correspondente de A por 3.
* Mostre os elementos de B. */

public class ArrayPor3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int numerosA [] = new int[8];
        int numerosB [] = new int[8];

        for (int i = 0; i < 8; i++){
            System.out.printf("Digite o %dº número: ", (i+1));
            numerosA[i] = scan.nextInt();
        }

        for(int i = 0; i < numerosA.length; i++){
            numerosB[i] = numerosA[i]*3;
        }
        System.out.println("Array B: " + Arrays.toString(numerosB));
    }
}
