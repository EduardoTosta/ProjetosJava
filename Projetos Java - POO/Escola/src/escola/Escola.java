package escola;

public class Escola {

    public static void main(String[] args) {
        
      Pessoa p1 = new Pessoa();
      Aluno p2 = new Aluno();
      Professor p3 = new Professor();
      Funcionario p4 = new Funcionario();
      
      p1.setNome("Joao");
      p2.setNome("Andre");
      p3.setNome("Maria");
      p4.setNome("Claudia");
      
      p1.setSexo("M");
      p2.setSexo("M");
      p2.setIdade(18);
      
      p2.setCurso("Informatica");
      p3.setSalario(2500.75f);
      p4.setSetor("Estoque");
              
      //p1.receberAumento(550.20f);
      //p2.mudarTrabalho();
      //p4.cancelarMatricula();
    }
    
}
