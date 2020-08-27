package model;

import java.util.Objects;

public class EnderecoM {
    public String rua;
    public int numero;
    public String bairro;
    public String cep;
    public String cidade;
    public String uf;
    public String complemento;

    public EnderecoM(String rua, int numero, String bairro, String cep,String cidade, String uf, String complemento) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cep = cep;
        this.cidade = cidade;
        this.uf = uf;
        this.complemento = complemento;
    }

    public void imprimir() {
        System.out.println("[ENDEREÇO]");
        System.out.println("Rua: " + this.getRua() + ", Número: " + this.getNumero());
        if (Objects.nonNull(this.getComplemento())) {
            System.out.println("Complemento: " + this.getComplemento());
        }
        System.out.println("Bairro: " + this.getBairro());
        System.out.println("Cidade: " + this.getCidade() + ", Estado: " + this.getUf());
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
}
