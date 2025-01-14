package Tema4.ejercicio2;

public class Empleado {

    /*
    2. Diseña una clase llamada Empleado con las características
    que se citan a continuación. Prueba sus métodos.
    a. Atributos. Id, nombre, apellidos, salario mensual.
    b. Métodos: constructor, getters y setters.
    c. Añade los métodos:
       i. getNombreCompleto. Devuelve el nombre del empleado con la forma: Apellidos, Nombre.
       ii. getSalarioAnual. Este se obtiene multiplicando por doce el salario mensual.
       iii. incrementaSalario (int porcentaje). Incrementa el salario en el porcentaje indicado.
       iv. toString.
    d. Crea dos empleados y prueba los métodos programados,
    incrementa su salario y obtén el salario anual.
     */

    private int id;
    private String nombre;
    private String apellidos;
    private double salariomensual;



    public Empleado(int id, String nombre, String apellidos, double salariomensual){

        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.salariomensual = salariomensual;

    }

    public String nombreCompleto() {

        return nombre + " " + apellidos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public double getSalariomensual() {
        return salariomensual;
    }

    public void setSalariomensual(double salariomensual) {
        this.salariomensual = salariomensual;
    }

    @Override
    public String toString() {
        return "Id: " + id + "/ Nombre: " + nombre + "/ Apellidos: " + apellidos +
                "/ Salario_Mensual: " + salariomensual;
    }


}
