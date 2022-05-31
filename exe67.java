//Faça um programa em C que leia dois vetores de 10 posições de inteiros e copie o maior valor dos dois em cada posição em um terceiro vetor. Em seguida, imprima este terceiro vetor.
package lista100;

import javax.swing.JOptionPane;


public class exe67 {
    
    
        static int [] a; 
        static int [] b; 
        static int [] total; 
    
public static void main (String ars[]){
    
  criarVetor();
        mostrarVetor(); 
          
    
    
    
    
} 


public static void criarVetor(){
         
      a = new int [10]; 
      b = new int [10]; 
      total = new int [10]; 
      
      
    for(int i = 0; i<a.length; i++){  
  a[i] = Integer.parseInt(JOptionPane.showInputDialog("DIGITE O NUMERO " + i + " do vetor a"));   

    }  
    
         
    for(int i = 0; i<b.length; i++){  
      
  b[i]  = Integer.parseInt(JOptionPane.showInputDialog("DIGITE O NUMERO " + i + " do vetor b"));
      
   
    }
      
}
 
public static void  mostrarVetor() {
   
   for(int i = 0; i<total.length; i++){  
 
       if(a[i]>=b[i]){

total[i] = a[i];

}else{

total[i] = b[i];
  
}        
 JOptionPane.showMessageDialog(null, total[i] );   
   
   }  
       

 
 
    
    
    
    
    
}
    
    
    
}
