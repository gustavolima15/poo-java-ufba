package com.gestaoescolar.model;

import java.util.List;

public class DisciplinaOptativa extends Disciplina{
    private List<String> preRequisitos;

    public DisciplinaOptativa(String nome, String ementa, String codigo, List<String> preRequisitos) {
        super(nome, ementa, codigo);
        this.preRequisitos = preRequisitos;
    }

    @Override

    public void exibirInformacoes() {
        System.out.println("Disciplina: " + getNome());
        System.out.println("Ementa: " + getEmenta());
        System.out.println("Código: " + getCodigo());
        System.out.println("Pré-requisitos: ");
        for (String preRequisito : preRequisitos) {
            System.out.println(preRequisito);
        }
    }
    
}
