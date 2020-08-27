package controller;

import model.AlunoM;

import java.util.ArrayList;
import java.util.Optional;

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

    public void imprimirPorRA(int ra) {
        this.alunos.forEach(aluno -> {
            if (aluno.getRa() == ra) {
                aluno.imprimir();
            }
        });
    }
}
