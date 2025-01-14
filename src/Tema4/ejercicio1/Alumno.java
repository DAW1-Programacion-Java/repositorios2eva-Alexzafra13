package Tema4.ejercicio1;

import java.time.LocalDate;

public class Alumno {

    /*
    1. Diseña un programa en Java que trabaje
    con una clase llamada Alumno. Serán atributos
    del alumno su número de expediente, nombre,
    apellidos, fecha de nacimiento y curso en el
    que se matricula. La clase debe incluir un
    constructor y los métodos get y set correspondientes
    y toString. Instancia varios objetos de esta clase
    y prueba los métodos creados.
     */

    private int n_expediente;
    private String nombre;
    private String apellidos;
    private LocalDate fecha_nacimiento;
    private String curso;


    public Alumno(int n_expediente, String nombre, String apellidos,
                  LocalDate fecha_nacimiento, String curso){

        this.n_expediente = n_expediente;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fecha_nacimiento = fecha_nacimiento;
        this.curso = curso;

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

    @Override
    public String toString(){

        return "Nº_Expediente: " + n_expediente + "/ Nombre: " + nombre + "/ Apellidos " +
                apellidos + "/ Fecha_Nacimiento " + fecha_nacimiento + "/ Curso " + curso;

    }
}
