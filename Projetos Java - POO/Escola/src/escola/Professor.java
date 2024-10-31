package escola;
public class Professor extends Pessoa{
    
    //Atributos
    private String especialidade;
    private float salario;

   
    
    //Metodos publicos
    public void receberAumento(float n){
        this.salario += n;
    }
    //Metodos Especiais

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
    
}
