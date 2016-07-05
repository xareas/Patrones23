package responsabilidad.templatemethod;

/**
 * Creado por xareas Fecha 7/4/16.
 */
public class Cliente {

    public static void main(String[] args){

        BasicEnginieering carro = new Carro();
        carro.conducirTransporte();

        BasicEnginieering moto = new Moto();
        moto.conducirTransporte();
    }
}
