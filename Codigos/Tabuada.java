package Codigos;
import java.util.Scanner;

public class Tabuada {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.print("Digite o número da tabuada: ");
            int numero = scan.nextInt();

            for (int x = 1; x < 11; x++){
                System.out.println(x + " x " + numero + ": " + (x * numero));
            }
            
            System.out.print("Deseja sair? (S/N): ");
            String saida = scan.nextLine();
            if (saida .equalsIgnoreCase("S")){
                break;
            }
        }
        scan.close();
    }
}

