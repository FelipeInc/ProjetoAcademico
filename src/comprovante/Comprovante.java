package comprovante;

import domain.Aluno;
import domain.Curso;

public interface Comprovante {
    String gerar(Aluno aluno, Curso curso, double valor);
}


