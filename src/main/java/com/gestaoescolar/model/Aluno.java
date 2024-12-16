package com.gestaoescolar.model;

import java.util.ArrayList;
import java.util.List;
// Representa um aluno no sistema
// Encapsulamento: Atributos privados protegidos por getters e métodos de acesso controlado.
public class Aluno {
    private String nome;
    private String matricula;
    private List<Turma> turmas; // Turmas em que o aluno está matriculado


    // Método para matricular o aluno em uma turma
    // Encapsulamento: Controle de como turmas são associadas ao aluno
    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.turmas = new ArrayList<>(); 
    }
    
    public void matricularNaTurma(Turma turma) {
        if (this.turmas == null) {
            this.turmas = new ArrayList<>(); 
        }
        this.turmas.add(turma);
    }
    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }


    public List<Turma> getTurmas() {
        return turmas;
    }

   // Polimorfismo: Usa o método calcularNota da Avaliação associada à disciplina da turma
    public double calcularNota(Turma turma, double[] notas) {
        if (turma != null) {
            return turma.getDisciplina().getAvaliacao().calcularNota(notas);
        }
        return 0.0;
    }
}