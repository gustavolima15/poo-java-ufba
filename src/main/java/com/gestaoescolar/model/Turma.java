package com.gestaoescolar.model;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private Disciplina disciplina;
    private Professor professor;
    private List<Aluno> alunos;

    public Turma(Disciplina disciplina, Professor professor, List<Aluno> alunos) {
        this.disciplina = disciplina;
        this.professor = professor;
        this.alunos = new ArrayList<>();
    }

    public void adicionarAProfessor(Professor professor) {
        this.professor = professor;
    }  

    public void adicionarAluno(List<Aluno> alunos) {
        alunos.addAll(alunos);
    }

    public void exibirInformacoes() {
        System.out.println("Disciplina: " + disciplina.getNome());
        System.out.println("Professor: " + professor.getNome());
        System.out.println("Alunos: ");
        for (Aluno aluno : alunos) {
            System.out.println(aluno.getNome());
        }
    }
}
