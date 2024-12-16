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

    public String getNome() {
        return nome;
    }

    public String getArea() {
        return area;
    }

    public void adicionarTurma(Turma turma) {
        turmas.add(turma);
    }

    public List<Turma> getTurmas() {
        return turmas;
    }
}