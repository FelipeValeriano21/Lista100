//Escreva um programa em C que armazene um vetor de até 30 inteiros. O programa deve
//fornecer as seguintes operações:
//a. Inserir um elemento no final do vetor
//b. Inserir um elemento em uma dada posição
//c. Remover um elemento de uma posição indicada
//d. Remover todos elementos iguais a um valor indicado
//e. Gerar um novo array sem duplicidades a partir deste array
package lista100;

import javax.swing.JOptionPane;

public class exe74 {
    
       static int [] vetor; 
       static int [] novo; 
public static void main (String args[]){
    int i,op;
    vetor = new int [30]; 
    int cont = 0;

    for (i=0;i<30;i++){
    
 vetor[i]  = Integer.parseInt(JOptionPane.showInputDialog("Informe o espaço " + (i+1) + " do vetor"));   
    
    }
    
    
vetor [29] = Integer.parseInt(JOptionPane.showInputDialog("Troque o elemento da posição V [30]"));      
   
    
op = Integer.parseInt(JOptionPane.showInputDialog("Escolha um numero do indice para mudar"));

for (i=0;i<30;i++){

    if (i==op){
    
   vetor [i] = Integer.parseInt(JOptionPane.showInputDialog("Troque o elemento da posição V [" + i + "]" ));  
    
    }


}

op = Integer.parseInt(JOptionPane.showInputDialog("Escolha um numero do indice para excluir"));

for (i=0;i<30;i++){

    if (op==i){
   
   vetor[i] = 0;    
    }


}


op = Integer.parseInt(JOptionPane.showInputDialog("Escolha um valor para remover"));

for (i=0;i<30;i++){

    if (op==vetor[i]){
   vetor[i] = 0;    
    }
}

for (i=0;i<30;i++){

if (vetor[i]!=0){
 novo = new int [30];
 
 novo [i] = vetor[i];
 
 System.out.println(novo[i]);
    
}

} 


    
    
    
}

}