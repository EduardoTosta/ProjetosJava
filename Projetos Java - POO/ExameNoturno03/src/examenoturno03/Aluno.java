package examenoturno03;

public class Aluno {
    private int codAluno, qntFaltas;
    private String nomeAluno;
    private double notaFinal;
    
    //Metodo Construtor
    public Aluno(int codAluno, String nomeAluno) {
        this.codAluno = codAluno;
        this.nomeAluno = nomeAluno;
    }
    
    //Metodos Especiais
    public boolean registrarFalta(int codigo, int falta) throws Exception{
        if(codigo == codAluno){
            this.qntFaltas += falta;
            System.out.println("Falta registrada com sucesso\n");
            return true;
        }else{
            throw new Exception("Aluno nao cadastrado\n");
        }
    }
    
    public boolean atribuirNota(int codigo, double nota) throws Exception{
        if(codigo == codAluno){
            this.notaFinal = nota;
            System.out.println("Nota atribuida com sucesso!\n");
            return true;
        }else{
           throw new Exception("Aluno não cadastrado\n");
        }
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

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }
    
    
}
