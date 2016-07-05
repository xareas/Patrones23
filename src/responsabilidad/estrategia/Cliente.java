package responsabilidad.estrategia;

import java.util.Scanner;

/**
 * Creado por xareas Fecha 7/4/16.
 */
public class Cliente {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        IChoice opcion;
        if(Integer.parseInt(input)==1)
          opcion = new FirstChoice();
        else
          opcion = new SecondChoice();

        Contexto contexto = new Contexto(opcion);

        contexto.ExecuteSelectOption("primero","parametros");

    }
}
