package domain;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String name;
    private List<Curso> cursos;

    public Aluno(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.name = name;
        this.cursos = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getQuantidadeCursos() {
        return cursos.size();
    }

    public void adicionarCurso(Curso curso) {
        cursos.add(curso);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "name='" + name + '\'' +
                ", cursos=" + cursos +
                '}';
    }
}
