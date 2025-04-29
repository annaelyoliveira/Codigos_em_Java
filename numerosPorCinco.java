

import java.util.Arrays;
import java.util.Scanner;

public class numerosPorCinco {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        int array [] = new int[91];
        int pos = 0;

        for (int i = 1000; i < 2000; i++){
            if(i % 11 == 5){
                array[pos] = i;
                pos++;
            }
        }
        
        System.out.println("Números divisel por 11 com resto 5 no intervalo de 1000 a 1999: " + Arrays.toString(array));

    }
}
