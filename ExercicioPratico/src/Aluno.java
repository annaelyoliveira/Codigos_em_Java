public class Aluno {
    private String nome;
    private String matricula;
    private String cpf;
    private int idade;


    public Aluno(){
        nome = "";
        matricula = "";
        cpf = "";
        idade = 0;
    }
    public Aluno(String nome, String matricula, String cpf, int idade){
        this.nome = nome;
        this.matricula = matricula;
        this.cpf = cpf;
        this.idade = idade;
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getMatricula(){
        return this.matricula;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public String getCpf(){
        return this.cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }

    public String toString(){
        return "Nome: " + this.nome +
                "\nMatricula: " + this.matricula +
                "\nCpf: " + this.cpf +
                "\nIdade: " + this.idade;
    }

}
