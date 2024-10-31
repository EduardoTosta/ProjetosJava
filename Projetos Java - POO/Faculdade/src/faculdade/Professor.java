package faculdade;

public class Professor extends Pessoa {
    
    private int qntAulas;

    public Professor(int qntAulas, String nome, String rg, int qntFilhos, double salario) {
        super(nome, rg, qntFilhos, salario);
        this.qntAulas = qntAulas;
    }
    
    
    public void registraAulas(int qnt){
        qntAulas += qnt;
    }
    
    @Override
    public void zerarMes(){
        qntAulas= 0;
    }
    
    @Override
    public double calcularSalario(){
        return getSalario()*qntAulas + auxProcriacao();
    }
    
    @Override
    public void hollerith(){
        super.hollerith();
        System.out.println("\nAulas ministradas: " + qntAulas);
        System.out.println("==================================");
        
    }
}
