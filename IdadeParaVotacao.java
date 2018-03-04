/*
*   Aluno : Jhonatan Feitosa do Espirito Santo
*   Disciplina : Laboratorio de Programação 2
*   Professor : Daniel Gondim
*
*/
package lab01;

/**
 *
 * @author jhonatan
 */
public class IdadeParaVotacao {
    
    public static void main (String[] args){
        String nome = "jhonatan";
        int idade = 12;
        if(idade >15){
            System.out.printf("%s tem %d anos e pode exercer sua cidadania \n", nome, idade);
        }else{
            System.out.println(nome + " você não pode votar!");
        }
    }
}
