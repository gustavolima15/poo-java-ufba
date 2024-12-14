package com.gestaoescolar.model;

public class DisciplinaObrigatoria extends Disciplina {

    public DisciplinaObrigatoria(String nome, String ementa, String codigo) {
        super(nome, ementa, codigo);
    }
    
    @Override
    public void exibirInformacoes() {
        System.out.println("Disciplina: " + getNome());
        System.out.println("Ementa: " + getEmenta());
        System.out.println("Código: " + getCodigo());
    }
}
