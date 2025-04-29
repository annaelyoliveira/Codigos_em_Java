import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o número:");
        int numero = scan.nextInt();
       
        System.out.println("O número " + numero + " ao quadrdo é " + (numero*numero));
    }
}
