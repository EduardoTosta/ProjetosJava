package aula09;
public class Aula09 {
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa[] p = new Pessoa [3];
        Livro[] l = new Livro[2];
        
        p[0] = new Pessoa("Pedro","M", 22);
        p[1] = new Pessoa("Maria","F",25);
        
        l[0] = new Livro("Harry Potter e a Pedra FIlosofal", "J.K Rowlling",p[0],175 );
        l[1] = new Livro("Senhor dos Aneis", "J.R.R Tolkien",p[1], 527);
        
        l[0].abrir();
        l[0].folhear(85);
        l[0].avancarPag();
        System.out.println(l[0].detalhes());
    }
    
}
