public class Bus {
	private String marca;
	private String añoFabricacion;
	private String nombreBus;
	public String toString(){
		return this.marca+"\n"+this.añoFabricacion+"\n"+this.nombreBus;
	}
	public Bus (String marca, String añoFabricacion, String nombreBus){
		this.marca=marca;
		this.añoFabricacion=añoFabricacion;
		this.nombreBus=nombreBus;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getAñoFabricacion() {
		return this.añoFabricacion;
	}

	public void setAñoFabricacion(String añoFabricacion) {
		this.añoFabricacion = añoFabricacion;
	}
	public String getNombreBus() {
		return nombreBus;
	}

	public void setNombreBus(String nombreBus) {
		this.nombreBus = nombreBus;
	}


}