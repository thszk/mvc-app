import model.AlunoM;
import model.CursoM;

public class UniversidadeApplication {
    public static void main(String[] args) {
        CursoM engenhariaDeComputacao = new CursoM(
                130,
                "Engenharia de Computação",
                'N',
                10,
                200);

        AlunoM aluno = new AlunoM(
                165478,
                "Thiago",
                2016,
                "PROUNI",
                engenhariaDeComputacao);

        aluno.impressao();
    }
}
