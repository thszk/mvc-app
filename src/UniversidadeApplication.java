import controller.AlunoC;
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

        AlunoM alunoThiago = new AlunoM(
                165478,
                "Thiago",
                2016,
                "PROUNI",
                engenhariaDeComputacao);

        AlunoM alunoJoao = new AlunoM(
                166666,
                "João",
                2016,
                "DESAFIO",
                engenhariaDeComputacao);

        AlunoC alunos = new AlunoC();
        alunos.cadastro(alunoThiago);
        alunos.cadastro(alunoJoao);

        alunos.imprimir();
    }
}
