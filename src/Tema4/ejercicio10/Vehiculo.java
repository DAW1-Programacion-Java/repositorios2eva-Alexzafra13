package Tema4.ejercicio10;

import java.time.LocalDateTime;
import java.util.Objects;

public class Vehiculo {

    /*
    10. Diseña un programa Java que gestione un Parking con capacidad para 200 vehículos.

a. Cada vez que entra un vehículo en el parking guardamos su
matrícula, el instante en que entró en milisegundos y decrementamos
el contador de plazas disponibles.
b. Cuando un vehículo deja el parking libera una plaza.
c. El precio del segundo es de 0,015 euros. Antes de salir,
el propietario debe pagar el importe en función del tiempo que el
vehículo estuvo en el parking.
     */

    private String matricula;
    private LocalDateTime hora_entrada;

    public Vehiculo(String matricula){

        this.matricula = matricula;
        this.hora_entrada = LocalDateTime.now();

    }

    public String getMatricula() {
        return matricula;
    }

    public LocalDateTime getHora_entrada() {
        return hora_entrada;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "matricula='" + matricula + '\'' +
                ", hora_entrada=" + hora_entrada +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Vehiculo vehiculo = (Vehiculo) o;
        return Objects.equals(this.matricula, vehiculo.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(matricula);
    }
}
