import java.util.Scanner;

public class Questao15 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
   
        System.out.print("Digite um numero inteiro:");
        int numero = scan.nextInt();

        int contador = 0;

        for(int i = 1; i < numero+1;i++){
            if(numero% i == 0){
                contador ++;
            }
        }
        
        if (contador == 2){
            System.out.println("Número primo.");
        }else{
            System.out.println("Não é primo");
        }
        
    }
}
