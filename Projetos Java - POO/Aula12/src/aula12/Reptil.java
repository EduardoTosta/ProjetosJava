package aula12;

public class Reptil extends Animal {
    //Atributos
    private String corEscama;
    
    //Metodos
        //Metodo Construtor
    
        //Metodos Hereditários
     @Override
    public void locomover() {
         System.out.println("Rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo vegetais");
    }

    @Override
    public void emitirSom() {
        System.out.println("som de Reptil");
    }    
        //Metodos Especiais
    
        //Getters e Setters

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    
   
    
}
