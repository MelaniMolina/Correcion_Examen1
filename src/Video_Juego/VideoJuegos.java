package Video_Juego;

public class VideoJuegos {//La clase abuelo  la denominaremos VideoJuegos
    //Atributos de la clase abuelo
    private String titulo;
    private String consola;
    private int cantJugadores;
    private String categoria;

    //Generamos el constructor
    public VideoJuegos(String titulo, String consola, int cantJugadores, String categoria) {
        this.titulo = titulo;
        this.consola = consola;
        this.cantJugadores = cantJugadores;
        this.categoria = categoria;
    }
    //Solo vamos a generar en este caso los metodos get ya que necesitamos que nos retorne datos

    public String getTitulo() {
        return titulo;
    }

    public String getConsola() {
        return consola;
    }

    public int getCantJugadores() {
        return cantJugadores;
    }

    public String getCategoria() {
        return categoria;
    }
}
