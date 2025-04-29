import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a 1ª nota:");
        float nota1 = scan.nextFloat();

        System.out.print("Digite a 2ª nota:");
        float nota2 = scan.nextFloat();

        System.out.print("Digite a 3ª nota:");
        float nota3 = scan.nextFloat();

        float media = (nota1+nota2+nota3)/3;

        if (media >= 7){
            System.out.printf("Sua media é %.1f Você está Aprovado", media);
        }if (media < 7 && media >= 4){
            System.out.printf("Sua media é %.1f Você está Em recuperação", media);
        }if (media < 4){
            System.out.printf("Sua media é %.1f Você está Reprovado", media);
        }

    }
}
