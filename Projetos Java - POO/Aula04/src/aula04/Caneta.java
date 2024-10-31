
package aula04;


public final class Caneta {
    
    private String modelo;
    private String cor;
    private float ponta;
    private boolean tampada;
    
    
    
    public Caneta(String m, String c, float p){ //-> Metodo construtor
        this.setModelo(m);
        this.setPonta(p);
        this.setCor(c);
        this.tampar(); 
    }
    
    
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }
    
    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float p){
        this.ponta = p;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
      public void tampar(){
        this.tampada=true;
    }
    public void destampar(){
        this.tampada=false;
    }
    
    public void status(){
        System.out.println("Sobre a caneta: ");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: "+ this.getPonta());
        System.out.println("Cor: "+this.getCor());
        if(tampada == true){
            System.out.println("Situacao: Tampada");
        }else{
            System.out.println("Situacao: Destampada");
        }
    }
    
  
    
    
}
