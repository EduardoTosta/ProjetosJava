package banco;

public class ContaBanco {
    
    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    
    
    //Metodo construtor
    public ContaBanco(){
        this.saldo = 0;
        this.status = false;
    }
    
    //getters e setters
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float s) {
        this.saldo = s;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String d) {
        this.dono = d;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean s) {
        this.status = s;
    }
    
    
    //metodos
    public void abrirConta(String t){
      this.setTipo(t);
      this.setStatus(true);
        if("CC".equals(t)){
            this.setSaldo(50);
        }else if("CP".equals(t)){
            this.setSaldo(150);
        }
        System.out.println("Conta aberta!");
        
  } 
    
    
    public void fecharConta(){
        if(this.getSaldo() > 0){
            System.out.println("A conta tem dinheiro, nao pode ser fechada");
        }else if(this.getSaldo() < 0){
        System.out.println("Conta em débito");
        }else{
            this.setStatus(false);
            System.out.println("Conta fechada");
            
        }
    }
    
    
    public  void depositar(float v){
        if(this.getStatus()){
            this.setSaldo(this.getSaldo()+v);
            System.out.println("Deposito realizado na conta: " + this.getNumConta());
        }else{
            System.out.println("Erro!");
        }
    }
    
    public void sacar(float v){
        if(this.getStatus()){
            if(this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado");
            }else{
                System.out.println("Saldo insuficiente");
            }
        }else{
            System.out.println("Impossivel sacar de uma conta fechada");
        }
            
    
    }
    public void pagarMensal(){
        int v = 0;
        if("CC".equals(this.getTipo())){
            v=12;
        }else if("CP".equals(this.getTipo())){
            v = 20;
        }
        if (this.getStatus()){
            this.setSaldo(this.getSaldo()- v);
            System.out.println("Mensalidade paga");
        }else{
            System.out.println("Impossivel pagar, conta fechada");
        }
 }
    
    
    public void informacoes(){
            System.out.println("============================================");
            System.out.println("Numero da conta: " + this.getNumConta());
            System.out.println("Tipo de conta: " + this.getTipo());
            System.out.println("Dono da conta: " + this.getDono());
            System.out.println("Saldo da conta: " + this.getSaldo());
            System.out.println("Status da conta: "+ this.getStatus());
            
        }
    }
    
    
    
    
    
    

