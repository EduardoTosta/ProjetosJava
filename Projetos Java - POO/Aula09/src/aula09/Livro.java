package aula09;
public class Livro implements Publicacao {
    private String titulo,autor;
    private Pessoa leitor;
    private int totalPaginas, paginaAtual;
    private boolean aberto;
    
    //Metodos Publicos
    
    public String detalhes() {
        return """
               Livro: 
                titulo: """ + titulo  
                + " \n autor: "  + autor 
                + " \n leitor: " + leitor.getNome()
                + " \n idade: "  + leitor.getIdade()
                + " \n sexo: "   + leitor.getSexo()
                + " \n aberto: " + aberto 
                + " \n total de Paginas: " + totalPaginas 
                + " \n pagina Atual: "     + paginaAtual 
                +"  \n ========================================================" ;
    }

    public Livro(String titulo, String autor, Pessoa leitor, int totalPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.leitor = leitor;
        this.totalPaginas = totalPaginas;
        this.aberto = false;
        this.paginaAtual = 0;
    }
    
    @Override
    public void abrir() {
        this.aberto= true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int p) {
        if(p>this.totalPaginas){
            this.paginaAtual = 0;
        }else{
            this.paginaAtual = p;
        }
    }

    @Override
    public void avancarPag() {
        this.paginaAtual++;
    }

    @Override
    public void voltarPag() {
        this.paginaAtual--; 
    }
    
    //Metodos especiais e Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    
    
    
    
}
