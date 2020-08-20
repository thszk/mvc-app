package controller;

import model.AlunoM;

import java.util.ArrayList;

public class AlunoC {
    private ArrayList<AlunoM> alunos;

    public AlunoC() {
        this.alunos = new ArrayList<>();
    }

    public void cadastrar(AlunoM aluno) {
        this.alunos.add(aluno);
    }

    public void remover(AlunoM aluno) {
        this.alunos.remove(aluno);
    }

    public void imprimir() {
        this.alunos.forEach(aluno -> {
            aluno.imprimir();
            System.out.println();
        });
    }
}
