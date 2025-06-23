import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        FilaAlunos fila = new FilaAlunos();

        int opcao;
        do {
            System.out.print("1. Adicionar aluno \n2. Remover Aluno \n3. Buscar aluno por nome \n4. Buscar aluno por id \n5. Verificar tamanho da fila \n6. Imprimir fila \n7. Sair \nDigite uma opção: ");
            opcao = scan.nextInt();
            switch(opcao) {
                case 1:
                    Aluno aluno = new Aluno();
                    System.out.print("Digite o nome do aluno: ");
                    aluno.setNome(scan.next());
                    System.out.print("Digite a matricula do aluno: ");
                    aluno.setMatricula(scan.nextInt());
                    System.out.print("Digite o cpf do aluno: ");
                    aluno.setCpf(scan.next());
                    System.out.print("Digite a idade do aluno: ");
                    aluno.setIdade(scan.nextInt());
                    fila.addFim(aluno);
                    break;
                case 2:
                    Aluno alunoRemovido = fila.removerInicio();
                    System.out.print("Aluno" + alunoRemovido.getNome() + "removido com sucesso");
                    break;
                case 3:
                    System.out.print("Digite o nome do aluno: ");
                    String nome = scan.next();
                    Aluno nomeAluno = fila.getAluno(nome);
                    if (nomeAluno != null) {
                        System.out.println("Aluno encontrado com sucesso: " + nomeAluno.getNome());
                    } else {
                        System.out.println("Aluno não encontrado.");
                    }
                    break;
                case 4:
                    System.out.print("Digite o id do aluno: ");
                    int id = scan.nextInt();
                    Aluno alunoId = fila.getAluno(id);
                    if (alunoId != null) {
                        System.out.println("Aluno encontrado com sucesso: " + alunoId.getNome());
                    } else {
                        System.out.println("Aluno não encontrado.");
                    }
                    break;
                case 5:
                    int tamanho = fila.getTamanho();
                    System.out.println("Tamanho da fila: " + tamanho);
                    break;
                case 6:
                    String imprimir = fila.toString();
                    System.out.println(imprimir);
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Digite uma opção válida (entre 1 e 7)");
                    break;
            }

        } while (opcao != 7);
    }
}