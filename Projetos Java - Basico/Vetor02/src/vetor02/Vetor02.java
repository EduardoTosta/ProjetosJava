/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor02;

/**
 *
 * @author Dell
 */
public class Vetor02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String mes[]={"JAN","FEV","MAR","ABR","MAI","JUN","JUL","AGO","SET","OUT","NOV","DEZ"};
        int n[]= {31,28,31,30,31,30,30,31,30,31,30,31};
        
        for(int c=0;c<mes.length;c++){
            System.out.println("O mes de "+ mes[c] + " tera "+n[c]+" dias");  
        int soma=n[c]+n[c++];
    }
        if(n[1]<=28){
                System.out.println("este eh um ano bisexto");
        }
    
}
}
