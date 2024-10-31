package estacionamentodecarros;

public class EstacionamentoDeCarros {

    public static void main(String[] args) {
            
        Estacionamento estacionamento = new Estacionamento();
        
        CarrosProprios carroP1 = new CarrosProprios(33250.0,"STR1205",2008,2022,1,8);
        CarrosProprios carroP2 = new CarrosProprios(28220.0,"JHS3879",2013,2024,8,25);
        CarrosConsignados carroC1 = new CarrosConsignados("Joaquim",22375.0,"XXT0987",2003);
        CarrosConsignados carroC2 = new CarrosConsignados("Clodoaldo",75820.0,"LAK9752",2018);
        
         estacionamento.addCarroConsignado(carroC1);
         estacionamento.addCarroConsignado(carroC2);
         
         estacionamento.addCarroProprio(carroP1);
         estacionamento.addCarroProprio(carroP2);

        /* 
        carroP1.carroDisponivel();
        carroP1.oferta(38800.0);
        carroP1.venderCarro("Valdecir", 38800.0);
        //
        carroP2.carroDisponivel();
        carroP2.oferta(87540.0);
        carroP2.venderCarro("Higo", 65478.0);
        //
        carroC1.carroDisponivel();
        carroC1.oferta(35800.0);
        carroC1.venderCarro("Joao", 35800.0);
        /*/
        //carroC2.carroDisponivel();
        //carroC2.oferta(24520.0);
        //carroC2.venderCarro("Josenildo", 130547.0);
        //carroC2.venderCarro("Josenildo", 130547.0);
               
        
      // estacionamento.listarCarrosConsignados();
      // estacionamento.listarCarrosProprios();
    }
    
}
