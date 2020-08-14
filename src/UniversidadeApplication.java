import model.AlunoM;

public class UniversidadeApplication {
    public static void main(String[] args) {
        AlunoM aluno = new AlunoM();

        aluno.setRa(165478);
        aluno.setNome("Thiago");
        aluno.setPeriodo("Noturno");
        aluno.setTipoEntrada("PróUni");
        aluno.setCodigoCurso(130);
        aluno.setNomeCurso("Engenharia de Computação");
        aluno.setGrade(2016);

        aluno.impressao();
    }
}
