//Escrever um algoritmo e implementá-lo em linguagem C que leia duas matrizes (4x3 e 3x2), calcule e imprima a matriz que representa o produto entre as duas matrizes lidas.


package lista100;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class exe98 {
    
 static int a [][];
  static int b [][];
   static int c [][];
     Scanner entrada = new Scanner(System.in);  
    public static void main (String args[]){
    
      a = new int [4][3]; 
      b = new int [3][2]; 
      c = new int [4][2]; 
      
      int i; 
      int j;

      
      for (i=0;i<a.length;i++){
      
      for (j=0;j<a[i].length;j++){
      
  a[i][j] = Integer.parseInt(JOptionPane.showInputDialog("DIGITE O VALOR a [" + (i+1) + "] [" + (j+1) + "]" ));
          
          
          
      
      }    
      
      }
     
      
        for (i=0;i<b.length;i++){
      
      for (j=0;j<b[i].length;j++){
      
  b[i][j] = Integer.parseInt(JOptionPane.showInputDialog("DIGITE O VALOR b [" + (i+1) + "] [" + (j+1) + "]" ));
          
  
      }    
      
      }
        
   for (i=0;i<c.length;i++){
      
   for (j=0;j<c[i].length;j++){
       
for(int k=0; k<a[i].length; k++){
 c[i][j] += a[i][k] * b[k][j];
      
          
}        
          
      }
        }
      
        for (i=0;i<c.length;i++){
      
   for (j=0;j<c[i].length;j++){
       
       System.out.println(c[i][j] + "\t");
       
       
   }
   
        }
    
    }
    
}
