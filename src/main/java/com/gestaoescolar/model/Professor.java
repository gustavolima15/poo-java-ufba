package com.gestaoescolar.model;

import java.util.ArrayList;
import java.util.List;

public class Professor {
    private String nome;
    private List<Turma> turmas;

    public Professor(String nome, List<Turma> turmas) {
        this.nome = nome;
        this.turmas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarTurma(Turma turma) {
        turmas.add(turma);
    }
}
