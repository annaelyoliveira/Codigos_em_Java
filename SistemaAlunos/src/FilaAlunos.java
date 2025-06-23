public class FilaAlunos {

    private Aluno alunos[];
    private int quantidadeAlunos;

    public FilaAlunos(){
        this.alunos = new Aluno[5];
        this.quantidadeAlunos = 0;
    }

    void addFim(Aluno aluno){
        if(quantidadeAlunos == alunos.length){
            aumentarTamanho();
        }
        alunos[quantidadeAlunos] = aluno;
        quantidadeAlunos++;
    }

    void aumentarTamanho(){
        Aluno novaFila[] = new Aluno [alunos.length*2];
        for(int i = 0; i < alunos.length; i++){
            novaFila[i] = alunos[i];
        }
        alunos = novaFila;
    }

    Aluno removerInicio(){
        if (quantidadeAlunos == 0) {
            return null;
        }

        Aluno removido = alunos[0];

        for (int i = 1; i < quantidadeAlunos; i++) {
            alunos[i - 1] = alunos[i];
        }

        alunos[quantidadeAlunos - 1] = null;
        quantidadeAlunos--;

        return removido;
    }

    Aluno getAluno(String nome){
        for(int i = 0; i < this.quantidadeAlunos; i++){
            if(nome.equalsIgnoreCase(alunos[i].getNome())){
                return alunos[i];
            }
        }
        return null;
    }

    Aluno getAluno(int id){
        if(id >= 0 && id < alunos.length && alunos[id] != null){
            return alunos[id];
        }
        return null;
    }

    int getTamanho(){
        return quantidadeAlunos;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.quantidadeAlunos; i++) {
            if (this.alunos[i] != null) {
                sb.append(this.alunos[i].toString()).append("\n");
            }
        }
        return sb.toString();
    }
}
