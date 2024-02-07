package juegos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Carrera {
    private List<Coche> coches;
    private Reloj tiempoDeInicio;
    private boolean enCurso;

    public Carrera(List<Coche> coches) {
        this.coches = new ArrayList<>(coches);
        this.tiempoDeInicio = new Reloj();
        this.enCurso = false;
    }

    // Metodo para agregar un coche a la carrera.
    public void agregarCoche(Coche coche) {
        coches.add(coche);
    }

    // Metodo para iniciar la carrera.
    public void comenzarCarrera() {
        enCurso = true;
        tiempoDeInicio = new Reloj();
    }

    // Metodo para registrar el tiempo de vuleta de cada coche.
    public void registrarTiempoDeVuelta(Coche coche) {
        if (enCurso) {
            coche.getTiempoDeVuelta().sumarSegundo();
        } else {
            System.out.println("La carrera no ha comenzado.");
        }
    }

    // Metodo para finalizar la carrera y hacer la clasificacion final.
    public void finalizarCarrera() {
        enCurso = false;
        generarClasificacion();
    }

    private void generarClasificacion() {
        Collections.sort(coches, (c1, c2) -> c1.getTiempoDeVuelta().toString().compareTo(c2.getTiempoDeVuelta().toString()));
        System.out.println("Clasificación final:");
        for (int i = 0; i < coches.size(); i++) {
            System.out.println((i + 1) + ". " + coches.get(i));
        }
    }
}
