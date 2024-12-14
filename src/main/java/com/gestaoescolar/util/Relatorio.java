package com.gestaoescolar.util;

import java.util.List;

public class Relatorio<T> {
    private List<T> dados;

    public Relatorio(List<T> dados) {
        this.dados = dados;
    }

    public void gerarRelatorio() {
        for (T dado : dados) {
            System.out.println(dado);
        }
    }
}
