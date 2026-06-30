/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personas;
import java.time.LocalDate;
import java.time.Period;
/**
 *
 * @author kevin
 */
public class Persona {
    protected String id;
    protected String nombreCompleto;
    protected LocalDate fechaNacimiento;
    protected String telefono;
    
    public String getId(){
        return this.id;
    }
    
    public String getNombreCompleto(){
        return this.nombreCompleto;
    }
    
    public LocalDate getFechaNacimiento(){
        return this.fechaNacimiento;
    }
    
    public String getTelefono(){
        return this.telefono;
    }
    
    public void setTelefono(String telefono){
        this.telefono=telefono;
    }
    
    public int calcularEdad(){
        if (fechaNacimiento==null)return 0;
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }
    
    public Persona(String id,String nombreCompleto,LocalDate fechaNacimiento,String telefono){
        this.id=id;
        this.nombreCompleto=nombreCompleto;
        this.fechaNacimiento=fechaNacimiento;
        this.telefono=telefono;
    }
    
    public String toString(){
        return "Identificacion: "+id+
                "\nNombre completo: "+nombreCompleto+
                "\nFecha nacimiento: "+fechaNacimiento+
                "\nTelefono: "+telefono+ "\nEdad: "+calcularEdad();
    }
    
}
