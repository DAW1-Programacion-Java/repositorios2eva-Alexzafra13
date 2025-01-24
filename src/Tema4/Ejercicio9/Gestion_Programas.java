package Tema4.Ejercicio9;

import java.util.ArrayList;

public class Gestion_Programas {

    private ArrayList<Programa> lista_programas;

    public Gestion_Programas(){

        lista_programas = new ArrayList<>(25);


        for (int i = 0; i < 25; i++) {
            lista_programas.add(null);
        }

    }
    public void insertarPrograma(int posicion, Programa programa){

        if (posicion < 0 || posicion >= lista_programas.size()){

            System.out.println("Error: La posición " + posicion + " está fuera del rango.");
        }

        if (lista_programas.get(posicion) == null){

            lista_programas.set(posicion,programa);
            System.out.println("El programa " + programa +
                    " se ha almacenado en la posición " + posicion);


        }else {

            System.out.println("Error, la posición " + posicion + " ya esta ocupada por " +
                    lista_programas.get(posicion).getNombre());
        }


    }

    public void mostrarLista(){
        int posicion = 0;

        for (Programa lis : lista_programas){

            if (lis != null){

                System.out.println("Posición" + posicion + " Programa "+ lis);

            }else {

                System.out.println("Posición " + posicion +  " " +null);
            }


            posicion++;

        }

    }

    public void filtrarLicencia(Programa programa, String filtro){





    }



}
