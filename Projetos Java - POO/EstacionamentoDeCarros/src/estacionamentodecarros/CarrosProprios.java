package estacionamentodecarros;
import java.time.LocalDate;

public class CarrosProprios extends Carros {
    private int ano,dia,mes;
    private double valorCompra;
    LocalDate dataEspecifica;

   public CarrosProprios(double valorCompra, String placa, int anoFab, int ano, int mes, int dia) {
        super(placa, anoFab);
        this.ano = ano;
        this.dia = dia;
        this.mes = mes;
        this.dataEspecifica = LocalDate.of(ano, mes, dia);
        this.valorCompra = valorCompra;
    }

    //Metodos Especiais

    @Override
    public boolean venderCarro(String vendedor, double valor) {
        if(oferta(valor) == true && this.disponivel == true){
            System.out.println("Vendido!\n");
            this.setNomeVendedor(vendedor);
            this.setDisponivel(false);
            return true;
        }
        System.out.println("Valor abaixo do esperado!\n");
        return false;
    }

    @Override
    public boolean oferta(double valor) {
        double valorVenda = this.valorCompra * 1.10;
        if(valor>=valorVenda){
            System.out.println("Oferta aceita!\n");
            return true;
        }
        System.out.println("Valor abaixo do esperado!" + "\n"+
                           "Valor minimo esperado: "+ valorVenda + "\n");
        return false;
    }

    @Override
    public void imprime() {
        super.imprime(); 
         System.out.println("Valor da compra: " + this.valorCompra + "\n"+
                            "Data da compra: " + this.dataEspecifica + "\n");
    }
    
    

    @Override
    public boolean carroDisponivel() {
        return super.carroDisponivel(); 
    }
    
    
    //Getters e Setters
    public double getValorCompra() {
        return valorCompra;
    }


    public LocalDate getDataEspecifica() {
        return dataEspecifica;
    }

   
    
    
    
    
}
