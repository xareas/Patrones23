package responsabilidad.Iterador;

/**
 * Created by xareas on 7/3/16.
 */
public interface IIterator {
    /**
     * ir al primer elemento
     */
    public void first();

    /**
     * Retornar el siguiente elemento de la lista
     * @return
     */
    public String next();

    /**
     * determina si es el final de la lista
     * @return devuelve verdadero en caso que sea el final, y falso en caso contrario
     */
    public boolean isDone();

    /**
     * Elemento actual de la lista
     * @return regresa el elemento actual de la lista
     */
    public String currentItem();
}
