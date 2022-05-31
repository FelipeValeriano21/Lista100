//Escreva um programa, que leia o número de passes tentados, o número de passes completos, o número de jardas passadas, o número de passes para touchdown e o número
//de passes interceptados e informe o QB Rating do quarterback.
package lista100;

import javax.swing.JOptionPane;

public class exe31 {

public static void main (String args[]){

double p,npc, njp, npt,nppt, npi, qbr,p1,p2,p3,p4; 

npc = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o número de passes completos"));
npt = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o número de passes tenatdos"));
njp = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o o número de jardas passadas"));   
nppt = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o número de passes para touchdown"));
npi = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o número de passes interceptados"));

p1 = ((npc/npt)-0.3)/0.2; 


if (p1>2.375){

p1 = 2.375; 

}else if (p1<0) {

    p1 = 0;

}



p2 = ((njp/npt)-3)/4;


if (p2>2.375){

p2 = 2.375; 

}else if (p1<0) {

    p2 = 0;

}

p3 = (nppt/npt)/0.05;


if (p3>2.375){

p3 = 2.375; 

}else if (p1<0) {

    p3 = 0;

}

p4 = ((npi/npt)-0.095)/0.04;

if (p4>2.375){

p4 = 2.375; 

}else if (p1<0) {

    p4 = 0;

}

qbr = ((p1+p2+p3+p4)*100)/6;

JOptionPane.showMessageDialog(null,"O QB Rating do quarterback é " + qbr);
}

    
}
