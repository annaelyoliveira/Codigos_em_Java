public class ContaBancaria {
    protected String nomeCliente;
    protected String numConta;
    protected double saldo;


    public ContaBancaria(String nomeCliente, String numConta, double saldo) {
        this.nomeCliente = nomeCliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public ContaBancaria() {
        this.nomeCliente = "";
        this.numConta = "";
        this.saldo = 0;
    }

    public String getNomeCliente(){
        return this.nomeCliente;
    }
    public void setNomeCliente(String nomeCliente){
        this.nomeCliente = nomeCliente;
    }

    public String getNumConta(){
        return this.numConta;
    }

    public void setNumConta(String numConta){
        this.numConta = numConta;
    }

    public double getSaldo(){
        return this.saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public String toString() {
        String s = "ContaBancaria[";
        s += " nomeCliente: " + nomeCliente;
        s += "; numConta: " + numConta;
        s += "; saldo: " + saldo;
        s += "]" ;
        return s;
    }

    public boolean sacar(double valor) {
        if ((saldo - valor) >= 0) {
            saldo -= valor;
            return true;
        }
        return false;

    }

    public void depositar(double saldo) {
        this.saldo += saldo;
    }



}
