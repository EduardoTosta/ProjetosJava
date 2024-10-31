package examenoturno;

public class Alunos {
    private int codigo;
    private String nome;
    private double notaFinal;
    private int quantidadeFaltas;

    // Construtor da classe Aluno
    public Alunos(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        this.notaFinal = 0.0;
        this.quantidadeFaltas = 0;
    }

    // Getters e Setters
    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    public int getQuantidadeFaltas() {
        return quantidadeFaltas;
    }

    public void adicionarFalta() {
        this.quantidadeFaltas++;
    }
}


