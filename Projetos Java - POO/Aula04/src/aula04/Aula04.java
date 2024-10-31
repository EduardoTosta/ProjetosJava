
package aula04;

public class Aula04 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta("BIC", "Vermelha", 0.7f);
        c1.status();
        //c1.setModelo("BIC");
        //c1.modelo="BIC";
        //c1.setPonta(0.5f); // -> este nao da erro pois "setPonta" é publico
        //c1.ponta=0.5f; //-> este da erro pois "ponta" é privado
        Caneta c2 = new Caneta("Faber-Castel", "Preta", 0.5f);
        c2.status();
        
    }
    
}
