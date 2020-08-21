package model;

public class AlunoM {
    private int ra;
    private int grade;
    private String tipoEntrada;
    private DadosPessoaisM dadosPessoais;
    private CursoM curso;

    public AlunoM(int ra, int grade, String tipoEntrada, DadosPessoaisM dadosPessoais, CursoM curso) {
        this.ra = ra;
        this.grade = grade;
        this.tipoEntrada = tipoEntrada;
        this.dadosPessoais = dadosPessoais;
        this.curso = curso;
    }

    public void imprimir() {
        System.out.println("[ALUNO]");
        System.out.println("RA: " + this.getRa());
        System.out.println("Grade matriculada: " + this.getGrade());
        System.out.println("Tipo entrada: " + this.getTipoEntrada());
        this.dadosPessoais.imprimir();
        this.curso.imprimir();
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
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

    public DadosPessoaisM getDadosPessoais() {
        return dadosPessoais;
    }

    public void setDadosPessoais(DadosPessoaisM dadosPessoais) {
        this.dadosPessoais = dadosPessoais;
    }

    public CursoM getCurso() {
        return curso;
    }

    public void setCurso(CursoM curso) {
        this.curso = curso;
    }
}
