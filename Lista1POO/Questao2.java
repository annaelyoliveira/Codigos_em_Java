import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
       
        System.out.print("Digite seu nome:");
        String nome = scan.nextLine();
       
        System.out.print("Digite sua idade:");
        int idade = scan.nextInt();

        System.out.printf("Oi %s você tem %d anos", nome, idade);
    }
}
