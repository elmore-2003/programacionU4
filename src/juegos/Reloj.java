package juegos;

public class Reloj {
    private int horas;
    private int minutos;
    private int segundos;

    // Constructor que inicia el reloj a 00:00:00
    public Reloj() {
        this.horas = 0;
        this.minutos = 0;
        this.segundos = 0;
    }

    // Constructor que permite inicar el reloj con los valores horas, minutos, segundos.
    public Reloj(int horas, int minutos, int segundos) {
        if (modificarHora(horas, minutos, segundos)) {
            this.horas = horas;
            this.minutos = minutos;
            this.segundos = segundos;
        }
    }
    // Metodo para modificar la hora del reloj
    public boolean modificarHora(int horas, int minutos, int segundos) {
        if (horas >= 0 && horas <= 23 && minutos >= 0 && minutos <= 59 && segundos >= 0 && segundos <= 59) {
            this.horas = horas;
            this.minutos = minutos;
            this.segundos = segundos;
            return true;
        } else {
            return false;
        }
    }

    // Metodo para sumar un segundo al reloj
    public void sumarSegundo() {
        segundos++;
        if (segundos == 60) {
            segundos = 0;
            minutos++;
            if (minutos == 60) {
                minutos = 0;
                horas++;
                if (horas == 24) {
                    horas = 0;
                }
            }
        }
    }

    // Metodo para sumar una cantidad especifica de segundos al reloj
    public void sumarSegundos(int segundos) {
        for (int i = 0; i < segundos; i++) {
            sumarSegundo();
        }
    }

    // Hemos puesto "Override" para anular el método de una superclase.
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", horas, minutos, segundos);
    }
}
