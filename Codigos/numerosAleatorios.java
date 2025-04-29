package Codigos;


import java.util.Arrays;
import java.util.Random;

public class numerosAleatorios {
    public static void main(String[] args) {
        int numeros [] = new int [10];
        Random rnd = new Random();
        for(int i = 0; i < 10; i++){
            numeros[i] = rnd.nextInt(50);
        }
        System.out.println("Arrays de números: " + Arrays.toString(numeros));
        Arrays.sort(numeros);
        System.out.println("Números ordenados de forma crescente: " + (Arrays.toString(numeros)));
    }
}
