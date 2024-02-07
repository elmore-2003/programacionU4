package juegos;

import juegos.Carrera;
import juegos.Coche;

import java.util.Arrays;

public class ProgramaPrincipal {
    public static void main(String[] args) {

        // Creacion de los objetos "Coche" con sus diferentes tiempos.
        Coche coche1 = new Coche("Ferrari", 2, 10, 30);
        Coche coche2 = new Coche("Mitsubishi", 2, 1, 45);
        Coche coche3 = new Coche("Toyota", 2, 3, 15);

        // Creacion de la carrera.
        Carrera carrera = new Carrera(Arrays.asList(coche1, coche2, coche3));

        // Inicio de la carrera.
        carrera.comenzarCarrera();

        // Simulación de tiempos de vuelta.
        carrera.registrarTiempoDeVuelta(coche1);
        carrera.registrarTiempoDeVuelta(coche2);
        carrera.registrarTiempoDeVuelta(coche3);

        // Finalizacion de la carrera.
        carrera.finalizarCarrera();
    }
}