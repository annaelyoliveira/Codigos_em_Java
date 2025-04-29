import java.util.Scanner;

public class Questao18 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite três números inteiros:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        if (num1 > num2) { 
            int menorTemporario = num1;
            num1 = num2;
            num2 = menorTemporario;
        }
        if (num2 > num3) {
            int menorTemporario = num2;
            num2 = num3;
            num3 = menorTemporario;
        }
        if (num1 > num2) {  
            int menorTemporario = num1;
            num1 = num2;
            num2 = menorTemporario;
        }
        
        System.out.printf("Ordem crescente: %d - %d - %d", num1, num2, num3);
        
    }

}
