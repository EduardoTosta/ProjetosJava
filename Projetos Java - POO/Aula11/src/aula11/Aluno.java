package aula11;

public class Aluno extends Pessoa {
    //Atributos
    private int matricula;
    private String curso;

    
    //Metodos Publicos
    
     //Getters e Setters
    //Metodos Especiais
     public void pagarMensalidade(){
         System.out.println("Mensalidade do aluno " + this.getNome() + " Paga!");
    }
     
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
}
