package Video_Juego;

public class Juegos extends VideoJuegos{ //La clase padre la denominaremos Juegos en donde utilizaremos
//la palabra reservada "extends"

    //Generamos los atributos propios de la clase
    private String nom_peronaje;
    private int nivel_juego;
    // Generamos el constructor que nos permita heredar los atributos de la otra clase
    public Juegos(String titulo, String consola, int cantJugadores, String categoria, String nom_peronaje, int nivel_juego) {
        super(titulo, consola, cantJugadores, categoria);
        this.nom_peronaje = nom_peronaje;
        this.nivel_juego = nivel_juego;
    }
    //Creamos los metodos
    public void Datos_Juegos(){
        System.out.println("Nombre del Juego: "+getTitulo()+"\n"+"Nombre la consola: "+getConsola()+"\n"+"Numero de Jugadores: "+getCantJugadores()
                +"\n"+"Categoria: "+getCategoria());
    }
    public void Ingreso_Datos(){
        System.out.println();
        System.out.println("-^-^-^-^-^-^-^-^-^-^-^-^-^^-^-^-^-^-^-^-^-^-^-^-^-^-^-^");
        System.out.println("Ingrese el Nombre del Personaje: "+nom_peronaje);
        System.out.println("Escriba el Nivel de dificultad: "+nivel_juego);
        System.out.println("-^-^-^-^-^-^-^-^-^-^-^-^-^^-^-^-^-^-^-^-^-^-^-^-^-^-^-^");
        System.out.println();
    }

}
