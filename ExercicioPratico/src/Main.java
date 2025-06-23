import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        FilaAlunos lista = new FilaAlunos();
        do {
            System.out.print("1 - Adicionar Aluno \n2 - Remover Aluno \n3 - Buscar aluno por nome \n4 - Buscar aluno por indice \n5 - Verificar tamanho da fila \n6 - Imprimir fila \n7 - Sair do programa \nQual opção vc deseja? ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    Aluno aluno = new Aluno();
                    System.out.println("Digite o nome do aluno: ");
                    aluno.setNome(sc.next());

                    System.out.println("Digite a matricula do aluno: ");
                    aluno.setMatricula(sc.next());

                    System.out.println("Digite o cpf do aluno: ");
                    aluno.setCpf(sc.next());

                    System.out.println("Digite o idade do aluno: ");
                    aluno.setIdade(sc.nextInt());

                    lista.addFim(aluno);
                    break;
                case 2:
                    lista.removerInicio();
                    System.out.println("Aluno removido com sucesso!");
                    break;
                case 3:
                    System.out.println("Digite o nome do aluno: ");
                    String nome = sc.next();

                    if (lista.getAluno(nome) != null) {
                        System.out.println("Aluno encontrado:" + lista.getAluno(nome));
                    } else {
                        System.out.println("Aluno não encontrado!");
                    }
                    break;
                case 4:
                    System.out.println("Digite o indice: ");
                    int indice = sc.nextInt();

                    if (lista.getAluno(indice) != null) {
                        System.out.println("Aluno encontrado!\n" + lista.getAluno(indice));
                    } else {
                        System.out.println("Aluno não encontrado!");
                    }
                    break;
                case 5:
                    System.out.println(lista.getTamanho());
                    break;
                case 6:
                    String imprimir = lista.toString();
                    System.out.println(imprimir);
                    break;
                case 7:
                    System.out.println("Programa finalizado!");
                    break;
                default:
                    System.out.println("Opção invalida! Digite novamente!");

            }
        } while (opcao != 7);
    }
}