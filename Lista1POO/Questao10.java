import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite sua altura (em m):");
        float altura = scan.nextFloat(); 

        System.out.print("Digite seu peso:");
        float peso = scan.nextFloat();

        float imc = peso/(altura*altura);

        if(imc < 18.5){
            System.out.printf("Seu IMC é: %.2f Você está abaixo do peso", imc);
        }else if (imc >=18.5 && imc <= 24.9){
            System.out.printf("Seu IMC é: %.2f Você está no peso adequado.", imc);
        }else if (imc >=25 && imc <=29.9){
            System.out.printf("Seu IMC é: %.2f Você está com sobrepeso.", imc);
        }else if(imc >=30 && imc <=34.9){
            System.out.printf("Seu IMC é: %.2f Você está com obesidade nivel 1.", imc);
        }else if(imc >=35 && imc <=39.9){
            System.out.printf("Seu IMC é: %.2f Você está com obesidade nivel 2.", imc);
        }else{
            System.out.printf("Seu IMC é: %.2f Você está com obesidade nivel 3.", imc);
        }

    }
}
