package estacionamentodecarros;

import java.util.ArrayList;
import java.util.List;

public class Estacionamento {
    private List<CarrosConsignados>  carrosConsignados;
    private List<CarrosProprios>  carrosProprios;

    
    //Metodo Construtor
    public Estacionamento() {
        this.carrosConsignados = new ArrayList<>();
        this.carrosProprios = new ArrayList<>();
    }
    
    //Metodos Especiais
    public void addCarroConsignado(CarrosConsignados carro){
        carrosConsignados.add(carro);
    }
    
    public void addCarroProprio(CarrosProprios carro){
        carrosProprios.add(carro);
    }
    
    public void listarCarrosConsignados(){
        System.out.println("Carros Consignados:\n");
        for(CarrosConsignados carro : carrosConsignados){
            carro.imprime();
        }
    }
    public void listarCarrosProprios(){
        System.out.println("Carros Proprios: \n");
        for(CarrosProprios carro: carrosProprios){
            carro.imprime();
        }
    }
    
    public void removerConsignados(String placaDoCarro){
       for(CarrosConsignados carro: carrosConsignados){
           if(!carro.getPlaca().equals(placaDoCarro)){
               System.out.println("Carro não listado!");
           }else{
               carrosConsignados.remove(carro);
               System.out.println("Carro removido!");
           }
       }
    }
    
    public void removerProprios(String placaDoCarro){
       for(CarrosProprios carro: carrosProprios){
           if(!carro.getPlaca().equals(placaDoCarro)){
               System.out.println("Carro não listado!");
           }else{
               carrosProprios.remove(carro);
               System.out.println("Carro removido!");
           }
       }
    }
    
    public boolean venderConsignados(String placaDoCarro, String vendedor, double valor){
        for(CarrosConsignados carro: carrosConsignados){
            if(carro.getPlaca().equals(placaDoCarro)){
               return carro.venderCarro(vendedor, valor);
            }
        }
        return false;
    }
    
    public boolean venderProprios(String placaDoCarro, String vendedor, double valor){
        for(CarrosProprios carro: carrosProprios){
            if(carro.getPlaca().equals(placaDoCarro)){
                return carro.venderCarro(vendedor, valor);
            }
        }
        return false;
    }

    
    
    
}