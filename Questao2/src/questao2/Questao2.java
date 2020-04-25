
package questao2;

import java.util.Scanner;


public class Questao2 {
   
    public static void main(String[] args) {
    
    Pais pais = new Pais();
 
    Scanner input = new Scanner(System.in);
    
        System.out.println("Nome do país: ");
        pais.setNome(input.next());
        System.out.println("Nome da capital: ");
        pais.setCapital(input.next());
        System.out.println("Tamanho territorial: ");
        pais.setDimensao(input.next());  
        
        System.out.println("Paises da Fronteira do "+pais.getNome()+" = "+pais.getPaisesFronteira());
        
        
    }
    
}
