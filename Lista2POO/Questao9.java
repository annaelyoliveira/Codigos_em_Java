package Lista2POO;

import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número: "); 
        int num = scan.nextInt();

        for(int i = 1; i <num+1; i++){
            System.out.println(1+ "/" + i);
        }
    }
}
