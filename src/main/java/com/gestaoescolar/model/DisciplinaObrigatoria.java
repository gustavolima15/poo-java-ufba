package com.gestaoescolar.model;

import com.gestaoescolar.avaliacao.Avaliacao;

public class DisciplinaObrigatoria extends Disciplina {

    public DisciplinaObrigatoria(String nome, String codigo, String ementa, Avaliacao avaliacao) {
        super(nome, codigo, ementa, avaliacao);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Disciplina Obrigatória: " + getNome());
        System.out.println("Código: " + getCodigo());
        System.out.println("Ementa: " + getEmenta());
    }
}
