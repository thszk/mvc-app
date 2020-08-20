package controller;

import model.AlunoM;

import java.util.ArrayList;

public class AlunoC {
    private ArrayList<AlunoM> alunos;

    public AlunoC() {
        this.alunos = new ArrayList<>();
    }

    public void cadastro(AlunoM aluno) {
        this.alunos.add(aluno);
    }

    public void imprimir() {
        this.alunos.forEach(aluno -> {
            aluno.imprimir();
            System.out.println();
        });
    }
}
