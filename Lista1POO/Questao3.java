import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
   
        System.out.print("Digite o 1º número:");
        float num1 = scan.nextFloat();

        System.out.print("Digite o 2º número:");
        float num2 = scan.nextFloat();

        System.out.println("Soma: " + (num1+num2) + "\nSubtração: " + (num1-num2) + "\nMultiplicação: " + (num1 * num2) + "\nDivisão: " + (num1/num2));
    }
}
