/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programapernas;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class ProgramaPernas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec= new Scanner(System.in);
        System.out.print("Quantas pernas? ");
        int pernas=tec.nextInt();
        String tipo;
        System.out.print("Isto eh um(a): ");
        tipo = switch (pernas) {
            case 1 -> "Saci";
            case 2 -> "Bipede";
            case 3 -> "Tripe";
            case 4 -> "Quadrupede";
            case 6 -> "Inseto";
            case 8 -> "Aracnideo";
            default -> "ET";
        };
        System.out.println(tipo);
        
  }
    
}
