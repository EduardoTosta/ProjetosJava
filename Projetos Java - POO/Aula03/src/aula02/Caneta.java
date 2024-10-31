
package aula02;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

        public void status(){
            System.out.println("Uma caneta " +this.cor);
            System.out.println("Modelo: "+ this.modelo);
            System.out.println("Ponta: "+ this.ponta);
            System.out.println("Carga: "+ this.carga);
            
            if(this.tampada == true){
                System.out.println("Ela esta tampada");
            }else{
                System.out.println("Ela esta destampada");
            }
       }

        public void rabiscar(){
            if(this.tampada == true){
                System.out.println("Erro, nao posso rabiscar");
            }else{
                System.out.println("Rabiscando");
            }
        }
        public void tampar(){
            this.tampada=true;
        }
        
        public void destampar(){
            this.tampada=false;
        }
        
        void pula_Linha(){
            System.out.println("\n");
        }
}