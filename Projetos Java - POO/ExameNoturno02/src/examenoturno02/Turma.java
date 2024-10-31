package examenoturno02;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private String nomeTurma;
    private int qntAulas;
    private List<Aluno> listaAlunos;
    
    //Metodo construtor

    public Turma(String nomeTurma, int qntAulas) {
        this.nomeTurma = nomeTurma;
        this.qntAulas = qntAulas;
        this.listaAlunos = new ArrayList<>();
    }
    

    //Metodos especiais
    public void incluirAluno(Aluno al) throws Exception {
        if(getListaAlunos().size() >= 20){
            throw new Exception("Lista Cheia");
        }
        
        int codigo = al.getCodAluno();
        for(Aluno aluno: getListaAlunos()){
            if(aluno.getCodAluno() == codigo){
                throw new Exception("Aluno ja cadastrado");
            }
        }
        getListaAlunos().add(al);
        System.out.println("Aluno cadastrado!\n");
    }
    
    public void buscarAluno(int codigo) throws Exception{
        boolean alunoEncontrado = false;
        for(Aluno aluno: getListaAlunos()){
          if(aluno.getCodAluno() == codigo){
               aluno.informacoesAluno();
               alunoEncontrado = true;    
          }         
        }
        if(!alunoEncontrado) {
            throw new Exception("Aluno não cadastrado!");
            }  
        
    }
    
    public void registrarFalta(int codigo, int falta) throws Exception {
        boolean alunoEncontrado = false;
        for (Aluno aluno : getListaAlunos()) {
            if (aluno.getCodAluno() == codigo) {
                aluno.setQntFaltas(aluno.getQntFaltas() + falta);
                alunoEncontrado = true;         
                break;
            }
    
        }
        if(alunoEncontrado = true) {
            System.out.println("Falta acrescentada com Sucesso!\n");
            }else{
                throw new Exception("Aluno não cadastrado!");
            }  
    }
  
    public void atribuirNota(int codigo, double nota) throws Exception {
    boolean alunoEncontrado = false;
    
    for (Aluno aluno : getListaAlunos()) {
        if (aluno.getCodAluno() == codigo) {
            aluno.setNotaFinal(nota);
            alunoEncontrado = true;
            break;
        }
    }
    
    if (!alunoEncontrado) {
        throw new Exception("Aluno não cadastrado!");
    }
}
    
    public void listarAlunos(){
        System.out.println("-------------------------------------------");
        System.out.println("Turma: "+ this.nomeTurma +"\n"+
                           "Quantidade de Aulas: " + this.qntAulas+"\n");
        for (Aluno aluno : getListaAlunos()) {
            aluno.informacoesAluno();
        }
        System.out.println("-------------------------------------------");
    }
    
    public void listarAprovados(){
        boolean aprovado = false;
        System.out.println("-------------------------------------------");
        System.out.println("Turma: "+ this.nomeTurma +"\n"+
                           "Quantidade de Aulas: " + this.qntAulas+"\n");
        
        double faltasPermitidas = this.getQntAulas()*0.75;
        
        for (Aluno aluno : listaAlunos) {
            if(aluno.getNotaFinal() >= 6 && aluno.getQntFaltas()<= faltasPermitidas){
                aluno.informacoesAluno();
                aprovado = true;
                }
        }
        if(!aprovado)
            System.out.println("Nenhum aluno dessa turma foi aprovado!");
        
    }
    
    //Getters e Setters
    public List<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public void setListaAlunos(List<Aluno> listaAlunos) {
        this.listaAlunos = listaAlunos;
    }

    public String getNomeTurma() {
        return nomeTurma;
    }

    public void setNomeTurma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }

    public int getQntAulas() {
        return qntAulas;
    }

    public void setQntAulas(int qntAulas) {
        this.qntAulas = qntAulas;
    }

    


    
   
}
