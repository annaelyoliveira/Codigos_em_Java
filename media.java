import java.util.Scanner;

public class media {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.print("Digite a 1ª nota: ");
        float nota1 = scan.nextFloat();

        System.out.print("Digite a 2ª nota: ");
        float nota2 = scan.nextFloat();

        System.out.println("A sua média é: " + ((nota1 + nota2)/2));

    }
}
