import controller.AlunoC;
import model.AlunoM;
import model.CursoM;
import model.DadosPessoaisM;
import model.EnderecoM;

public class UniversidadeApplication {
    public static void main(String[] args) {
        CursoM engenhariaDeComputacao = new CursoM(
                130,
                "Engenharia de Computação",
                'N',
                10,
                200);

        DadosPessoaisM dadosThiago = new DadosPessoaisM(
                "Thiago",
                "05582135103",
                "10/09/1998",
                'M',
                "thiago@email.com");

        EnderecoM enderecoThiago = new EnderecoM(
                "Cassilândia",
                355,
                "Monte Carlo",
                "79022420",
                "Campo Grande",
                "MS",
                null);

        AlunoM alunoThiago = new AlunoM(
                165478,
                2016,
                "PROUNI",
                engenhariaDeComputacao,
                dadosThiago,
                enderecoThiago);

        DadosPessoaisM dadosJoao = new DadosPessoaisM(
                "Joao",
                "01234567891",
                "02/07/1998",
                'M',
                "joao@email.com");

        EnderecoM enderecoJoao = new EnderecoM(
                "São Lourenço",
                100,
                "Tiradentes",
                "79000000",
                "Campo Grande",
                "MS",
                "AP 2, BL 5");

        AlunoM alunoJoao = new AlunoM(
                166666,
                2016,
                "DESAFIO",
                engenhariaDeComputacao,
                dadosJoao,
                enderecoJoao);

        AlunoC alunos = new AlunoC();

        System.out.println("--> Cadastro");
        alunos.cadastrar(alunoThiago);
        alunos.cadastrar(alunoJoao);

        alunos.imprimir();

        System.out.println("--> Remoção");
        alunos.remover(alunoJoao);

        alunos.imprimir();

        System.out.println("--> Busca por RA");
        alunos.imprimirPorRA(165478);
    }
}
