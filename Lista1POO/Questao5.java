import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o 1º número:");
        float num1 = scan.nextFloat();

        System.out.print("Digite o 2º número:");
        float num2 = scan.nextFloat();
       
        System.out.print("Digite o 3º número:");
        float num3 = scan.nextFloat();

        float maior = num1;
        float menor = num1;

        if(num2 > maior){
            maior = num2;
        }
        if(num3 > maior){
            maior = num3;
        }


        if(num2 < menor){
            menor = num2;
        }
        if(num3 < menor){
            menor = num3;
        }


        System.out.println("O maior número é: " + maior + "\nO menor número é: " + menor);
    }
}
