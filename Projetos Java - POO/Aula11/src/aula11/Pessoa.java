package aula11;

public abstract class Pessoa { //abstract pois ela nao criará objetos
    
    //Atributos
    private String nome,sexo;
    private int idade;
    
    //Metodos publicos
    
     //Getters e Setters
     //Metodos Especiais
     public void fazerAniv(){
        
    }
     
     
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Dados: {"+ "nome=" + nome + ", sexo=" + sexo + ", idade=" + idade + '}';
    }
    
    
    
    
}
