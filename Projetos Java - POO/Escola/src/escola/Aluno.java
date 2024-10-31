package escola;

public class Aluno extends Pessoa {
    
    //Atributos
    private int matricula;
    private String curso;

    
    //Metodos publicos
    public void cancelarMatricula(){
        System.out.println("Matricula cancelada!");
    }
   
    //Metodos Especiais
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
