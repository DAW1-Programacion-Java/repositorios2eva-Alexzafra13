package Tema4.Ejercicio9;

import java.time.LocalDate;

public class TestEjercicio9 {

    public static void main(String[] args) {

        Gestion_Programas gestion = new Gestion_Programas();

        Programa programa1 = new Programa("Microsoft Word", 2021, Funcion.Ofimatica,
                LocalDate.of(2021, 3, 15), "Microsoft", "Comercial", 150.0);

        Programa programa2 = new Programa("MySQL", 8, Funcion.Servidor_De_Base_De_Datos,
                LocalDate.of(2020, 7, 20), "Oracle", "GPL", 0.0);



        gestion.insertarPrograma(1,programa2);

        gestion.mostrarLista();




    }
}
