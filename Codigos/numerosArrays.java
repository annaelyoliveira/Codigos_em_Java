package Codigos;


import java.util.Arrays;
import java.util.Scanner;

public class numerosArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numeros [] = new int [10];

        for(int i = 0; i < 3; i++){
            System.out.printf("Digite o %d º número:", (i+1));
            numeros[i] = scan.nextInt();
        }

        for(int i = 0; i < 3; i++){
            System.out.printf("%d º número é: %d \n", (i+1), numeros[i]);
        }
        System.out.println(Arrays.toString(numeros));
    }
}
