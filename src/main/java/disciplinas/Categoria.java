package disciplinas;

import personas.Participante;

public class Categoria {

    protected String nombre;
    protected String categoria;
    protected int capacidadMaxima;
    protected Participante[] participantes;
    protected int cantidadParticipantes;

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public Participante[] getParticipantes() {
        return participantes;
    }
    
    public boolean agregarParticipante(Participante participante) {
        if (cantidadParticipantes >= capacidadMaxima) {
            return false;
        }
        participantes[cantidadParticipantes] = participante;
        cantidadParticipantes++;
        return true;
    }

        public Categoria(String nombre, String categoria, int capacidadMaxima) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.capacidadMaxima = capacidadMaxima;

        participantes = new Participante[capacidadMaxima];
        cantidadParticipantes = 0;
    }

    public String toString() {
        return "Nombre: " + nombre +
               "\nCategoria: " + categoria +
               "\nCapacidad Maxima: " + capacidadMaxima +
               "\nParticipantes registrados: " + cantidadParticipantes;
    }
}
