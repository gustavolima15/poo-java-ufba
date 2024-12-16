package com.gestaoescolar.avaliacao;

// Implementação de Avaliação para Provas
// Polimorfismo: Sobrescreve o método calcularNota de forma específica
public class AvaliacaoProva implements Avaliacao {
    @Override
    public double calcularNota(double[] notas) {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }
}
