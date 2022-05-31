//Escreva um programa que leia três números e mostre o maior entre eles.
package lista100;

import javax.swing.JOptionPane;

public class exe24 {
    
 public static void main (String ars[]){    
 
            double maior,n1,n2,n3;
            int op;
n1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o numero1: "));

n2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o numero2: "));   

n3 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o numero3: "));


maior = n1; 

if (n2>n1){

    maior=n2; 
    
if (n3>n2){
    
      maior=n3; 
    
}
}else if (n3>n1){

 maior=n3; 

}

JOptionPane.showMessageDialog(null,"O maior é o " + maior);

 }
}