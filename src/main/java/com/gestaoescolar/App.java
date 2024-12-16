package com.gestaoescolar;

import com.gestaoescolar.model.Disciplina;
import com.gestaoescolar.model.Professor;
import com.gestaoescolar.model.Turma;
import com.gestaoescolar.util.Relatorio;
import com.gestaoescolar.avaliacao.Avaliacao;
import com.gestaoescolar.avaliacao.AvaliacaoProjeto;
import com.gestaoescolar.avaliacao.AvaliacaoProva;
import com.gestaoescolar.model.Aluno;
import com.gestaoescolar.model.DisciplinaObrigatoria;
import com.gestaoescolar.model.DisciplinaOptativa;
import com.gestaoescolar.model.DisciplinaTopicos;


import java.util.Arrays;
import java.util.List;

public class App 
{
    public static void main( String[] args )
    { 
        Avaliacao avaliacaoProva = new AvaliacaoProva();
        Avaliacao avaliacaoProjeto = new AvaliacaoProjeto();

        
        Disciplina disciplina1 = new DisciplinaObrigatoria("Matemática", "MAT101", "Cálculos e álgebra", avaliacaoProva);
        Disciplina disciplina2 = new DisciplinaOptativa("Psicologia", "PSI102", "Teorias psicológicas", "PSI101", avaliacaoProjeto);
        Disciplina disciplina3 = new DisciplinaTopicos("Tópicos em Tecnologia", "TTI001", "Ementa definida pelo professor", avaliacaoProjeto);


        Professor professor1 = new Professor("Carlos Silva", "Matemática");
        Professor professor2 = new Professor("Ana Pereira", "Psicologia");

        Aluno aluno1 = new Aluno("João", "123");
        Aluno aluno2 = new Aluno("Maria", "124");

      
        Turma turma1 = new Turma(disciplina1, professor1);
        Turma turma2 = new Turma(disciplina2, professor2);
        Turma turma3 = new Turma(disciplina3, professor1);

  
        turma1.adicionarAluno(aluno1);
        turma2.adicionarAluno(aluno2);
        turma3.adicionarAluno(aluno2);

        List<Disciplina> disciplinas = Arrays.asList(disciplina1, disciplina2);
        Relatorio<Disciplina> relatorioDisciplinas = new Relatorio<>(disciplinas);
        relatorioDisciplinas.gerarRelatorio();

        List<Turma> turmas = Arrays.asList(turma1, turma2);
        Relatorio<Turma> relatorioTurmas = new Relatorio<>(turmas);
        relatorioTurmas.gerarRelatorio();

        List<Aluno> alunos = Arrays.asList(aluno1, aluno2);
        Relatorio<Aluno> relatorioAlunos = new Relatorio<>(alunos);
        relatorioAlunos.gerarRelatorio();
    }
}