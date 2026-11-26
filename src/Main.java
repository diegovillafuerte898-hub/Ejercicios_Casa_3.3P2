void main() {
    System.out.println("\n=== PRUEBAS SW-H3: ARCHIVOS ===");
    RepositorioArchivos repoArchivos = new RepositorioArchivos();
    repoArchivos.agregarArchivo(new ArchivoTexto("documentacion.txt", 2.5, 1200));
    repoArchivos.agregarArchivo(new ArchivoTexto("readme.md", 0.5, 250));
    repoArchivos.agregarArchivo(new ArchivoImagen("logo.png", 4.0, "1920x1080"));
    repoArchivos.agregarArchivo(new ArchivoImagen("banner.jpg", 3.2, "1280x720"));
    repoArchivos.agregarArchivo(new ArchivoVideo("tutorial.mp4", 150.0, 12));
    repoArchivos.agregarArchivo(new ArchivoVideo("demo.mp4", 90.0, 5));

    System.out.println("Listado de archivos:");
    System.out.println(repoArchivos.listarArchivos());
    System.out.println("Suma total de espacio procesado: " + repoArchivos.sumarEspacioProcesado() + " MB");
}
