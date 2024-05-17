public class Cancion {
    private String titulo;
    private float duracion;

    // Constructor
    public Cancion(String titulo, float duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public float getDuracion() {
        return duracion;
    }
}
