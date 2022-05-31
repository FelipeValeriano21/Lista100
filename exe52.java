//Criar um algoritmo em PORTUGOL que imprima os N primeiros termos da série de FETUCCINE, sabendo-se que para existir esta série serão necessários pelo menos três termos.
package lista100;

import javax.swing.JOptionPane;


public class exe52 {
    
          static int [] vetor; 
    
public static void main (String ars[]){

    int r,i,n; 
    
n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de numeros da sequencia de FETUCCINE"));   

   vetor = new int [n]; 

   for (i = 1; i<=2; i++){
    vetor[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero " + i));  

}

 

for(i = 3; i<n;i++){

if (i%2==0){

vetor[i] = vetor[i-1] + vetor[i-2]; 

}else{

vetor[i] = vetor[i-1] - vetor[i-2]; 

}

}
System.out.println("A sequencia com " + n + " elementos é ");

for(i = 1; i<n;i++){

System.out.println("O numero " + i + " é " + vetor[i]);

}


    
    
}  
    
    
}
