package model;

public class CursoM {
    private int codigo;
    private String nome;
    private char turno;
    private int quantidadeTotalSemestres;
    private int totalCreditos;

    public CursoM(int codigo, String nome, char turno, int quantidadeTotalSemestres, int totalCreditos) {
        this.codigo = codigo;
        this.nome = nome;
        this.turno = turno;
        this.quantidadeTotalSemestres = quantidadeTotalSemestres;
        this.totalCreditos = totalCreditos;
    }

    public void imprimir() {
        System.out.println("[Curso]");
        System.out.println("Código: " + this.getCodigo());
        System.out.println("Nome: " + this.getNome());
        System.out.println("Turno: " + this.getTurno());
        System.out.println("Total de Semestres: " + this.getQuantidadeTotalSemestres());
        System.out.println("Total de Créditos: " + this.getTotalCreditos());
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getTurno() {
        return turno;
    }

    public void setTurno(char turno) {
        this.turno = turno;
    }

    public int getQuantidadeTotalSemestres() {
        return quantidadeTotalSemestres;
    }

    public void setQuantidadeTotalSemestres(int quantidadeTotalSemestres) {
        this.quantidadeTotalSemestres = quantidadeTotalSemestres;
    }

    public int getTotalCreditos() {
        return totalCreditos;
    }

    public void setTotalCreditos(int totalCreditos) {
        this.totalCreditos = totalCreditos;
    }
}
