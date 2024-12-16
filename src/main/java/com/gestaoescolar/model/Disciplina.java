package com.gestaoescolar.model;

import com.gestaoescolar.avaliacao.Avaliacao;

// Classe abstrata representando uma disciplina
// Abstração: Representa um modelo geral que será refinado pelas subclasses.
public abstract class Disciplina {
    private String nome;
    private String codigo;
    private String ementa;
    private Avaliacao avaliacao;

    public Disciplina(String nome, String codigo, String ementa, Avaliacao avaliacao) {
        this.nome = nome;
        this.codigo = codigo;
        this.ementa = ementa;
        this.avaliacao = avaliacao;
    }

    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getEmenta() {
        return ementa;
    }

    public Avaliacao getAvaliacao() {
        return avaliacao;
    }

    // Método abstrato que obriga as subclasses a implementar como exibir informações específicas
    public abstract void exibirInformacoes();
}