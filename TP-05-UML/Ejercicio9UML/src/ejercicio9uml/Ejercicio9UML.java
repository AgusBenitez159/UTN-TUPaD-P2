
package ejercicio9uml;


public class Ejercicio9UML {

   
    public static void main(String[] args) {

                // Crear objetos independientes
        Paciente paciente = new Paciente("Maria Gonzalez", "OSDE");
        Profesional profesional = new Profesional("Dr. Lopez", "Cardiologia");
        
        // Cita recibe ambos objetos (asociaciones unidireccionales)
        CitaMedica cita = new CitaMedica("2024-03-25", "10:30", paciente, profesional);
        
        // Verificar relaciones
        System.out.println("Cita medica:");
        System.out.println("Paciente: " + cita.getPaciente().getNombre());
        System.out.println("Obra social: " + cita.getPaciente().getObraSocial());
        System.out.println("Profesional: " + cita.getProfesional().getNombre());
        System.out.println("Especialidad: " + cita.getProfesional().getEspecialidad());
        System.out.println("Fecha: " + cita.getFecha() + " " + cita.getHora());      
   
        
    }
    
}
