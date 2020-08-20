package model;

public class AlunoM {
    private int ra;
    private String nome;
    private int grade;
    private String tipoEntrada;
    private CursoM curso;


    public AlunoM(int ra, String nome, int grade, String tipoEntrada, CursoM curso) {
        this.ra = ra;
        this.nome = nome;
        this.grade = grade;
        this.tipoEntrada = tipoEntrada;
        this.curso = curso;
    }

    public void imprimir() {
        System.out.println("[ALUNO]");
        System.out.println("RA: " + this.getRa());
        System.out.println("Nome: " + this.getNome());
        System.out.println("Grade matriculada: " + this.getGrade());
        System.out.println("Tipo entrada: " + this.getTipoEntrada());
        System.out.println("[Curso]");
        this.curso.imprimir();
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

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getTipoEntrada() {
        return tipoEntrada;
    }

    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    public CursoM getCurso() {
        return curso;
    }

    public void setCurso(CursoM curso) {
        this.curso = curso;
    }
}
