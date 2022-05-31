//Escreva um programa que determine se um dado número N (digitado pelo usuário) é primo ou não.
package lista100;

import javax.swing.JOptionPane;

public class exe48 {
    
        public static void main (String ars[]){
 
int i,n,cont = 0;

n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero"));  
            
for(i = 1; i<=n;i++){

    if (n%i==0){
    
    cont++;
    }

} if (cont==2){

JOptionPane.showMessageDialog(null,"O numero é primo");

}else{

JOptionPane.showMessageDialog(null,"O numero não é primo");

}          
            
    
}
        
}
