package prueba.solid.models;

import java.util.List;

public class Plato extends Detalle {

    private Region region;
    private List<Ingrediente> ingredientes;
    private boolean esTipico;

    public Plato(Integer id, String nombre, String descripcion, Double precio, Region region, List<Ingrediente> ingredientes, boolean esTipico) {
        super(id, nombre, descripcion, precio);
        this.region = region;
        this.ingredientes = ingredientes;
        this.esTipico = esTipico;
    }

    public void  isTipico(){
        if(this.esTipico){
            System.out.println("Es plato tipico de " + region.getCiudad());
        }else{
            System.out.println("No es plato tipico");
        }
    }

    @Override
    public boolean compra() {
        if (consultarExistencia()){
        	System.out.println("Compra Exitosa! Disfrute su " + this.nombre);
        	for(Ingrediente ingrediente: ingredientes) {
        		ingrediente.setCantidadDisponible(ingrediente.getCantidadDisponible()-1);
        	}
            return true;
        }
        System.out.println("La compra no ha sido exitosa");
        return false;
    }

    @Override
    public boolean consultarExistencia(){
        for(Ingrediente ingrediente : ingredientes){
            if(!ingrediente.consultarExistencia()){
            	System.out.println("Ingredientes escasos");
                return false;
            }
            break;
        }

        return true;
    }
}
