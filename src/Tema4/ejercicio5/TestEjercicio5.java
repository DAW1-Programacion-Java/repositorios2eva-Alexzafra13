package Tema4.ejercicio5;

import java.time.LocalDate;

public class TestEjercicio5 {
    public static void main(String[] args) {

        Alumnocopia2 alumno1 = new Alumnocopia2(665,
                "Alberto", "Lavado",
                LocalDate.of(1994,3,17),
                "Daw1",9.65,6.5);

        System.out.println(alumno1.notaMedia(alumno1.getNota1(), alumno1.getNota2()));

    }

}
