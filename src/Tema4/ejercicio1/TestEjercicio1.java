package Tema4.ejercicio1;

import java.time.LocalDate;

public class TestEjercicio1 {
    public static void main(String[] args) {


    Alumno alumno1 = new Alumno(543, "Alberto","Suárez" ,
            LocalDate.of(1996,5,16), "Daw1");

    Alumno alumno2 = new Alumno(254,"Mario", "Gordillo",
            LocalDate.of(1998,3,25),"Daw2");


        System.out.println(alumno2);

        System.out.println(alumno1.getNombre());



    }
}
