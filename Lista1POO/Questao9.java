import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 12:");
        int num = scan.nextInt();

        String resultado;

        switch(num){
            case 1:
                resultado = "janeiro";
                break;
            case 2:
                resultado = "fevereiro";
                break;
            case 3:
                resultado = "março";
                break;
            case 4:
                resultado = "abril";
                break;
            case 5:
                resultado = "maio";
                break;
            case 6:
                resultado = "junho";
                break;
            case 7:
                resultado = "julho";
                break;
            case 8:
                resultado = "agosto";
                break;
            case 9:
                resultado = "setembro";
                break;
            case 10:
                resultado = "outubro";
                break;
            case 11:
                resultado = "novembro";
                break;
            case 12:
                resultado = "dezembro";
                break;
            default:
                resultado = "Não confere";
        }

        System.out.println("O mês é: " + resultado);
    }
}
