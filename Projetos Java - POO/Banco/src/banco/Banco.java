package banco;

public class Banco {

    public static void main(String[] args) {
        
        ContaBanco p1 = new ContaBanco();
        
        p1.setNumConta(01);
        p1.setDono("Ronaldo");
        p1.abrirConta("CC");
       
        
        ContaBanco p2 = new ContaBanco();
        
        p2.setNumConta(02);
        p2.setDono("Joselina");
        p2.abrirConta("CP");
        
        
        p1.depositar(300);
        p2.depositar(500);
        
        p2.sacar(100);
        p1.sacar(350);
        
        
        p1.fecharConta();
        
        p1.informacoes();
        p2.informacoes();
        
    }
    
}
