package com.gestaoescolar.avaliacao;

public class AvaliacaoProjeto implements Avaliacao {
    @Override
    public double calcularNota(double[] notas) {
        if (notas.length < 2) return 0;
        return (notas[0] * 0.6) + (notas[1] * 0.4);
    }
}
