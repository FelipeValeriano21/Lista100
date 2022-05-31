//Escreva um programa que determine se um dado número N (digitado pelo usuário) é primo ou não.
package lista100;

import javax.swing.JOptionPane;

public class exe48 {
    
    public static void main (String ars[]){
 
        int n;

        n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero"));  
                    
        
        if (verificadorPrimo(n)){

            JOptionPane.showMessageDialog(null,"O numero é primo");

        }else{

            JOptionPane.showMessageDialog(null,"O numero não é primo");

        }          
            
    
    }

    static boolean verificadorPrimo(int num){
        for (int i = 2; i < num; i++) {
            if (num % i == 0){
                return false; 
            }  
        }
        return true;
    }
        
}
