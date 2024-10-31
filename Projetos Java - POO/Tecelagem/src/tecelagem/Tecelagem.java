package tecelagem;

public class Tecelagem {

    public static void main(String[] args) {

        Administracao a1 = new Administracao("Roger", "1234", 1200, "Administrador");
        a1.registrarFaltas(2);
        //a1.novoMes();
        a1.hollerith();
        
        Producao p1 = new Producao("Julia","5678",70,"Produtor");
        p1.registraHorasDiurnas(4);
        p1.registraHorasNoturnas(4);
        //p1.novoMes();
        p1.hollerith();
        
        Vendedores v1 = new Vendedores("Jubileu","9012",900,"Vendedor");
        v1.registrarVenda(790.90);
        //v1.novoMes();
        v1.hollerith();

       
    }
    
}
