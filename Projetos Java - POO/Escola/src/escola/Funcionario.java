package escola;

public class Funcionario extends Pessoa {
    
    //Atributos
    private boolean trabalhando;
    private String setor;

    
    
    //Metodos publicos
    // ! -> inverso
    public void mudarTrabalho(){
        this.trabalhando =! this.trabalhando;
    }
    
    //Metodos Especiais

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
    
    
}
