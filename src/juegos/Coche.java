package juegos;

public class Coche {
    private String nombre;
    private Reloj tiempoDeVuelta;

    // Constructor que inicializa un Coche con un nombre, tiempo, vuelta
    public Coche(String nombre, int horas, int minutos, int segundos) {
        this.nombre = nombre;
        this.tiempoDeVuelta = new Reloj(horas, minutos, segundos);
    }

    public String toString() {
        return "Coche: " + nombre + ", Tiempo de vuelta: " + tiempoDeVuelta;
    }

    // Metodo para obtener el tiempo de vuelta del cada coche.
    public Reloj getTiempoDeVuelta() {
        return tiempoDeVuelta;
    }
}
