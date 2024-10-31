package estacionamentodecarros;

public abstract class Carros {
    private String placa, nomeVendedor;
    private int anoFab;
    public boolean disponivel;
    
    //Metodo Cosntrutor
    public Carros(String placa, int anoFab) {
        this.placa = placa;
        this.anoFab = anoFab;
    }
    //Metodos Especiais
    public boolean carroDisponivel() {
        this.disponivel = true;  // Definindo disponível como verdadeiro
        this.nomeVendedor = "";  // Limpando o nome do vendedor
        return true;             // Retornando verdadeiro
    }
    
    abstract boolean oferta(double valor);
    abstract boolean venderCarro(String vendedor, double valor);
       
    
    public void imprime(){
        System.out.println("========================================== " + "\n"+
                           "Placa: " + this.placa + "\n"+
                           "Ano de Fabricacao: " + this.anoFab + "\n"+
                           "Disponibilidade: " + this.disponivel + "\n"+
                           "Nome do Vendedor: " + this.nomeVendedor + "\n");
    }
    
    
    //Getters e Setters

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAnoFab() {
        return anoFab;
    }

    public void setAnoFab(int anoFab) {
        this.anoFab = anoFab;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public String getNomeVendedor() {
        return nomeVendedor;
    }

    public void setNomeVendedor(String nomeVendedor) {
        this.nomeVendedor = nomeVendedor;
    }

    
    
    
}
