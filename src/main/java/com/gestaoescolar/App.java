package com.gestaoescolar;

import com.gestaoescolar.model.Disciplina;
import com.gestaoescolar.model.Professor;
import com.gestaoescolar.model.Turma;
import com.gestaoescolar.util.Relatorio;
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
        Disciplina disciplinaObrigatoria = new DisciplinaObrigatoria("Matemática", "Cálculo", "MAT-001");
        Disciplina disciplinaOptativa = new DisciplinaOptativa("Física", "Mecânica", "FIS-001", Arrays.asList("MAT-001"));
        Disciplina disciplinaTopicos = new DisciplinaTopicos("Tópicos em Computação", "Tópicos em Computação", "COM-001", Arrays.asList("COM-001"));

        Professor professor = new Professor("João", null);

        Aluno aluno1 = new Aluno("Maria", "123");
        Aluno aluno2 = new Aluno("Jose", "456");

        Turma turma = new Turma(disciplinaObrigatoria, professor, Arrays.asList(aluno1, aluno2));

        turma.exibirInformacoes();

        List<Turma> turmas = Arrays.asList(turma);
        Relatorio<Turma> relatorioTurmas = new Relatorio<>(turmas);
        relatorioTurmas.gerarRelatorio();
       }
}
