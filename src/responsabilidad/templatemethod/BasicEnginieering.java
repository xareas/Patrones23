package responsabilidad.templatemethod;

/**
 * Creado por xareas Fecha 7/4/16.
 */
public abstract class BasicEnginieering {
    public void conducirTransporte(){
        encenderMotor();
        acelerarMotor();
        //metodos abstractos
        iniciarMarcha();
        irAlDestino();

        pararMotor();
    }

    private void encenderMotor(){
        System.out.println("Motor Encendio");
    }

    private void acelerarMotor(){
        System.out.println("Acelerando el motor");
    }

    public abstract void iniciarMarcha();
    public abstract void irAlDestino();
    private   void pararMotor(){
        System.out.println("Parar motor");
    }
}
