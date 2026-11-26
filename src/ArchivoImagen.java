public class ArchivoImagen extends Archivo{
    private String resolucion;

    public ArchivoImagen(String nombre, double tamano, String resolucion) {
        super(nombre, tamano);
        this.resolucion = resolucion;
    }

    @Override
    public double calcularEspacioProcesado() {
        return getTamanoMB() * 1.2; // Overhead de procesamiento gráfico
    }

    @Override
    public String mostrarInformacion() {
        return "[Imagen] " + super.mostrarInformacion() + " - Res: " + resolucion;
    }
}
