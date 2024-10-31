package examenoturno02;

import java.util.ArrayList;

public class ExameNoturno02 {

    public static void main(String[] args) throws Exception {
        Turma turma1 = new Turma("POO", 20);
        turma1.setListaAlunos(new ArrayList<>());
        
        
        Aluno aluno1 = new Aluno(01,"Eduardo");
        Aluno aluno2 = new Aluno(02,"Frank");
        Aluno aluno3 = new Aluno(03,"Rodrigo");
                
       
        turma1.incluirAluno(aluno1);
        turma1.registrarFalta(01,2);
        turma1.atribuirNota(01, 6.0);
        
        
        turma1.incluirAluno(aluno2);
        turma1.registrarFalta(02,19);
        turma1.atribuirNota(02, 10.0);
        
        turma1.incluirAluno(aluno3);
        turma1.registrarFalta(03, 6);
        turma1.atribuirNota(03, 4.0);
        
        
        
        
       //turma1.listarAlunos();
       turma1.listarAprovados();
        
    }
    
}
