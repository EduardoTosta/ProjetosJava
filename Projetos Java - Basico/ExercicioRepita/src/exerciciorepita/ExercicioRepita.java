/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciorepita;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int s = 0; // soma dos valores
        int n; // valor informado pelo usuário
        int tv = 0; // total de valores
        int tp = 0; // total de pares
        int ti = 0; // total de ímpares
        int acem = 0; // total de números acima de 100
        float mv;// media da soma dos valores digitados
        
        do{
            
            n= Integer.parseInt(JOptionPane.showInputDialog(null,"<html>Informe um numero: <br><em>(valor 0 interrompe o programa)</em></br></html>"));
            
            s+=n; //soma dos valores
            
            if(n!=0){
                tv++;
            }//Total de valores
            
           if(n%2==0){
               tp++;
           }else{
               ti++;
           }// total de pares e impares
           
           if(n>=100){
               acem++;
           }//total de numeros acima de 100
                     
        }while(n!=0);
        
         mv=s/tv;//media dos valores
        
        JOptionPane.showMessageDialog(null, 
                 "<html>Resultado final <br>----------"+
                        "<br> " +
                        "Somatorio vale: "+ s +"<html>" +
                                "<br>"+
                                "Total de valores: " + tv + "<html>"+
                                        "<br>"+
                                        "Total de Pares: " + tp + "<html>" +
                                                "<br>"+
                                                "Total de Impares: " + ti + "<html>" +
                                                        "<br>"+
                                                        "Acima de 100: " + acem + "<html>" +
                                                                "<br>"+
                                                                "Media dos valores: " + mv + "<html>");
}
}