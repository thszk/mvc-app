package model;

public class AlunoM {
    private int ra;
    private String nome;
    private int codigoCurso;
    private String nomeCurso;
    private int grade;
    private String periodo;
    private String tipoEntrada;

    public void impressao() {
        System.out.println("RA Aluno: " + this.getRa());
        System.out.println("Nome: " + this.getNome());
        System.out.println("Código do Curso: " + this.getCodigoCurso());
        System.out.println("Nome do Curso: " + this.getNomeCurso());
        System.out.println("Grade matriculada: " + this.getGrade());
        System.out.println("Período de aula: " + this.getPeriodo());
        System.out.println("Tipo entrada: " + this.getTipoEntrada());
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(int codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getTipoEntrada() {
        return tipoEntrada;
    }

    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }
}
