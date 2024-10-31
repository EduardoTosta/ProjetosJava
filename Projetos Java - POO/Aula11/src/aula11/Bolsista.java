package aula11;

public class Bolsista extends Aluno {
    //Atributos
    private int bolsa;
    //Metodos Publicos
   
     //Getters e Setters
    //Metodos Especiais
    public void renovarBolsa(){
        System.out.println("Bolsa do aluno " + this.getNome() + "renovada");
    }
    
    @Override
    public void pagarMensalidade(){
        System.out.println("Mensalidade do bolsista " + this.getNome() + "renovada");
    }
    
    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
    
     
}
