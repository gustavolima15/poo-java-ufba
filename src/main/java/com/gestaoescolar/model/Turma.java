package com.gestaoescolar.model;

import java.util.List;
import java.util.ArrayList;

public class Turma {
    private Disciplina disciplina;
    private Professor professor;
    private List<Aluno> alunos;

    public Turma(Disciplina disciplina, Professor professor) {
        this.disciplina = disciplina;
        this.professor = professor;
        this.alunos = new ArrayList<>();
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
        aluno.matricularNaTurma(this);
    }

    public void exibirInformacoes() {
        System.out.println("Turma de " + disciplina.getNome() + " (Código: " + disciplina.getCodigo() + ")");
        System.out.println("Professor: " + professor.getNome());
        System.out.println("Alunos inscritos: " + alunos.size());
        for (Aluno aluno : alunos) {
            System.out.println("Aluno: " + aluno.getNome());
        }
    }
}
