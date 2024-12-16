package com.gestaoescolar.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
// Representa um aluno no sistema
// Encapsulamento: Atributos privados protegidos por getters e métodos de acesso controlado.
public class Aluno {
    private String nome;
    private String matricula;
    private List<Turma> turmas; // Turmas em que o aluno está matriculado
    private Map<Disciplina, double[]> notasPorDisciplina; // Mapeia disciplina -> notas


    // Método para matricular o aluno em uma turma
    // Encapsulamento: Controle de como turmas são associadas ao aluno
    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.turmas = new ArrayList<>(); 
        this.notasPorDisciplina = new HashMap<>();
    }
    
    public void matricularNaTurma(Turma turma) {
        if (this.turmas == null) {
            this.turmas = new ArrayList<>(); 
        }
        this.turmas.add(turma);
        if (turma != null) {
            // Atribuir a disciplina à turma do aluno
            if (!notasPorDisciplina.containsKey(turma.getDisciplina())) {
                notasPorDisciplina.put(turma.getDisciplina(), new double[0]); // Inicializa com um array vazio
            }
        }
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

    public Map<Disciplina, double[]> getNotasPorDisciplina() {
        return notasPorDisciplina;
    }

    
    // Método para adicionar notas específicas ao aluno
    public void adicionarNotas(Disciplina disciplina, double... notas) {
        if (notasPorDisciplina.containsKey(disciplina)) {
            notasPorDisciplina.put(disciplina, notas);
        } else {
            System.out.println("Erro: Aluno não está matriculado nessa disciplina.");
        }
    }

    // Método para calcular a nota de um aluno em uma disciplina
    public double calcularNota(Disciplina disciplina, double[] notas) {
        return disciplina.getAvaliacao().calcularNota(notas);
    }
}