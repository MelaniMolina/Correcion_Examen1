package Video_Juego;

public class Nintendo64 extends Juegos {//Creamos la clase hija a la cual denominados Nintendo64
    // luego utilizamos la palabra reservada extends para poder heredar del padre
    private int numero_vidas;//Declaramos los atributos


    //Generamos el constructos
    public Nintendo64(String titulo, String consola, int cantJugadores, String categoria, String nom_peronaje, int nivel_juego, int numero_vidas) {
        super(titulo, consola, cantJugadores, categoria, nom_peronaje, nivel_juego);
        this.numero_vidas = numero_vidas;
        super.Datos_Juegos();//Llamamos a los metodos
        super.Ingreso_Datos();
    }
    //Generamos los metodos
    public void Jugabilidad(){

        System.out.println("\033[35mIngrese el Numero de Vidas: "+numero_vidas);
    }

}
