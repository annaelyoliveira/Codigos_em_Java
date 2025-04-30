package Codigos;
import java.util.Scanner;
import java.util.Arrays;

/* Leia 20 elementos em um vetor A e construa o vetor B com elementos de A, porém invertidos, ou seja, o
 primeiro elemento de A passa a ser o último elemento de B, e assim por diante. Mostre os 2 vetores, o
 maior elemento do vetor A e o menor elemento do vetor B. */

public class Vetores {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int vetorA [] = new int[5];
        int vetorB [] = new int[5];

        for(int i = 0; i < 5; i++){
            System.out.printf("Digite o %dº número: ", (i+1));
            vetorA[i] = scan.nextInt();
        }

        int count = 0;
        for(int i = 4; i >= 0; i--){
            vetorB[count] = vetorA[i];
            count++; 
        }

        int maior = 0;
        int menor = vetorB[0];
        for (int i = 0; i < vetorA.length; i++){
            if (vetorA[i] > maior){
                maior = vetorA[i];
            }
            if (vetorB[i] < menor){
                menor = vetorB[i];
            }
        }

        System.out.println("Vetor A: " + Arrays.toString(vetorA) + "\nVetor B: " + Arrays.toString(vetorB) + "\nMaior elemento de A: " + maior + "\nMenor elemento de B: " + menor);

    }
}