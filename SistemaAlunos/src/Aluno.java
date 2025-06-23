public class Aluno {

    private String nome;
    private int matricula;
    private String cpf;
    private int idade;

    public Aluno(String nome, int matricula, String cpf, int idade) {
        this.nome = nome;
        this.matricula = matricula;
        this.cpf = cpf;
        this.idade = idade;
    }

    public Aluno() {
        this.nome = "Desconhecido";
        this.matricula = 0000;
        this.cpf = "000.000.000-00";
        this.idade = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    public String toString() {
        return "Nome: "+ this.nome +
                "\nMatricula: " + this.matricula +
                "\nCPF: " + this.cpf +
                "\nIdade: " + this.idade;
    }

}
