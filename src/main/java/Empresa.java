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
		String busBuscado = input("Nombre del bus: ");
		for(Bus bus : buses){
			if(bus.getNombreBus().equals(busBuscado)){
				buses.remove(bus);
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
							+"3. Mostrar todos los buses\n"
							+"4. Salir"));

			switch(opcion){
				case 1:
					empresaDeTransporte.comprarBus();
					break;
				case 2:
					empresaDeTransporte.darDeBaja();
					break;
				case 3:
					empresaDeTransporte.mostrarBuses();
					break;
				case 4:
					JOptionPane.showMessageDialog(null, ":)");
					break;

				default:
					JOptionPane.showMessageDialog(null, "Bus no encontrada");
					break;

			}


		}while(opcion!=4);

	}
	public void mostrarBuses() {
		String string="";
		for (int i=0;i<buses.size () ;i++) {
			string+="Buses "+(i+1)+"\n";
			string+="Marca: "+buses.get (i).getMarca() +" \n" ;
			string+="Año de frabricación: "+buses.get (i).getAñoFabricacion() +" \n" ;
			string+="Nombre bus: "+buses.get (i).getNombreBus() +" \n" ;
		}
		JOptionPane.showMessageDialog (null, string);
	}


	public void operation() {
		throw new UnsupportedOperationException();
	}
}