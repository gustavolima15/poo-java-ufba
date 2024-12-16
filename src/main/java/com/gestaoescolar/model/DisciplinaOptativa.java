package com.gestaoescolar.model;

import com.gestaoescolar.avaliacao.Avaliacao;

// Herança: Extende Disciplina e adiciona atributos específicos como pré-requisitos
public class DisciplinaOptativa extends Disciplina {
    private String prerequisitos; 

    public DisciplinaOptativa(String nome, String codigo, String ementa, String prerequisitos, Avaliacao avaliacao) {
        super(nome, codigo, ementa, avaliacao);
        this.prerequisitos = prerequisitos;
    }

    public String getPrerequisitos() {
        return prerequisitos;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Disciplina Optativa: " + getNome());
        System.out.println("Código: " + getCodigo());
        System.out.println("Ementa: " + getEmenta());
        System.out.println("Pré-requisitos: " + getPrerequisitos());
}
}
