package examenoturno03;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private String nomeCurso;
    private int qntAulas;
    private List<Aluno> listaAlunos;
    
    //Metodo construtor
    public Turma(String nomeCurso, int qntAulas) {
        this.nomeCurso = nomeCurso;
        this.qntAulas = qntAulas;
        this.listaAlunos = new ArrayList<>();
    }
    
    //Metodos Especiais
    public void incluirAluno(Aluno al) throws Exception{
        if(getListaAlunos().size() >= 20){
            throw new Exception("Lista Cheia!\n");
        }
        for(Aluno aluno: listaAlunos){
            if(aluno.getCodAluno() == al.getCodAluno()){
                throw new Exception("Aluno ja incluido!");
            }
        }
        System.out.println("Aluno inlcuido com sucesso!");
        listaAlunos.add(al);
    }
     
     public void listarAlunos() {
         System.out.println("====================================\n" +
                            "Curso: " + this.nomeCurso + "\n"+
                            "Total de Aulas: " + this.qntAulas + "\n");
        for (Aluno aluno : listaAlunos) {
            double frequencia = ((double) (qntAulas - aluno.getQntFaltas()) / qntAulas) * 100;
            System.out.println(
                    "Nome: " + aluno.getNomeAluno() + "\n" +
                    "Codigo: " + aluno.getCodAluno() + "\n" +
                    "Total de Faltas: " + aluno.getQntFaltas() + "\n" +
                    "Nota Final: " + aluno.getNotaFinal() + "\n" +
                    "Frequencia: " + String.format("%.2f", frequencia) + "%\n");
        }
    }
    
     public void listarAprovados() throws Exception{
         boolean aprovado = false;
         System.out.println("====================================\n" +
                            "Curso: " + this.nomeCurso + "\n"+
                            "Total de Aulas: " + this.qntAulas + "\n");
         for(Aluno aluno: listaAlunos){
             double frequencia = ((double) (qntAulas - aluno.getQntFaltas()) / qntAulas) * 100;
             if(frequencia >= 65.0 && aluno.getNotaFinal()>=6){
                 aprovado = true;
                  System.out.println(
                    "Nome: " + aluno.getNomeAluno() + "\n" +
                    "Codigo: " + aluno.getCodAluno() + "\n" +
                    "Total de Faltas: " + aluno.getQntFaltas() + "\n" +
                    "Nota Final: " + aluno.getNotaFinal() + "\n" +
                    "Frequencia: " + String.format("%.2f", frequencia) + "%\n");
             }
        }
         if(!aprovado){
             throw new Exception("Nenhum aluno aprovado!");
         }
     }
    
    //Getters e Setters
    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public int getQntAulas() {
        return qntAulas;
    }

    public void setQntAulas(int qntAulas) {
        this.qntAulas = qntAulas;
    }

    public List<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public void setListaAlunos(List<Aluno> listaAlunos) {
        this.listaAlunos = listaAlunos;
    }
    
    
    
    
    
}   
