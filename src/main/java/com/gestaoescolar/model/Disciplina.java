package com.gestaoescolar.model;

public abstract class Disciplina {
    private String nome;
    private String ementa;
    private String codigo;

    public Disciplina(String nome, String ementa, String codigo) {
        this.nome = nome;
        this.ementa = ementa;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getEmenta() {
        return ementa;
    }
    
    public String getCodigo() {
        return codigo;
    }

    public abstract void exibirInformacoes();
}
