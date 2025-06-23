public class FilaAlunos {

    private Aluno fila[];
    private int tamanho;

    public FilaAlunos() {
        this.fila = new Aluno[5];
        this.tamanho = 0;
    }

    public void addFim(Aluno aluno){
        if(this.tamanho == this.fila.length){
            aumentarTamanho();
        }
        fila[tamanho] = aluno;
        tamanho++;
    }

    public void aumentarTamanho(){
        
    }



}
