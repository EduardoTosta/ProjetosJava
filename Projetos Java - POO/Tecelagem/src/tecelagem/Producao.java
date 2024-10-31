package tecelagem;
public class Producao extends Funcionario {
    //Atributos
    private double salarioProd;
    private int horasDiurnas, horasNoturnas;
    //Metodos
        //Metodo Construtor
    public Producao(String nome, String rg, double salarioBase, String funcao) {
        super(nome, rg, salarioBase, funcao);
    }
    
        //Metodos Especiais
    public void registraHorasDiurnas(int horas){
        this.horasDiurnas += horas;
    }
    public void registraHorasNoturnas(int horas){
        this.horasNoturnas += horas;
    }
    
        //Metodos Hereditários
    @Override
    public double salarioLiquido(){
        return this.salarioProd = (getSalarioBase()*getHorasDiurnas()) + getHorasNoturnas()*(0.3*(getSalarioBase()*getHorasDiurnas()));
    }
    
    @Override
    public void hollerith(){
        super.hollerith();
        System.out.println("Salario liquido: " + salarioLiquido());
        System.out.println("=======================================");
    }
    
    @Override
    public void novoMes(){
        this.horasDiurnas =0;
        this.horasNoturnas = 0;
    }
    //Getters e Setters
    public double getSalarioProd() {
        return salarioProd;
    }

    public void setSalarioProd(double salarioProd) {
        if(salarioProd > 0);
        this.salarioProd = salarioProd;
    }

    public int getHorasDiurnas() {
        return horasDiurnas;
    }

    public void setHorasDiurnas(int horasDiurnas) {
        if(horasDiurnas > 0);
        this.horasDiurnas = horasDiurnas;
    }

    public int getHorasNoturnas() {
        return horasNoturnas;
    }

    public void setHorasNoturnas(int horasNoturnas) {
        if(horasNoturnas > 0);
        this.horasNoturnas = horasNoturnas;
    }
    
}
