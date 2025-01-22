package Tema4.Ejercicio9;

import java.time.LocalDate;
import java.util.Scanner;

public class TestEjercicio9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String filtro;
        int menu;
        boolean salir = false;

        Gestion_Programas gestion = new Gestion_Programas();

        Programa programa1 = new Programa("Microsoft Word", 2021, Funcion.Ofimatica,
                LocalDate.of(2021, 3, 15), "Microsoft", "Comercial", 150.0);

        Programa programa2 = new Programa("MySQL", 8, Funcion.Servidor_De_Base_De_Datos,
                LocalDate.of(2020, 7, 20), "Oracle", "GPL", 0.0);







        do {

            System.out.println("""
                    1. Insertar nuevo programa (controlar elementos libres)
                    2. Mostrar lista de software
                    3. Filtrar por licencia
                    4. Filtrar por función
                    5. Eliminar el último elemento
                    6. Buscar programa por nombre y retornar programa
                    7. Salir""");

            menu = sc.nextInt();

            switch (menu){

                case 1:
                    System.out.println("Introduzca la posición: ");
                    int posicion = sc.nextInt();

                    gestion.insertarPrograma(1,programa2);
                    System.out.println();
                    break;

                case 2:

                    gestion.mostrarLista();
                    System.out.println();

                    break;

                case 3:

                    System.out.println("Inserte ");

                    break;

                case 4:


                    break;

                case 5:


                    break;

                case 6:


                    break;


                case 7:

                    salir = true;

                    break;
            }

        }while (!salir);




    }
}
