import java.util.Scanner;

public class Questao13 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scan.nextInt();

        if(numero% 5 == 0 && numero%3 == 0){
            System.out.println(numero + " É múltiplo de 3 e de 5.");
        }else if(numero%5 == 0){
            System.out.println(numero +" É múltiplo de 5.");
        }else if(numero% 3 == 0){
            System.out.println(numero + " É múltiplo de 3.");
        }else{
            System.out.println(numero + " Não é múltiplo de nenhum.");
        }
        
    }
}
