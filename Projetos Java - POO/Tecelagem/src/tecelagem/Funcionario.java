package tecelagem;
public abstract class Funcionario {
    //Atributos
    private String nome,rg,funcao;
    private double salarioBase;
    //Metodos 
        //Metodo Construtor
    public Funcionario(String nome, String rg, double salarioBase, String funcao) {
        this.nome = nome;
        this.rg = rg;
        this.salarioBase = salarioBase;
        this.funcao = funcao;
    }
        //Metodos Especiais
    public double salarioLiquido(){
        return this.salarioBase;
    }
    
    public void hollerith(){
        System.out.println("Funcao: "       + this.funcao      + "\n"
                          +"Nome: "         + this.nome        + "\n"
                          +"RG:   "         + this.rg          + "\n"
                          +"Salario base: " + this.salarioBase );
    }
    
    public void novoMes(){
        
    }
    
    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(!nome.isBlank());
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        if(!rg.isBlank());
        this.rg = rg;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        if(salarioBase > 0);
        this.salarioBase = salarioBase;
    }

    public String getFuncao() {
        if(!funcao.isBlank());
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    
    
    
}
