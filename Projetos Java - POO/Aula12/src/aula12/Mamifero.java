package aula12;

public class Mamifero extends Animal {
    //Atributos
    private String corPelo;
    
    //Metodos
        //Metodo Construtor
        
        //Metodos Hereditários
    @Override
    public void locomover(){
        System.out.println("Correndo");
    }
    @Override
    public void alimentar() {
        System.out.println("Mamando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de mamifero");
    }

        //Metodos Especiais
    
    
    
        //Getters e Setters

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
        
    
}