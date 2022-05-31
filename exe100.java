//Verificar se uma matriz dada forma um Quadrado Latino de ordem N, no qual em cada linha e em cada coluna aparecem todos os inteiros 1,2,3, ... N, ou seja, cada linha ou coluna é permutação dos N primeiros números inteiros.

package lista100;

import javax.swing.JOptionPane;

public class exe100 {
  
   static int matriz[][]; 
public static void main (String args[]){
 
   int n,i,j,k,cont=0;
 
   n = Integer.parseInt(JOptionPane.showInputDialog("Forneça o tamanho da matriz (1 numero apenas)"));
   matriz = new int [n][n];
   for(i=0;i<n;i++){
       
         for(j=0;j<n;j++){
   
    matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Adicione o espaço " + (i+1) + "/" + (j+1)));
   
    if (matriz[i][j] >=1 &&  matriz[i][j]<=n ){
    }else{
    
        System.out.println("Quadrado não latino, pois o elemento não esta no intervalo de 1 até " + n);
        System.exit(0);
    
    }
    
         } 
    }
   
   
    for(i=0;i<n;i++){
       
         for(j=0;j<n;j++){
   
  if (i==0 && j == 0){ 
  
      
  }else{
  
  for(k=0;k<j;k++){
  
      if (matriz[i][j] == matriz[i][k]){
      
      System.out.println("Elemento "+ matriz[i][j] + " repetiu na linha" );
      
      cont++;
      
      }else{
      
      //System.out.println("Elemento não repetido" + matriz[i][j]);
      }
      
  }
  

  }
   
         }
         
        
  

  }
    
    
    /////////////////////////
    
    
    for(j=0;j<n;j++){
       
         for(i=0;i<n;i++){
   
  if (i==0 && j ==0){ 
  

       

      
  }else{
  
  for(k=0;k<i;k++){
  
      if (matriz[i][j] == matriz[k][j]){
      
      System.out.println("Elemento "+ matriz[i][j] + " repetiu na coluna" );
      
      cont++;
      
      }else{
      
      //System.out.println("Elemento não repetido" + matriz[i][j]);
      }
      
  }
  

  }
   
         }
         
        
  

  }
    
    
    /////////////////////////
    
    if (cont>0){
    
       System.out.println("Não é um quadrado latino" ); 
    
    }else{
    
       System.out.println("É um quadrado latino" ); 
    
    }
    
   
   
   
    }
     

}
