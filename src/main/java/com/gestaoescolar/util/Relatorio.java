package com.gestaoescolar.util;

import java.util.List;
import com.gestaoescolar.model.Disciplina;
import com.gestaoescolar.model.Turma;
import com.gestaoescolar.model.Aluno;
public class Relatorio<T> {
    
    private List<T> itens;
    public Relatorio(List<T> itens) {
        this.itens = itens;
    }


    public void gerarRelatorio() {
        for (T item : itens) {
            // Polimorfismo: A lógica varia com o tipo do item
            if (item instanceof Disciplina) {
                System.out.println("Relatório da Disciplina:");
                ((Disciplina) item).exibirInformacoes();
            } else if (item instanceof Turma) {
                System.out.println("Relatório da Turma:");
                ((Turma) item).exibirInformacoes();
            } else if (item instanceof Aluno) {
                System.out.println("Relatório do Aluno:");
                System.out.println("Nome: " + ((Aluno) item).getNome());
                System.out.println("Matrícula: " + ((Aluno) item).getMatricula());
                System.out.println("Turmas matriculadas:");
                for (Turma turma : ((Aluno) item).getTurmas()) {
                    System.out.println("- " + turma.getDisciplina().getNome());
                }
            } else {
                System.out.println("Tipo desconhecido");
            }
            System.out.println("-----------------------------------------------------------------");
        }
    }
}
