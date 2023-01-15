package GrupoMusicales;

public class GreenDays extends BandaMusica{//Creamos la clase hija a la cual denominados BandaMusical
    // luego utilizamos la palabra reservada extends para poder heredar del padre

    //Declaramos los atributos
    private int anio_inicio;
    private int premios;
    private String Giras;
    //Generamos el constructos

    public GreenDays(String nombre_grupo, String tipo_musica, String nom_integrantes, String albunes,
                     int num_Inte, String lider_Ban, int anio_inicio, int premios, String giras) {
        super(nombre_grupo, tipo_musica, nom_integrantes, albunes, num_Inte, lider_Ban);
        this.anio_inicio = anio_inicio;
        this.premios = premios;
        this.Giras = Giras;
        super.Datos_Banda();
        super.Ingreso_Datos();
    }
    //Generamos los metodos
    public void Datos_Green(){
        System.out.println("Anio de Inicio de la Agrupacion: "+anio_inicio+"\n"+"Numero de Premios: "+premios+"\n"+"Paises de Gira: "+Giras);
    }
}
