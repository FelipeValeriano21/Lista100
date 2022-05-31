
package lista100;

import javax.swing.JOptionPane;

public class exe84 {
   //Escreva um programa em C que verifique se uma string normalizada é palíndrome (os mesmos caracteres quando lida da direita para a esquerda). 
    
    public static void main(String ars[]){
    
    String p,pi;
    int cont; 
    
   p = JOptionPane.showInputDialog(null,"Digite uma palavra");
   
     cont=p.length(); 
     
     pi = new StringBuffer(p).reverse().toString();
     
     if (p.equals(pi)) {
    JOptionPane.showMessageDialog(null,"A palavra " + p + " é Palindrome");
    } else {
    JOptionPane.showMessageDialog(null,"A palavra " + p + " não é Palindrome");
    }
    
        
    
    }
    
}
