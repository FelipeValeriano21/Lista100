//Ler dois números inteiros e exibir o quociente e o resto da divisão inteira entre eles.
package lista100;

import javax.swing.JOptionPane;


public class exe6 {
    
    public static void main (String ars[]){
     
        double  n1,n2,r;

n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o numero 1: "));

n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o numero 2: "));
    
 
r = n1/n2;


JOptionPane.showMessageDialog(null,n1 + " / " + n2 + " = " + r);
    }
    
}
