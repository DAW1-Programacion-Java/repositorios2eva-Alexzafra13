package Tema4.ejercicio10;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Parking {

    private ArrayList<Vehiculo> listavehiculos = new ArrayList<>();
    private int plazas_libres;

    public Parking(int plazas_libres){

        this.plazas_libres = plazas_libres;


    }

    public boolean entradaVehiculos(Vehiculo vehiculo){

        if( plazas_libres > 0){

            listavehiculos.add(vehiculo);

            plazas_libres--;

            return true;
        }else {

            System.out.println("No quedan plazas libres");

            return false;
        }
    }

    // Sobrecarga del metodo entradaVehiculos
    public boolean entradaVehiculo(String matricula){
        return entradaVehiculos(new Vehiculo(matricula));
    }

    public boolean salidaVehiculo(Vehiculo vehiculo){

        if (listavehiculos.contains(vehiculo)){
            listavehiculos.remove(vehiculo);
            plazas_libres++;
            return true;
        }else {
            System.out.println("El vehiculo no esta en el parking");

            return false;
        }

    }

    // Otra sobrecarga del metodo salidaVehiculo
    public boolean salidaVehiculo(String matricula){
        return salidaVehiculo(new Vehiculo(matricula));

    }

    public void mostrarVehiculos(){

        for(Vehiculo vehiculo : listavehiculos){

            System.out.println(vehiculo);
        }

    }

    public void mostrarPlazasLibres(){

        System.out.println("Plazas libres: " + plazas_libres);
    }

    public void calculoPrecio(Vehiculo vehiculo){

        long tiempo = vehiculo.getHora_entrada().until(LocalDateTime.now(), ChronoUnit.SECONDS);

    }

}
