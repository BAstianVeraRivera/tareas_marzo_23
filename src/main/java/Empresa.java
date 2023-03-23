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

	public void comprarBus() {
		throw new UnsupportedOperationException();
	}

	public void venderBus() {
		throw new UnsupportedOperationException();
	}

	public void operation() {
		throw new UnsupportedOperationException();
	}
}