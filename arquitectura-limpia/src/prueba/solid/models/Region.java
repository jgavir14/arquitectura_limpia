package prueba.solid.models;

public class Region {

    private Integer id;
    private String ciudad;

    public Region(Integer id, String ciudad) {
        this.id = id;
        this.ciudad = ciudad;
    }

    public String getCiudad() {
        return ciudad;
    }
}
