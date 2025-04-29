import java.util.Scanner;

public class Questao17 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o salário bruto: ");
        float salarioBruto = scan.nextFloat();

        float descontoInss = (float)(salarioBruto * 0.08);
        float descontoIrpf = (float)(salarioBruto * 0.15);

        float salarioLiquido = salarioBruto - descontoInss - descontoIrpf;

        System.out.printf("Salário Bruto: R$ %.2f \nDesconto INSS (8%%): R$ %.2f \nDesconto IRPF (15%%): R$ %.2f \nSalário Líquido: R$ %.2f", salarioBruto, descontoInss, descontoIrpf, salarioLiquido);
    }
}
