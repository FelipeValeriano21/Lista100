//Ler dois números inteiros e exibir o quociente e o resto da divisão inteira entre eles.
package lista100;

import javax.swing.JOptionPane;


public class exe6 {
    
    public static void main (String ars[]){
     
        int  n1, n2, quociente, resto;

        n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero 1: "));

        n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero 2: "));
            
        
        quociente = n1 / n2;
        resto = n1 % n2;


        JOptionPane.showMessageDialog(null,"O resultado da divisão é: " + quociente + "\nO resto da divisão é: " + resto);
    }
    
}
