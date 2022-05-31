//Faça um algoritmo que transforme uma velocidade fornecida em m/s pelo usuário para Km/h. Para tal, multiplique o valor em m/s por 3,6.
package lista100;

import javax.swing.JOptionPane;

public class exe12 {
    
     public static void main (String ars[]){
        
        double v;

v = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual a velocidade em m/s "));    
    
 
v = v*3.6;


JOptionPane.showMessageDialog(null,"A velocidade em km/h é " + v);
    }
    
    
}
