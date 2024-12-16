package com.gestaoescolar.model;

import java.util.List;
import java.util.ArrayList;

// Composição: Associa alunos, professores e disciplinas
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
        
        // Exibe informações de cada aluno, incluindo as notas
        for (Aluno aluno : alunos) {
            double[] notas = aluno.getNotasPorDisciplina().get(disciplina);
            if (notas != null && notas.length > 0) {
                double notaFinal = aluno.calcularNota(disciplina, notas); // Calculando a nota do aluno para a disciplina
                System.out.printf("Aluno: %s | Nota: %.2f%n", aluno.getNome(), notaFinal);
            } else {
                System.out.println("Aluno: " + aluno.getNome() + " | Nota não atribuída para esta disciplina");
            }
        }
    }
}