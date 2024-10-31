package examenoturno02;

public class Aluno {
    private int codAluno, qntFaltas;
    private double notaFinal;
    private String nomeAluno;
    
    //Metodo contrutor
    public Aluno(int codAluno, String nomeAluno) {
        this.codAluno = codAluno;
        //this.qntFaltas = qntFaltas;
        //this.notaFinal = notaFinal;
        this.nomeAluno = nomeAluno;
    }
    //Metodos especiais
    public void informacoesAluno(){
        System.out.println("Nome: " + this.nomeAluno + "\n"+
                           "Codigo: "+ this.codAluno + "\n"+ 
                           "Faltas totais: " + this.qntFaltas + "\n"+
                           "Nota final: " + this.notaFinal +"\n");
    }
    
    
    //Getters e Setters
    public int getCodAluno() {
        return codAluno;
    }

    public void setCodAluno(int codAluno) {
        this.codAluno = codAluno;
    }

    public int getQntFaltas() {
        return qntFaltas;
    }

    public void setQntFaltas(int qntFaltas) {
        this.qntFaltas = qntFaltas;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }
    
}
