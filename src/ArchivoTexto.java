public class ArchivoTexto extends Archivo{
    private int cantidadPalabras;

    public ArchivoTexto(String nombre, double tamano, int palabras) {
        super(nombre, tamano);
        this.cantidadPalabras = palabras;
    }

    @Override
    public double calcularEspacioProcesado() {
        return getTamanoMB() * 0.8; // Compresión de texto
    }

    @Override
    public String mostrarInformacion() {
        return "[Texto] " + super.mostrarInformacion() + " - Palabras: " + cantidadPalabras;
    }
}
