package faculdade;


public abstract class Pessoa {
    //Atributos
     private String nome;
     private String rg;
     private int qntFilhos;
     private double auxProc = 100;
     private double salario;
    
    //Metodos Publicos
        //construtor
    public Pessoa(String nome, String rg, int qntFilhos, double salario) {
        this.nome = nome;
        this.rg = rg;
        this.qntFilhos = qntFilhos;
        this.salario = salario;
    }
    
    
    //Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public int getQntFilhos() {
        return qntFilhos;
    }

    public void setQntFilhos(int qntFilhos) {
        this.qntFilhos = qntFilhos;
    }

    public double getAuxProc() {
        return auxProc;
    }

    public void setAuxProc(double auxProc) {
        this.auxProc = auxProc * this.qntFilhos;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    
    //Metodos Hereditários
    
    public abstract double calcularSalario();
    public abstract void zerarMes();   
    
    public double auxProcriacao(){
        return auxProc * qntFilhos;
    }
    
    public void hollerith(){
        System.out.println("Nome: " + this.nome +"\n"
                         + "RG: "   + this.rg +"\n"
                         + "Quantidade de filhos: "+ this.qntFilhos +"\n"
                         + "Auxilio procriação: " + this.auxProc +"\n"
                         + "Salario bruto: " + this.salario);
    }
    
    
    
    
    
}
