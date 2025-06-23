public class FilaAlunos {

    private Aluno alunos[];
    private int quantidadeAlunos;

    public FilaAlunos() {
        alunos = new Aluno[5];
        quantidadeAlunos = 0;
    }

    public void addFim(Aluno aluno){
        if(quantidadeAlunos == alunos.length){
            aumentarTamanho();
        }
        alunos[quantidadeAlunos] = aluno;
        quantidadeAlunos++;
    }

    public void aumentarTamanho(){
        Aluno novaLista[] = new Aluno[alunos.length*2];
        for (int i = 0; i < alunos.length; i++) {
            novaLista[i] = alunos[i];
        }
        alunos = novaLista;


    }

    public Aluno removerInicio(){
        Aluno alunoRemovido = alunos[0];
        for(int i = 1; i < alunos.length; i++){
            alunos[i-1] = alunos[i];
        }

        alunos[quantidadeAlunos - 1] = null;
        quantidadeAlunos--;
        return alunoRemovido;
    }

    public Aluno getAluno(String nome){
        for(int i = 0; i < alunos.length; i++){
            if(alunos[i].getNome().equalsIgnoreCase(nome)){
                return alunos[i];
            }
        }
        return null;
    }

    public Aluno getAluno(int indice){
        if(indice >= 0 && indice < alunos.length && alunos[indice] != null){
            return alunos[indice];
        }
        return null;

    }

    public int getTamanho(){
        return quantidadeAlunos;
    }

    public String toString(){
        String todos = "";
        for(int i = 0; i < alunos.length; i++){
            if(alunos[i] != null){
                todos += alunos[i].toString() + "\n";
            }
        }
        return todos;
    }


}
