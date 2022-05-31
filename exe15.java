//Num dia de sol, você deseja medir a altura de um prédio, porém, a trena não é suficientemente longa. Assumindo que seja possível medir sua sombra e a do prédio no
//chão, e que você lembre da sua altura, faça um programa para ler os dados necessários e calcular a altura do prédio.
package lista100;

import javax.swing.JOptionPane;


public class exe15 {
    
  
    public static void main (String ars[]){  
        
        double sh,ss,sp,hp;
    
sh = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite sua altura em M "));

ss = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a altura da sua sombra em M "));   

sp = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a altura da sombra do prédio em M "));

    
 hp = sp*sh/ss;
 
 JOptionPane.showMessageDialog(null,"A altura do prédio é " + hp);
}
    
}
