package GrupoMusicales;

public class GruposMusicales {//La clase abuelo  la denominaremos GruposMusicales
    //Atributos de la clase abuelo
    private String nombre_grupo;
    private String tipo_musica;
    private String nom_integrantes;
    private String Albunes;
    //Generamos el constructor
    public GruposMusicales(String nombre_grupo, String tipo_musica, String nom_integrantes, String albunes) {
        this.nombre_grupo = nombre_grupo;
        this.tipo_musica = tipo_musica;
        this.nom_integrantes = nom_integrantes;
        this.Albunes = albunes;
    }
    //Solo vamos a generar en este caso los metodos get ya que necesitamos que nos retorne datos

    public String getNombre_grupo() {
        return nombre_grupo;
    }

    public String getTipo_musica() {
        return tipo_musica;
    }

    public String getNom_integrantes() {
        return nom_integrantes;
    }

    public String getAlbunes() {
        return Albunes;
    }
}
