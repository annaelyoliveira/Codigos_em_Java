import java.util.Scanner;

public class Questao7{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o seu ano de nascimento (aaaa):");
        int ano = scan.nextInt();
        int idade = 2024 - ano;

        if (idade >=18){
            System.out.printf("Você tem %d anos, é maior de idade", idade);
        }else{
            System.out.printf("Você tem %d anos, não é maior de idade", idade);
        }
    }
}
