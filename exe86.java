
package lista100;

//Escreva um número que leia um número em Romano e imprima o equivalente em decimal (base 10)


import java.util.Scanner;
import javax.swing.JOptionPane;


public class exe86 {
    
    public static void main(String[] args) {

        Scanner converter = new Scanner(System.in);
         int a;
        int[] vaNum = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] vaRom = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

         a  = Integer.parseInt(JOptionPane.showInputDialog("DIGITE O NUMERO PARA CONVERTER EM ROMANO"));
        
        
        while (true) {
           
            if (a == 0) break;
            System.out.printf("%-4d ", a);
            int i = 0;
            while (a > 0) {
                if (a >= vaNum[i]) {
                    
                      System.out.printf(vaRom[i] );
                    
                    a -= vaNum[i];
                } else {
                    i++;
                }
            }
        }
    }
    
    
}
