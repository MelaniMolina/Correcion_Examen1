package GrupoMusicales;

public class BandaMusica extends GruposMusicales {//La clase padre la denominaremos BandaMusica en donde utilizaremos
    //la palabra reservada "extends"

    //Generamos los atributos propios de la clase
    private int num_Inte;
    private String Lider_Ban;
    // Generamos el constructor que nos permita heredar los atributos de la otra clase
    public BandaMusica(String nombre_grupo, String tipo_musica, String nom_integrantes, String albunes, int num_Inte, String lider_Ban) {
        super(nombre_grupo, tipo_musica, nom_integrantes, albunes);
        this.num_Inte = num_Inte;
        this.Lider_Ban = lider_Ban;
    }
    //Creamos los metodos
    public void Datos_Banda(){
        System.out.println("\u001B[35mNombre del Grupo: "+getNombre_grupo()+"\n"+"\u001B[35mGenero del Grupo: "+getTipo_musica()+"\n"
                +"\t\u001B[32mNombre de los Integrantes \n"+getNom_integrantes()+"\n"+"\u001B[32mNombre del Album: "+getAlbunes());
    }
    public void Ingreso_Datos(){
        System.out.println("\u001B[34mEl Numero de Integrantes: "+num_Inte+"\n"+"\u001B[31mNombre del Lider: "+Lider_Ban);
        System.out.println();
        System.out.println("\u001B[32m-----------------------------------------------------------------------------------");
    }

}
