/*
*   Aluno : Jhonatan Feitosa do Espirito Santo
*   Disciplina : Laboratorio de Programação 2
*   Professor : Daniel Gondim
*
*/
package lab01;

import java.util.Scanner;

/**
 *
 * @author jhonatan
 */
public class IdadeParaVotacaoInteligente {
  
    public static void main (String[] args){
       Scanner teclado = new Scanner(System.in);
       System.out.print("Digite a sua idade: ");
       int ida = teclado.nextInt();
       
       if(ida > 15){
           System.out.printf("Sua idade é %d anos e você pode votar.", ida);
       }
       else{
           System.out.println("Você não pode votar.");
       }
   }
}
