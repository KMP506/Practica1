/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personas;

import java.time.LocalDate;

/**
 *
 * @author kevin
 */
public class Responsable extends Persona{
    
    private String especialidad;
    private int añosExperiencia;

    public Responsable(String id, String nombreCompleto, LocalDate fechaNacimiento, String telefono) {
        super(id, nombreCompleto, fechaNacimiento, telefono);
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }
    
    @Override
    public String toString(){
        return "Responsable: " + super.toString() +
                "\nEspecialidad: " + especialidad +
                "\nAños de Experiencia: " + añosExperiencia;
    }
    
}
