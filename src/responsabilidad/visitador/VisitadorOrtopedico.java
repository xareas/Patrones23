package responsabilidad.visitador;

/**
 * Creado por xareas Fecha 7/4/16.
 */
public class VisitadorOrtopedico implements ITratamiento {


    @Override
    public void visit(Paciente paciente) {
        paciente.setTratamiento("Sobada de Huesos");
    }
}
