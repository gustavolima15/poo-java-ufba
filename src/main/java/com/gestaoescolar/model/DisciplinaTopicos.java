package com.gestaoescolar.model;

import java.util.List;

public class DisciplinaTopicos extends DisciplinaOptativa {


    public DisciplinaTopicos(String nome, String ementa, String codigo, List<String> prerequisitos) {
        super(nome, ementa, codigo, prerequisitos);
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Disciplina de Tópicos: " + getNome() + " - " + getCodigo());
        System.out.println("Ementa: Definida pelo professor.");
    }
}
