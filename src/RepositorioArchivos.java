import java.util.ArrayList;

public class RepositorioArchivos {
    private ArrayList<Archivo> archivos = new ArrayList<>();

    public void agregarArchivo(Archivo a) { archivos.add(a); }

    public double sumarEspacioProcesado() {
        double total = 0;
        for (Archivo a : archivos) total += a.calcularEspacioProcesado();
        return total;
    }

    public String listarArchivos() {
        String res = "";
        for (Archivo a : archivos) res += a.mostrarInformacion() + "\n";
        return res;
    }
}
