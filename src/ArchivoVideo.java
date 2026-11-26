public class ArchivoVideo extends Archivo{
    private int duracionMinutos;

    public ArchivoVideo(String nombre, double tamano, int duracion) {
        super(nombre, tamano);
        this.duracionMinutos = duracion;
    }

    @Override
    public double calcularEspacioProcesado() {
        return getTamanoMB() * 2.0; // Renderizado de video
    }

    @Override
    public String mostrarInformacion() {
        return "[Video] " + super.mostrarInformacion() + " - Duración: " + duracionMinutos + " min";
    }
}
