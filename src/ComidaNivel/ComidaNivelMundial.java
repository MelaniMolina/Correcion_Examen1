package ComidaNivel;

public class ComidaNivelMundial {//La clase abuelo  la denominaremos ComidaNivelMundial
    //Atributos de la clase abuelo
    private String nom_plato;
    private String Pais_plato;
    private  double costo;
    //Generamos el constructor

    public ComidaNivelMundial(String nom_plato, String Pais_plato, double costo) {
        this.nom_plato = nom_plato;
        this.Pais_plato = Pais_plato;
        this.costo = costo;
    }
    //Solo vamos a generar en este caso los metodos get ya que necesitamos que nos retorne datos

    public String getNom_plato() {
        return nom_plato;
    }

    public String getPais_plato() {
        return Pais_plato;
    }

    public double getCosto() {
        return costo;
    }
}
