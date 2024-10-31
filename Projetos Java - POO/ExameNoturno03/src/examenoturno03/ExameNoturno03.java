package examenoturno03;

public class ExameNoturno03 {

    public static void main(String[] args) throws Exception {
        
        Turma turma1 = new Turma("ADS", 36);
        Aluno aluno1 = new Aluno(1, "Ronaldo");
        Aluno aluno2 = new Aluno(2, "Emanuelle");
        
        aluno1.atribuirNota(1, 10.0);
        aluno1.registrarFalta(1, 27);
        
        aluno2.atribuirNota(2, 8.0);
        aluno2.registrarFalta(2, 25);
        
        
        turma1.incluirAluno(aluno1);
        turma1.incluirAluno(aluno2);
        //turma1.incluirAluno(aluno1);
        turma1.listarAprovados();
    }
    
}
