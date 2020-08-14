import model.AlunoM;

public class UniversidadeApplication {
    public static void main(String[] args) {
        AlunoM aluno = new AlunoM(
                165478,
                "Thiago",
                130,
                "Engenharia da Computação",
                2016,
                "Noturno",
                "PROUNI");

        aluno.impressao();
    }
}
