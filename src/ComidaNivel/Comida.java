package ComidaNivel;

public class Comida extends ComidaLocal{
    private String ingredien1,ingredien2,ingredien3,ingredien4,ingredien5;
    private String tiempo_prepacion;

    public Comida(String nom_plato, String Pais_plato, double costo, String lugar_venta, String ingredien1, String ingredien2, String ingredien3,
                  String ingredien4, String ingredien5, String tiempo_prepacion) {
        super(nom_plato, Pais_plato, costo, lugar_venta);
        this.ingredien1 = ingredien1;
        this.ingredien2 = ingredien2;
        this.ingredien3 = ingredien3;
        this.ingredien4 = ingredien4;
        this.ingredien5 = ingredien5;
        this.tiempo_prepacion = tiempo_prepacion;
        super.Datos_Comida();
        PrepacioneIngredientes();
    }
    public void  PrepacioneIngredientes(){
        System.out.println();
        System.out.println("\t\n\033[32m<<-- R E C E T A -->>");
        System.out.println("\033[33m1)"+getIngredien1());
        System.out.println("\033[33m2)"+getIngredien2());
        System.out.println("\033[33m3)"+getIngredien3());
        System.out.println("\033[33m4)"+getIngredien4());
        System.out.println("\033[33m5)"+getIngredien5());
        System.out.println("\033[31mTiempo de Preparacion: "+tiempo_prepacion);
        System.out.println();
    }

    public String getIngredien1() {
        return ingredien1;
    }

    public String getIngredien2() {
        return ingredien2;
    }

    public String getIngredien3() {
        return ingredien3;
    }

    public String getIngredien4() {
        return ingredien4;
    }

    public String getIngredien5() {
        return ingredien5;
    }
}
