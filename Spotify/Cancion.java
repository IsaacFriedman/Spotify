/**
 * La clase `Cancion` representa una canción en la aplicación Spotify.
 * Contiene información sobre el título y la duración de la canción.
 */
public class Cancion {
    private String titulo;
    private String duracion;

    /**
     * Construye un nuevo objeto `Cancion` con el título y la duración dados.
     *
     * @param titulo   el título de la canción
     * @param duracion la duración de la canción
     */
    public Cancion(String titulo, String duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
    }

    /**
     * Devuelve el título de la canción.
     *
     * @return el título de la canción
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Devuelve la duración de la canción.
     */
    public String getDuracion() {
        return duracion;
    }
}