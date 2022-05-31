//Escreva um algoritmo que leia o número de litros vendidos e o tipo de combustível (codificado da seguinte forma: A-álcool, G-gasolina), calcule e imprima o valor a ser
//pago pelo cliente sabendo-se que o preço do litro da gasolina é R$ 2,70 e o preço do litro do álcool é R$ 1,90.
package lista100;

import javax.swing.JOptionPane;


public class exe30 {
    

  public static void main(String args[]){      
         
    String op; 
    double l,p; 

    l = Double.parseDouble(JOptionPane.showInputDialog(null, "Quantidade de litros"));
    op =  JOptionPane.showInputDialog(null, "Combustivel: A - ALCOOL | G - GASOLINA ");     


    if(op.equals("A")){
      
      p = 1.9*l;  

      JOptionPane.showMessageDialog(null,"O total a pagar por " + l + " litros de alcool é R$" + p);

    }else if(op.equals("G")){
      
      p = 2.7*l;     

      JOptionPane.showMessageDialog(null,"O total a pagar por " + l + " litros de gasolina é R$" + p);


    }else{

      JOptionPane.showMessageDialog(null,"Opção inexistente, programa acabado");

    }

  }
}