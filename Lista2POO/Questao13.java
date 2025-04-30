package Lista2POO;

import java.util.Scanner;

public class Questao13 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
    
        System.out.print("Digite um número: "); 
        int num = scan.nextInt();

        System.out.print("Vai ser multiplicado por: "); 
        int multiplicador = scan.nextInt();

        int resultado = 0; 

        for(int i = 1; i < multiplicador+1; i++){
            resultado += num;
        }
        System.out.printf("%d * %d = %d ", num , multiplicador, resultado);
     
    }
}
