
package lista100;

import javax.swing.JOptionPane;


public class exe61 {
    
     static int [] a; 
    
public static void main (String ars[]){
        
    
    criarVetor();
    mostrarVetor();    
    
    
    
    
}   

//Faça um programa em C que crie e inicialize um array de 20 posições de inteiros com 0 para cada elemento. Imprima o vetor em seguida, indicando a posição e o valor na posição (um por linha).
public static void criarVetor(){

  a = new int [20]; 
  
 for(int i = 0; i<a.length; i++){  
  a[i] = Integer.parseInt(JOptionPane.showInputDialog("DIGITE O NUMERO " + i + " do vetor"));   

    }   
  

}


public static void mostrarVetor(){
    
 for(int i = 0; i<a.length; i++){  
 
System.out.println("Posição " + i + " = " + a[i] );   
   
   }  
      


}



   

 
    
    
}
