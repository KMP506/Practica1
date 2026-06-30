/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personas;
import disciplinas.Disciplina;
import java.time.LocalDate;
/**
 *
 * @author kevin
 */
public class Participante extends Persona {
    private Disciplina disciplinaInscrita;
    
    public Disciplina getDisciplinaInscrita(){
        return this.disciplinaInscrita;
    }
    
    public Participante (String id,String nombreCompleto,LocalDate fechaNacimiento,String telefono, Disciplina disciplinaInscrita){
        super (id,nombreCompleto,fechaNacimiento,telefono);
        this.disciplinaInscrita=disciplinaInscrita;
    }
    
       public String toString(){
        return "Identificacion: "+id+
                "\nNombre completo: "+nombreCompleto+
                "\nFecha nacimiento: "+fechaNacimiento+
                "\nTelefono: "+telefono+
                "\nEdad: "+calcularEdad()+"\nDisciplina: "+disciplinaInscrita;
    }
    
}
