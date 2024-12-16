package com.gestaoescolar.model;

import java.util.List;

public class Professor {
    private String nome;
    private String area;
    private List<Turma> turmas;
    public Professor(String nome, String area) {
        this.nome = nome;
        this.area = area;
    }

    // Encapsulamento: Getter para o nome
    public String getNome() {
        return nome;
    }

    public String getArea() {
        return area;
    }
    // Composição: Adiciona uma turma ao professor
    public void adicionarTurma(Turma turma) {
        turmas.add(turma);
    }

    // Encapsulamento: Retorna a lista de turmas do professor
    public List<Turma> getTurmas() {
        return turmas;
    }
}