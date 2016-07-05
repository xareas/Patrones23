package responsabilidad.Iterador;

/**
 * Created by xareas on 7/3/16.
 */
public class Cliente {


    public static void main(String[] args) {
        ISubject artistas = new Arts();

        IIterator iterator = artistas.createIterator();
        while (!iterator.isDone()){
            System.out.println("El elemento acutual es::" + iterator.currentItem());
            iterator.next();
        }

    }


}
