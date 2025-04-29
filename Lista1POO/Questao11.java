import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor da compra:");
        float valor = scan.nextFloat();

        if (valor > 200){
            System.out.printf("Você ganhou um desconto de 10%% O valor da sua compra agora é %.2f.", (valor-(0.10*valor)));
        }else{
            System.out.println("Você não ganhou desconto, o preço da compra continua o mesmo.");
        }
    }
}
