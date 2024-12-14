package com.gestaoescolar.avaliacao;

public class AvaliacaoProjeto implements Avaliacao {
    private double nota1;
    private double nota2;
    private double nota3;

    public AvaliacaoProjeto(double nota1, double nota2, double nota3) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    @Override
    public double calcularNota() {
        return (nota1 + nota2 + nota3) / 3;
    }   

}
