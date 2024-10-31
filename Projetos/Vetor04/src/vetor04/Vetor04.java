/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor04;

import java.util.Arrays;

/**
 *
 * @author Dell
 */
public class Vetor04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int vet[]={3, 8, 4, 7, 5, 6};
        for(int v:vet){
            System.out.print(v);
        }
        System.out.println("");
        int p= Arrays.binarySearch(vet, 6);
        System.out.println("Encontrei o valor na posicao: " + p);        
        
    }
    
}
