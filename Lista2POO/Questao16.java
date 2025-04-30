package Lista2POO;

import java.util.Scanner;

public class Questao16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o 1º número: ");
        int num1 = scan.nextInt();
        System.out.print("Digite o 2º número: ");
        int num2 = scan.nextInt();

        int maior = 0; 
        int indice = num1;

        if(num1 < num2){
            indice = num2;
        }

        for (int i = 1; i < indice+1; i++){
            if(num1 % i == 0 && num2 % i == 0){
                if(i > maior){
                    maior = i;
                }
            }
        }
        System.out.printf("O MDC de %d e %d é %d", num1, num2, maior);


    }
}
