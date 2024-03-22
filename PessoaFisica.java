package Banco;

public class PessoaFisica extends Pessoa{

    private int cpf;

    public PessoaFisica(int cpf, String nome) {
        super(nome);
        this.cpf = cpf;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
}
