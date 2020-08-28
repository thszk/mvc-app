package model;

public class AlunoPosGraduacaoM extends AlunoM {
    private char tipo; // E, M, D
    private char bolsa; // C, F, U

    public AlunoPosGraduacaoM(int ra, int grade, String tipoEntrada, CursoM curso, DadosPessoaisM dadosPessoais,
                              EnderecoM endereco, char tipo, char bolsa) {
        super(ra, grade, tipoEntrada, curso, dadosPessoais, endereco);
        this.tipo = tipo;
        this.bolsa = bolsa;
    }

    public void imprimir() {
        System.out.println("[PÓS GRADUAÇÃO]");
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Bolsa: " + this.getBolsa());
        super.imprimir();
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public char getBolsa() {
        return bolsa;
    }

    public void setBolsa(char bolsa) {
        this.bolsa = bolsa;
    }
}
