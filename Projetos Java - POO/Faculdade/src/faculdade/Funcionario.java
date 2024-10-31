package faculdade;

public class Funcionario extends Pessoa{
    
    private int faltas;
    private final double valeCox= 42;

    public Funcionario(int faltas, String nome, String rg, int qntFilhos, double salario) {
        super(nome, rg, qntFilhos, salario);
        this.faltas = 0;
    }
     
    
    
    public void registraFaltas(){
        faltas++;
    }
    
    @Override
    public double calcularSalario(){
        return getSalario() + valeCox + auxProcriacao() - ((getSalario()/20)*faltas);
    }

   @Override
    public void zerarMes(){
        faltas= 0;
    }
    
    @Override
    public void hollerith(){
        super.hollerith();
        System.out.println("================================");
        System.out.println("Faltas no mes: " + faltas);
    }
    
    
    
}
