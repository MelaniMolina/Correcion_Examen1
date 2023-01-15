package ComidaNivel;

public class ComidaLocal extends ComidaNivelMundial {
    private String lugar_venta;

    public ComidaLocal(String nom_plato, String Pais_plato, double costo, String lugar_venta) {
        super(nom_plato, Pais_plato, costo);
        this.lugar_venta = lugar_venta;
    }
    public void Datos_Comida(){
            System.out.println();
            System.out.println("\033[36m-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
            System.out.println("\033[34mNombre de la Comida: " + getNom_plato() + "\n" + "\033[34mPais de Origen de la Comida: " + getPais_plato()
                    + "\n" + "\u001B[36mPrecio de la Comida: " + getCosto() + "\n" + "\u001B[36mNombre del Restaurante: " + lugar_venta);
            System.out.println("\u001B[35m-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");

        }

}
