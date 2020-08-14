import model.AlunoM;

public class UniversidadeApplication {
    public static void main(String[] args) {
        AlunoM aluno = new AlunoM();

        aluno.setRa(165478);
        aluno.setCodigoCurso(130);
        aluno.setGrade(2016);
        aluno.setTurno("Noturno");
        aluno.setNome("Thiago");

        System.out.println("nome: " + aluno.getNome());
        System.out.println("ra: " + aluno.getRa());
        System.out.println("turno: " + aluno.getTurno());
    }
}
