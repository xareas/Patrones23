package responsabilidad.visitador;

/**
 * Creado por xareas Fecha 7/4/16.
 */
public class Cliente {
    public static void main(String[] args){
        Paciente paciente = new Paciente();



        paciente.applyTratamiento(new VisitadorCirujano());
        paciente.applyTratamiento(new VisitadorOncologo());
        paciente.applyTratamiento(new VisitadorOrtopedico());


    }
}
