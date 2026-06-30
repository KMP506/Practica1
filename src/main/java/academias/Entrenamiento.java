/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academias;
import java.time.LocalDate;
import java.time.Period;


/**
 *
 * @author kevin
 */
public class Entrenamiento {
    
    protected LocalDate fechaEntrenamiento;
    protected int horaInicio;
    protected int horaFin;
    protected int duracion;
    protected String disciplinaPertenece;

    public LocalDate getFechaEntrenamiento() {
        return fechaEntrenamiento;
    }

    public int getHoraInicio() {
        return horaInicio;
    }

    public int getDuracion() {
        return calcularDuracion();
    }

    public String getDisciplinaPertenece() {
        return disciplinaPertenece;
    }

    public void setFechaEntrenamiento(LocalDate fechaEntrenamiento) {
        this.fechaEntrenamiento = fechaEntrenamiento;
    }

    public void setHoraInicio(int horaInicio) {
        this.horaInicio = horaInicio;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
    public int calcularDuracion(){
        return horaFin - horaInicio;
    }
    

    public void setDisciplinaPertenece(String disciplinaPertenece) {
        this.disciplinaPertenece = disciplinaPertenece;
    }

    public Entrenamiento(LocalDate fechaEntrenamiento, int horaInicio, int duracion, String disciplinaPertenece) {
        this.fechaEntrenamiento = fechaEntrenamiento;
        this.horaInicio = horaInicio;
        this.duracion = duracion;
        this.disciplinaPertenece = disciplinaPertenece;
    }
    
    
}
