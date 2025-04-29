package Codigos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner; 

public class ArraysPares {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int numeros [] = new int[10];
        ArrayList<Integer> pares = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            System.out.printf("Digite o %dº número: ", (i+1));
            numeros[i] = scan.nextInt();
        }

        for (int i= 0; i < numeros.length; i++){
            if(numeros[i] % 2 == 0){
                pares.add(numeros[i]);
            }
        }

        System.out.printf("Array: " + Arrays.toString(numeros) + "\nNúmeros pares nesse array: " + pares);

    }
}
