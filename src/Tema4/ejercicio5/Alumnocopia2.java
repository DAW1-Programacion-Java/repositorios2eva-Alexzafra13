package Tema4.ejercicio5;

import java.time.LocalDate;

public class Alumnocopia2 {


    /*
5. En un nuevo proyecto, copia la clase Alumno del ejercicio 1, y añade:
Daw 1º. Programación
Unidad 04. Clases y objetos Ejercicios propuestos
2
a. Dos atributos que guarden sendas notas (tipo double).
b. Crea los métodos get/set correspondientes, modifica
también el constructor para que incluya estas notas.
c. Crea un método que devuelva la media de las notas (double).
d. Crea un método que devuelva número de expediente, nombre y nota media.
     */

        private int n_expediente;
        private String nombre;
        private String apellidos;
        private LocalDate fecha_nacimiento;
        private String curso;
        private  double nota1;
        private  double nota2;


        public Alumnocopia2(int n_expediente, String nombre, String apellidos,
                      LocalDate fecha_nacimiento, String curso, double nota1, double nota2){

            this.n_expediente = n_expediente;
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.fecha_nacimiento = fecha_nacimiento;
            this.curso = curso;

        }

        public double notaMedia(double nota1, double nota2){

            return nota1 + nota2 / (2);
        }

        public int getN_expediente() {
            return n_expediente;
        }

        public void setN_expediente(int n_expediente) {
            this.n_expediente = n_expediente;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellidos() {
            return apellidos;
        }

        public void setApellidos(String apellidos) {
            this.apellidos = apellidos;
        }

        public LocalDate getFecha_nacimiento() {
            return fecha_nacimiento;
        }

        public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
            this.fecha_nacimiento = fecha_nacimiento;
        }

        public String getCurso() {
            return curso;
        }

        public void setCurso(String curso) {
            this.curso = curso;
        }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }


    @Override
        public String toString(){

            return "Nº_Expediente: " + n_expediente + "/ Nombre: " + nombre + "/ Apellidos " +
                    apellidos + "/ Fecha_Nacimiento " + fecha_nacimiento +
                    "/ Curso " + curso + "/ Nota 1: " + nota1 + "/ Nota2: " + nota2;

        }


    }


