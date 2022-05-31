//Escreva um programa que leia três números e mostre o maior entre eles.
package lista100;

import javax.swing.JOptionPane;

public class exe24 {
    
    public static void main (String ars[]){    

        double maior,n1,n2,n3;
        
        n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o numero 1: "));

        n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o numero 2: "));   

        n3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o numero 3: "));


        if (n1 > n2 && n1 > n3){
            maior = n1;
        } else if (n2 > n3){
            maior = n2;
        } else {
            maior = n3;
        }

        JOptionPane.showMessageDialog(null,"O maior número é: " + maior);

    }
}