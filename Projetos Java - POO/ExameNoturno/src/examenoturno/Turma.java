package examenoturno;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private String nomeCurso;
    private int totalAulas;
    private List<Alunos> listaDeAlunos;

    // Construtor da classe Turma
    public Turma(String nomeCurso, int totalAulas) {
        this.nomeCurso = nomeCurso;
        this.totalAulas = totalAulas;
        this.listaDeAlunos = new ArrayList<>();
    }

    // Método para incluir um aluno
    public void incluirAluno(Alunos al) {
        if (listaDeAlunos.size() >= 20) {
            throw new IllegalStateException("A lista de alunos já está cheia. Não é possível adicionar mais alunos.");
        }
        if (buscarAluno(al.getCodigo()) != null) {
            throw new IllegalArgumentException("Já existe um aluno com o código: " + al.getCodigo());
        }
        listaDeAlunos.add(al);
        System.out.println("Aluno incluído com sucesso!");
    }

    // Método para buscar um aluno pelo código
    public Alunos buscarAluno(int codigo) {
        for (Alunos aluno : listaDeAlunos) {
            if (aluno.getCodigo() == codigo) {
                return aluno;
            }
        }
        return null;
    }

    // Método para registrar uma falta
    public void registrarFalta(int codigo) {
        Alunos aluno = buscarAluno(codigo);
        if (aluno == null) {
            throw new IllegalArgumentException("Aluno com o código " + codigo + " não encontrado.");
        }
        aluno.adicionarFalta();
    }

    // Método para atribuir uma nota
    public void atribuirNota(int codigo, double nota) {
        if (nota < 1 || nota > 10) {
            throw new IllegalArgumentException("Nota inválida. A nota deve ser entre 1 e 10.");
        }
        Alunos aluno = buscarAluno(codigo);
        if (aluno == null) {
            throw new IllegalArgumentException("Aluno com o código " + codigo + " não encontrado.");
        }
        aluno.setNotaFinal(nota);
    }

    // Método para listar todos os alunos
    public void listarAlunos() {
        System.out.println("Curso: " + nomeCurso);
        System.out.println("Total de Aulas: " + totalAulas);
        System.out.println("Lista de Alunos:");
        for (Alunos aluno : listaDeAlunos) {
            double frequencia = ((totalAulas - aluno.getQuantidadeFaltas()) / (double) totalAulas) * 100;
            System.out.printf("Código: %d, Nome: %s, Nota Final: %.2f, Faltas: %d, Frequência: %.2f%%\n",
                    aluno.getCodigo(), aluno.getNome(), aluno.getNotaFinal(), aluno.getQuantidadeFaltas(), frequencia);
        }
    }

    // Método para listar alunos aprovados
    public void listarAprovados() {
        System.out.println("Curso: " + nomeCurso);
        System.out.println("Total de Aulas: " + totalAulas);
        System.out.println("Lista de Alunos Aprovados:");
        for (Alunos aluno : listaDeAlunos) {
            double frequencia = ((totalAulas - aluno.getQuantidadeFaltas()) / (double) totalAulas) * 100;
            if (aluno.getNotaFinal() >= 6 && frequencia >= 75) {
                System.out.printf("Código: %d, Nome: %s, Nota Final: %.2f, Faltas: %d, Frequência: %.2f%%\n",
                        aluno.getCodigo(), aluno.getNome(), aluno.getNotaFinal(), aluno.getQuantidadeFaltas(), frequencia);
            }
        }
    }
}
