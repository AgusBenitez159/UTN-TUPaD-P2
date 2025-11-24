
package ejercicio9uml;


public class CitaMedica {
    private String fecha;
    private String hora;
    private Paciente paciente;      // Asociación unidireccional
    private Profesional profesional; // Asociación unidireccional
    
    // Dos asociaciones unidireccionales
    public CitaMedica(String fecha, String hora, Paciente paciente, Profesional profesional) {
        this.fecha = fecha;
        this.hora = hora;
        this.paciente = paciente;      // Recibe paciente ya creado
        this.profesional = profesional; // Recibe profesional ya creado
    }
    
    public String getFecha() { return fecha; }
    public String getHora() { return hora; }
    public Paciente getPaciente() { return paciente; }
    public Profesional getProfesional() { return profesional; }
}
