/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programaidade;
import java.util.Scanner;
/**
 *
 * @author Dell
 */
public class ProgramaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner (System.in);
        System.out.println("Em que ano voce nasceu? ");
        int nasc= teclado.nextInt();
        int idade = 2024 - nasc;
        System.out.println("Voce tem "+idade+" anos!");
        if (idade>=18){
            System.out.println("Voce eh maior de idade!");
        }else{
            System.out.println("Voce ainda eh menor de idade :( ");
        }
    }
}
