package examenoturno;

public class ExameNoturno {

    public static void main(String[] args) {

       // Criar uma turma
        Turma turma = new Turma("Curso de Informática", 40);

        // Criar alunos
        Alunos aluno1 = new Alunos(1, "Alice");
        Alunos aluno2 = new Alunos(2, "Bob");
        Alunos aluno3 = new Alunos(3, "Carlos");
        
        // Incluir alunos na turma
        turma.incluirAluno(aluno1);
        turma.incluirAluno(aluno2);
        turma.incluirAluno(aluno3);
        
        // Tentar incluir um aluno com código duplicado
        try {
            Alunos alunoDuplicado = new Alunos(2, "Duplicado");
            turma.incluirAluno(alunoDuplicado);
        } catch (Exception e) {
            System.out.println("Erro ao incluir aluno duplicado: " + e.getMessage());
        }

        // Registrar faltas
        turma.registrarFalta(1);  // Alice
        turma.registrarFalta(1);  // Alice
        turma.registrarFalta(2);  // Bob

        // Tentar registrar falta para um aluno não existente
        try {
            turma.registrarFalta(4);  // Aluno não existente
        } catch (Exception e) {
            System.out.println("Erro ao registrar falta: " + e.getMessage());
        }

        // Atribuir notas
        turma.atribuirNota(1, 9.0);  // Alice
        turma.atribuirNota(2, 7.5);  // Bob
        turma.atribuirNota(3, 5.5);  // Carlos

        // Tentar atribuir uma nota fora do intervalo permitido
        try {
            turma.atribuirNota(1, 11.0);  // Nota inválida
        } catch (Exception e) {
            System.out.println("Erro ao atribuir nota: " + e.getMessage());
        }

        // Listar todos os alunos
        System.out.println("\nLista de todos os alunos:");
        turma.listarAlunos();

        // Listar alunos aprovados
        System.out.println("\nLista de alunos aprovados:");
        turma.listarAprovados();
    }
}
        
        
        
        
    
    

