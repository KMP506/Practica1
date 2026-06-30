/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academias;

import personas.Participante;

/**
 *
 * @author kevin
 */
public class Asistencia {
    private Participante participante; 
    private Entrenamiento entrenamiento;
    private boolean asistio;

    public Asistencia(Participante participante, Entrenamiento entrenamiento, boolean asistio) {
        this.participante = participante;
        this.entrenamiento = entrenamiento;
        this.asistio = asistio;
    }

    public Participante getParticipante() {
        return participante;
    }

    public Entrenamiento getEntrenamiento() {
        return entrenamiento;
    }

    public void setParticipante(Participante participante) {
        this.participante = participante;
    }

    public void setEntrenamiento(Entrenamiento entrenamiento) {
        this.entrenamiento = entrenamiento;
    }

    public void setAsistio(boolean asistio) {
        this.asistio = asistio;
    }
    
    
    
}
