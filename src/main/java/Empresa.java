import javax.swing.*;
import java.util.ArrayList;

public class Empresa {
	private String nombreEmpresa;
	private ArrayList<Bus> buses = new ArrayList<Bus>();

	public String getNombreEmpresa() {
		return this.nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
	public String input(String text) {
		return JOptionPane.showInputDialog(text);
	}
	public void comprarBus() {
			String marca = input("Marca: ");
			String añoFabricacion = input("Año de fabricación: ");
			String nombreBus = input("Ingrese nombre del bus ");
			Bus busNuevo = new Bus(marca, añoFabricacion,nombreBus);
			buses.add(busNuevo);
	}
	public void darDeBaja() {
		String busBuscado = input("Marca del bus: ");
		for(Bus bus : buses){
			if(bus.getNombreBus().equals(busBuscado)){
				buses.remove(busBuscado);
				String string = ("Bus eliminado");
				JOptionPane.showMessageDialog (null, bus);
				JOptionPane.showMessageDialog (null, string);
			}
		}
	}
	public void mostrarMenu() {
		Empresa empresaDeTransporte = new Empresa();
		byte opcion;
		do{
			opcion = Byte.parseByte(JOptionPane.showInputDialog(
					"Menu Principal\n"
							+"1. Agregar bus nuevo\n"
							+"2. Eliminar bus existente\n"
							+"4. Salir"));

			switch(opcion){
				case 1:
					empresaDeTransporte.comprarBus();
					break;
				case 2:
					empresaDeTransporte.darDeBaja();
					break;
				case 3:
					JOptionPane.showMessageDialog(null, ":)");
					break;

				default:
					JOptionPane.showMessageDialog(null, "Bus no encontrada");
					break;

			}


		}while(opcion!=3);

	}


	public void operation() {
		throw new UnsupportedOperationException();
	}
}