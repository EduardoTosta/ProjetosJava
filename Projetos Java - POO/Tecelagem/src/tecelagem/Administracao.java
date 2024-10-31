package tecelagem;
public class Administracao extends Funcionario{
    //Atributos
    private int faltas;
    private double salarioAdm;
    
    //Metodos
        //Metodo construtos
     public Administracao(String nome, String rg, double salarioBase, String funcao) {
        super(nome, rg, salarioBase, funcao);
       
    }
        //Metodos Especiais
     public void registrarFaltas(int falta){
         this.faltas+=falta;
     }
        //Metodos Hereditários
    @Override
    public double salarioLiquido(){
        return salarioAdm = getSalarioBase()-(faltas*(getSalarioBase()/30));
    }
    
    @Override
    public void hollerith(){
        super.hollerith();
        System.out.println("Salario liquido: " + salarioLiquido());
        System.out.println("=======================================");
    }
    
    @Override
    public void novoMes(){
        this.faltas = 0;
    }
    //Getters e Setters
    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        if(faltas >= 0);
        this.faltas = faltas;
    }

    public double getSalarioAdm() {
        return salarioAdm;
    }

    public void setSalarioAdm(double salarioAdm) {
        if(salarioAdm > 0);
        this.salarioAdm = salarioAdm;
    }
     
   
}
