public class Aluno {

    private String nome;
    private String matricula;
    private String CPF;
    private int idade;


    public Aluno(){
        this.nome = "";
        this.matricula = "";
        this.CPF = "000.000.000-00";
        this.idade = 0;
    }

    public Aluno(String nome, String matricula, String CPF, int idade){
        this.nome = nome;
        this.matricula = matricula;
        this.CPF = CPF;
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString(){
        return "Nome: " + this.nome +
                "\nMatricula: " + this.matricula +
                "\nCPF: " + this.CPF +
                "\nIdade: " + this.idade;
    }



}
