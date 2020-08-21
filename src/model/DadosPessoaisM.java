package model;

public class DadosPessoaisM {
    private String nome;
    private String cpf;
    private String dataNascimento;
    private char sexo;
    private String email;

    public DadosPessoaisM(String nome, String cpf, String dataNascimento, char sexo, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.email = email;
    }

    public void imprimir() {
        System.out.println("[DADOS PESSOAIS]");
        System.out.println("Nome: " + this.getNome());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Data Nascimento: " + this.getDataNascimento());
        System.out.println("Sexo: " + this.getSexo());
        System.out.println("E-mail: " + this.getEmail());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
