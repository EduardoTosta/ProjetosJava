package tecelagem;

public class Vendedores extends Funcionario{
    //Atributos
    private double vendas, salarioVend;
    
    //Metodos
        //Metodo Construtor
    public Vendedores(String nome, String rg, double salarioBase, String funcao) {
        super(nome, rg, salarioBase, funcao);
    }
    
        //Metodos Especiais
    public void registrarVenda(double venda){
        this.vendas+=venda;
    }
        //Metodos Hereditarios
    @Override
    public double salarioLiquido(){
        return this.salarioVend = getSalarioBase()+(getVendas()*0.03);
    }
    
    @Override
    public void hollerith(){
        super.hollerith();
        System.out.println("Salario liquido: " + salarioLiquido());
        System.out.println("=======================================");
    }
    
    @Override
    public void novoMes(){
        this.vendas=0;
    }
    //Getters e Setters

    public double getVendas() {
        return vendas;
    }

    public void setVendas(double vendas) {
        if(vendas > 0);
        this.vendas = vendas;
    }

    public double getSalarioVend() {
        return salarioVend;
    }

    public void setSalarioVend(double salarioVend) {
        if(salarioVend > 0);
        this.salarioVend = salarioVend;
    }

    
}
