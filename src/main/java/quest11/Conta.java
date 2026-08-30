package quest11;

public class Conta {
private String nome, numero, cpf;
    private double saldo  ;

    public Conta() {
    }
    public boolean saque(double valor) {

        if (valor > saldo) {
            System.out.println("saldo insuficiente para saque");
            return false;
        }
            saldo -= valor;
            return true;

    }

    public double deposito(double valor) {
        saldo += valor;
        return saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "nome='" + nome + '\'' +
                ", numero='" + numero + '\'' +
                ", cpf='" + cpf + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
