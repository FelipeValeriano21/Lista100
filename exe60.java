//A famosa conjectura de Goldbach diz que todo inteiro par maior que 2 é soma de dois números primos. Testes foram feitos, mas ainda não se achou um contra-exemplo.
//Escreva um programa mostrando que a afirmação é verdadeira para todo número par entre 500 e 1000. O programa deve imprimir o número par e os dois primos que somados dão o número par.
package lista100;

import java.util.Scanner;


public class exe60 {

    
public static void main(String ars[]){
    
        int maior = 0,  res = 0 , primo=0;

       for (int a=500; a<=1000; a++){
           
         if(a%2==0){  
 System.out.println("Primos até " + a );
        for (int i=2; i<=a; i++) {
            for (int j=1; j<=i; j++) {
                if (i % j == 0) {
                               
        maior = a-i;
                          
                    primo++;
                }
            }
            if (primo == 2) {
                System.out.println("O número " + i + " + " + maior + "=" + a);
            }
            primo = 0;
        }

       
    }
}
 
    
}    

}     


