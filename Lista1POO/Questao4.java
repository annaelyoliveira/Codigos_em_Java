import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a temperatura em celsius:");
        float temperatura = scan.nextFloat();

        float calculo = (float)(temperatura * 1.8 + 32);

        System.out.printf("A temperatura %.1f Celsius é %.1f em Fahrenheit", temperatura, calculo);
    }
}
