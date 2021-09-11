package prueba.solid.models;

public class Ingrediente extends Detalle{

    private String tipoEmpaque;
    private String fechaVencimiento;
    private boolean refrigeracion;
    private Integer cantidadDisponible;

	public Ingrediente(Integer id, String nombre, String descripcion, Double precio, String tipoEmpaque, String fechaVencimiento, boolean refrigeracion, Integer cantidadDisponible) {
        super(id, nombre, descripcion, precio);
        this.tipoEmpaque = tipoEmpaque;
        this.fechaVencimiento = fechaVencimiento;
        this.refrigeracion = refrigeracion;
        this.cantidadDisponible = cantidadDisponible;
    }

    public void verFechaVencimiento(){
        System.out.println("Vencimiento: " + this.fechaVencimiento);
    }
    
    public void verCantidadDisponible() {
    	System.out.println("Disponible: " + this.cantidadDisponible);
    }
    

    public Integer getCantidadDisponible() {
		return cantidadDisponible;
	}

	public void setCantidadDisponible(Integer cantidadDisponible) {
		this.cantidadDisponible = cantidadDisponible;
	}

	@Override
    public boolean compra(){
        if(consultarExistencia()){
        	this.cantidadDisponible--;
        	System.out.println("Compra de ingrediente Exitosa!");
            return true;
        }
        return false;
    }

    @Override
    public boolean consultarExistencia(){
        if(this.cantidadDisponible != null && this.cantidadDisponible > 0){
            return true;
        }
        return false;
    }
}
