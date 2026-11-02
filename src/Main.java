import Matricula.ServicoMatricula;
import comunicacao.Auditoria;
import comunicacao.AvisoEmail;
import comunicacao.CriadorTexto;
import configuracao.Configuracao;
import desconto.DescontoEstudante;
import domain.Aluno;
import domain.Curso;
import fachada.FachadaAcademica;
import pagamento.AdaptadorPagamento;
import pagamento.SistemaLegado;


public class Main {
    public static void main(String[] args) {
        System.out.println(Configuracao.getInstancia().getNome());
        Aluno aluno = new Aluno("Ana");
        Curso curso = new Curso("Java", 200.0);
        ServicoMatricula servico = new ServicoMatricula(new DescontoEstudante(), new
                AdaptadorPagamento(new SistemaLegado()));
        servico.inscrever(new AvisoEmail());
        servico.inscrever(new Auditoria());
        FachadaAcademica fachada = new FachadaAcademica(servico, new CriadorTexto());
        System.out.println(fachada.matricularEEmitir(aluno, curso));
        System.out.println("Cursos do aluno: " + aluno.getQuantidadeCursos());
    }
}