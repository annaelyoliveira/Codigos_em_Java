
import java.util.Scanner;

public class Pilha {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String nomes [] = new String[3];

        for(int i = 0; i < 3; i++){
            System.out.printf("Digite o nome da %dª pessoa: ", (i+1));
            nomes[i] = scan.nextLine();
        }
        for(int i = 2; i >= 0; i--){
            System.out.print((i+1) + "º nome: " + nomes[i] + "\n");
        }
    }
    
}
