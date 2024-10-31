package ultraemojicombate;

import java.util.Random;

public class Luta {
    
    //Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    //Métodos Publicos
    public void marcarLuta(Lutador l1,Lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            this.aprovada = true;
            desafiante = l1;
            desafiado = l2;
        }else{
            this.aprovada = false;
            desafiado = null;
            desafiante = null;
        }
        
    }
    public void lutar(){
        if(this.aprovada){
            System.out.println("Desafiado: ");
            this.desafiado.apresentar();
            System.out.println("Desafiante: ");
            this.desafiante.apresentar();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt();
            System.out.println("====RESULTADO DA LUTA====");
            switch(vencedor){
                case 0: {
                    System.out.println("EMPATE!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                }
                case 1: {
                    System.out.println("Vitoria do: " + this.desafiado);
                    this.desafiado.ganharLuta();
                    this.desafiado.perderLuta();
                }
                case 2: {
                    System.out.println("Vitoria do: " + this.desafiante);
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                }
                System.out.println("===============================");
            }
        }else{
            System.out.println("A luta nao pode acontecer");
        }
    }
    //Métodos Especiais

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador dd) {
        this.desafiado = dd;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
}
