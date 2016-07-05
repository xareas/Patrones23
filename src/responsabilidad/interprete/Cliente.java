package responsabilidad.interprete;

import java.util.Scanner;

/**
 * Created by xareas on 7/3/16.
 */
public class Cliente {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Por favor introduce numeros y letras::");
        String input = in.nextLine();

        Context context = new Context(input);

        IExpression tokenizer = new IntoWords();


        tokenizer.interprete(context);


    }
}
