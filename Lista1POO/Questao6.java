import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o seu salário:");
        float salario = scan.nextFloat();

        float novoSalario = (float)((0.15*salario) + salario);

        System.out.printf("O seu salário agora é %.2f \nVocê teve um aumento de 15%%", novoSalario);


    }        
}
