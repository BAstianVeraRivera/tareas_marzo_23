public class Launcher {

    public static void main(String [] args) {
        inicializar();
    }
    public static void inicializar() {
        Empresa empresa = new Empresa();
        empresa.mostrarMenu();
    }

}