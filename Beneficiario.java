package Banco;

public class Beneficiario extends PessoaFisica{

    private String nis;
    private String nome;

    public Beneficiario(String nis, String nome, int cpf, String nome1){
        super(cpf,nome);
        this.nis = nis;
        this.nome = nome1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void exibeNome(){
        System.out.println(super.getNome());
    }

}