package com.gestaoescolar.avaliacao;

public class AvaliacaoProva implements Avaliacao {
    private double nota1;
    private double nota2;

    public AvaliacaoProva(double nota1, double nota2) {
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    @Override
    public double calcularNota() {
        return (nota1 + nota2) / 2;
    }   

}
