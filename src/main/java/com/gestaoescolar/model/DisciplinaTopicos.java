package com.gestaoescolar.model;

import com.gestaoescolar.avaliacao.Avaliacao;

// Herança: Extende Disciplina
public class DisciplinaTopicos extends Disciplina {
    private String ementaProfessor;

    public DisciplinaTopicos(String nome, String codigo, String ementaProfessor, Avaliacao avaliacao) {
        super(nome, codigo, "", avaliacao);
        this.ementaProfessor = ementaProfessor;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Disciplina de Tópicos: " + getNome());
        System.out.println("Código: " + getCodigo());
        System.out.println("Ementa: " + ementaProfessor);
    }
}
