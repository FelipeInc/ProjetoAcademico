package comprovante;

import domain.Aluno;
import domain.Curso;

public class ComprovanteTexto implements Comprovante{
        public String gerar(Aluno aluno, Curso curso, double valor) {
            return "Matrícula: " + aluno.getName() + " / " + curso.getTitulo() + " / R$ " + valor;
        }
}
