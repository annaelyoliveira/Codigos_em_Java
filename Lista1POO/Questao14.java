import java.util.Scanner;

public class Questao14 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
   
        System.out.print("Digite o 1º número:");
        float num1 = scan.nextFloat();

        System.out.print("Digite o 2º número:");
        float num2 = scan.nextFloat();

        System.out.print("Digite o 3º número:");
        float num3 = scan.nextFloat();

        boolean formaTriangulo = (num1 + num2 > num3) && 
                                (num2 + num3 > num1) && 
                                (num1 + num3 > num2);


        if (formaTriangulo){
            if(num1 == num2 && num1==num3){
                System.out.println("Triangulo equilátero (todos os lados iguais)");
            }else if (num1 == num2 || num1==num3 || num2==num3){
                System.out.println("Triângulo isóceles (dois lados iguais)");
            }else{
                System.out.println("Triangulo escaleno (todos os lados diferentes)");
            }
        }else{
            System.out.println("Triangulo inválido.");
        }
    }
}
