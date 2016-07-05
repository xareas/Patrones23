package responsabilidad.observar;

/**
 * Creado por xareas Fecha 7/4/16.
 * en C# referirse a las interfaces Iobservable<T> y Iobserver<t>, tambien revisar
 * observablecollection
 */
public class Cliente {
    public static void main(String[] args){
        Preferencias pref = new Preferencias();
        Ventana ventana = new Ventana(pref);

        //notificar a ventana si cambian las preferencias
      //  pref.addObserver(ventana);

        pref.setColor("blue");

        System.out.println("Preferencias Color:: "+ pref.getColor()+ " Ventana Color:: "+ ventana.getColor());
    }
}
