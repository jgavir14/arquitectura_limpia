package prueba.solid.models;

import prueba.solid.service.IServiceTransaccion;

public class Detalle implements IServiceTransaccion {

    protected Integer id;
    protected String nombre;
    protected String descripcion;
    protected Double precio;

    public Detalle(){}

    public Detalle(Integer id, String nombre, String descripcion, Double precio) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public void verDescripcion(){
        System.out.println(this.descripcion);
    }

    public void verPrecio(){
        System.out.println("$" + this.precio);
    }

    public void verDetalle(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Descripcion: " + this.descripcion);
        System.out.println("Precio: $" + this.precio);
    }

    @Override
    public boolean compra() {
        return false;
    }

    @Override
    public boolean consultarExistencia() {
        return false;
    }
}
