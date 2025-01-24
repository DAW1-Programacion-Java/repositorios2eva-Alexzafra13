package Tema4.Ejercicio9;

import java.time.LocalDate;
import java.util.ArrayList;

public class Programa {

    /*
    9. Diseña una aplicación Java que trabaje con una clase llamada
     Programa (Software). Cada programa tendrá como atributos
     su nombre, versión, función (sistema operativo, servidor de bases de datos, ofimática, …),
      año de lanzamiento, empresa que lo desarrolla, tipo de licencia y precio.
Diseña también una clase llamada Gestión_Programas que contendrá:
- un array de 25 elementos de la clase Programa
- métodos que sirvan para programar las funciones del siguiente menú:
Menú
1. Insertar nuevo programa (controlar elementos libres)
2. Mostrar lista de software
3. Filtrar por licencia
4. Filtrar por función
5. Eliminar el último elemento
6. Buscar programa por nombre y retornar programa
7. Salir
     */

    private String nombre;
    private int version;
    private Funcion funcion;
    private LocalDate ano_lanzamiento;
    private String empresa;
    private String licencia;
    private double precio;


    public Programa(String nombre, int version, Funcion funcion,
                    LocalDate ano_lanzamiento, String empresa, String licencia, double precio){

        this.nombre = nombre;
        this.version = version;
        this.funcion = funcion;
        this.ano_lanzamiento = ano_lanzamiento;
        this.empresa = empresa;
        this.licencia = licencia;
        this.precio = precio;
    }


    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Funcion getFuncion() {
        return funcion;
    }

    public void setFuncion(Funcion funcion) {
        this.funcion = funcion;
    }

    public LocalDate getAno_lanzamiento() {
        return ano_lanzamiento;
    }

    public void setAno_lanzamiento(LocalDate ano_lanzamiento) {
        this.ano_lanzamiento = ano_lanzamiento;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Programa{" +
                "nombre='" + nombre + '\'' +
                ", version=" + version +
                ", funcion=" + funcion +
                ", ano_lanzamiento=" + ano_lanzamiento +
                ", empresa='" + empresa + '\'' +
                ", licencia='" + licencia + '\'' +
                ", precio=" + precio +
                '}';
    }
}
