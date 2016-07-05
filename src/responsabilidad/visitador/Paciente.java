package responsabilidad.visitador;

/**
 * Creado por xareas Fecha 7/4/16.
 */
public class Paciente implements IOriginalInterface {

    private String tratamiento;

    public Paciente() {
        tratamiento="";
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }


    @Override
    public void applyTratamiento(ITratamiento visitor) {
        visitor.visit(this);
        System.out.println(tratamiento);
    }
}
