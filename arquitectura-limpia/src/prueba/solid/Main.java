package prueba.solid;

import java.util.ArrayList;
import java.util.List;

import prueba.solid.models.Ingrediente;
import prueba.solid.models.Plato;
import prueba.solid.models.Region;

public class Main {
	
	public static void main(String[] args) {
		Region antioquia = new Region(1, "Antioquia");
		
		
		Ingrediente papa = new Ingrediente(1, "Papa", "paquete de papa precocida para freir", 8000D, "Bolsa", "20/04/2022", true, 20);
		Ingrediente salchicha = new Ingrediente(2, "Salchicha", "Salchicha manguera", 6000D, "Bolsa", "20/06/2022", true, 15);
		Ingrediente salsaTom = new Ingrediente(3, "Salsa de tomate", "Aderezo de tomate para sus comidas", 4000D, "Bolsa", "20/07/2022", true, 13);
		
		Ingrediente frijol = new Ingrediente(4, "Frijol", "paquete de 500g de frijoles", 5000D, "Bolsa", "20/06/2022", false, 30);
		Ingrediente arroz = new Ingrediente(5, "Arroz", "libra de arroz", 2000D, "Bolsa", "15/06/2022", false, 15);
		Ingrediente chicharron = new Ingrediente(6, "Chicharron", "Libra de chicharron", 8000D, null, null, true, 8);
		Ingrediente carne = new Ingrediente(7, "Carne molida", "Libra de carne molida", 7000D, null, null, true, 5);
		
		List<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
		ingredientes.add(papa);
		ingredientes.add(salchicha);
		ingredientes.add(salsaTom);
		
		List<Ingrediente> ingredBandPaisa =  new ArrayList<Ingrediente>();
		ingredBandPaisa.add(frijol);
		ingredBandPaisa.add(arroz);
		ingredBandPaisa.add(chicharron);
		ingredBandPaisa.add(carne);
		
//		Plato salchipapa = new Plato(1, "Salchipapa", "Alimento compuesto de papa, salchicha y salsa de tomate", 7500D, null, ingredientes, false);
//		salchipapa.compra();
//		papa.compra();
		Plato bandejaPaisa =  new Plato(2, "Bandeja Paisa", "Plato tipico antioqueño", 15000D, antioquia, ingredBandPaisa, true);
		bandejaPaisa.consultarExistencia();
		bandejaPaisa.compra();
	}
}
