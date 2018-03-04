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
public class IdadeParaVotacaoInteligente2 {
    
    public static void main (String[] args){
        int anoatual = 2018;
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite seu ano de nascimento: ");
        int ano_nascimento = teclado.nextInt();
        
        int idade = anoatual - ano_nascimento;
        
        if(idade < 16 ){
            System.out.println("Você não pode votar.");
        }else{
            if(idade < 18 ){
                System.out.println("Você pode votar, mais não é obrigado.");
            }else{
                if(idade < 70 ){
                    System.out.println("Você é obrigado a votar.");
                }else{
                    System.out.println("Você pode votar, mas não tem obrigação pois já tem " + idade + " anos");
                }
            }   
        }
     }   
}
