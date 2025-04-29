
import java.util.Random;
import java.util.Scanner;

public class JogoAdvinhacao {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Random rnd = new Random();
        int numero = rnd.nextInt(10);

        int numUsuario = 0;
        do{
            System.out.print("Digite um número entre 0 e 10: ");
            numUsuario = scan.nextInt();
            if(numUsuario != numero){
               if(numUsuario > numero){
                System.out.println("Você digitou um número maior");
               }else{
                System.out.println("Você digitou um número menor.");
               }
            }
        }while(numUsuario != numero);
        System.out.printf("Parabéns, você acertou! O número era: %d", numero);


        }

}

