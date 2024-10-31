package estacionamentodecarros;

public class CarrosConsignados extends Carros {
    private String nomeProprietario;
    private double valorDesejado;

    public CarrosConsignados(String nomeProprietario, double valorDesejado, String placa, int anoFab) {
        super(placa, anoFab);
        this.nomeProprietario = nomeProprietario;
        this.valorDesejado = valorDesejado;
    }
    
    //Metodos Especiais
      @Override
    public boolean venderCarro(String vendedor, double valor) {
        if(oferta(valor) == true && this.disponivel == true){
            System.out.println("Vendido!\n");
            this.setNomeVendedor(vendedor);
            this.setDisponivel(false);
            return true;
        }else if(!this.disponivel == true){
          System.out.println("Mas, o carro ja foi vendido!\n");
          return false;
        }
          else{
               return false;
                  }  
          
    }

    @Override
    public boolean oferta(double valor) {
        double valorVenda = this.valorDesejado * 1.5;
        if(valor>=valorVenda){
            System.out.println("Oferta aceita!\n");
            return true;
        }
        System.out.println("Valor abaixo do esperado!\n"+
                           "Valor minimo esperado: "+ valorVenda + "\n");
        return false;
    }

    @Override
    public void imprime() {
        super.imprime(); 
         System.out.println("Valor Desejado: " + this.valorDesejado + "\n"+
                            "Nome do proprietario: " + this.nomeProprietario + "\n");
    }
    
    
    //Getters e Setters
    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }

    public double getValorDesejado() {
        return valorDesejado;
    }

    public void setValorDesejado(double valorDesejado) {
        this.valorDesejado = valorDesejado;
    }

    
    
}
