
package aula02;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

        void status(){
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

        void rabiscar(){
            if(this.tampada == true){
                System.out.println("Erro, nao posso rabiscar");
            }else{
                System.out.println("Rabiscando");
            }
        }
        void tampar(){
            this.tampada=true;
        }
        
        void destampar(){
            this.tampada=false;
        }
        
        void pula_Linha(){
            System.out.println("\n");
        }
}