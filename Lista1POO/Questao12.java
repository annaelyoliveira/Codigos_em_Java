import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
   
        System.out.print("Digite o 1º número inteiro:");
        int num1 = scan.nextInt();

        System.out.print("Digite o 2º número inteiro:");
        int num2 = scan.nextInt();

        System.out.print("Digite o operador que deseja + - * / :");
        String operador = scan.next();

        switch (operador) {
            case "+":
                System.out.printf("Você escolheu soma. Resultado: %d", (num1+num2));
                break;
            case "-":
                System.out.printf("Você escolheu subtração. Resultado: %d", (num1-num2));
                break;
            case "*":
                System.out.printf("Você escolheu multiplicação. Resultado: %d", (num1*num2));
                break;
            case "/":
                System.out.printf("Você escolheu divisão. Resultado: %.2f", (num1/num2));
                break;
            default:
                System.out.println("Por favor digite um dos operados: + - * /");
                break;
        }
    }
}
