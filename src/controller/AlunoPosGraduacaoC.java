package controller;

import model.AlunoPosGraduacaoM;

import java.util.ArrayList;

public class AlunoPosGraduacaoC {
    private ArrayList<AlunoPosGraduacaoM> alunosPosGraduacao;

    public AlunoPosGraduacaoC() {
        this.alunosPosGraduacao = new ArrayList<>();
    }

    public void cadastrar(AlunoPosGraduacaoM alunoPosGraduacao) {
        this.alunosPosGraduacao.add(alunoPosGraduacao);
    }

    public void remover(AlunoPosGraduacaoM alunoPosGraduacao) {
        this.alunosPosGraduacao.remove(alunoPosGraduacao);
    }

    public void imprimir() {
        this.alunosPosGraduacao.forEach(aluno -> {
            aluno.imprimir();
            System.out.println();
        });
    }
}
