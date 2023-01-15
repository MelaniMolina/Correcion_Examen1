import GrupoMusicales.GreenDays;
import GrupoMusicales.GruposMusicales;
import ComidaNivel.*;
import Video_Juego.*;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String opcion, repetir = null;
        int num;
        try {
            do {
                String menu = Menu().toUpperCase();
                switch (menu) {
                    case "1":
                        System.out.println("");
            VideoJuegos[] v1 = new VideoJuegos[4];
            v1[0] = new Nintendo64("Mario Kart", "Famicom", 3, "Carreras", "Luigui", 2, 3);
            v1[1] = new Nintendo64("Mario Party", "GAMEQ", 4, "Juego de Mesa", "Peach", 5, 1);
            v1[2] = new Nintendo64("Sonic", "SEGA", 1, "Aventura", "Sonic", 6, 3);
            v1[3] = new Nintendo64("Mario Paper", "PC", 1, "Plataformas", "Mario", 8, 3);
                        for (int i = 0; i < 4; i++) {
                            System.out.println(v1[i]);
                        }
            break;
                    case "2":
                        System.out.println("");
            GruposMusicales[] g1 = new GruposMusicales[4];
            g1[0] = new GreenDays("Banda 24 de Mayo", "Nacional", ">>Carlosama >>Cumbal ", "La Mama de las Bandas", 6, "Carlosama", 2015, 20, "Ecuador");
            g1[1] = new GreenDays("Panda", "Rock", ">>Ricardo >>Jorge ", "Narcista", 4, "Jose Medardo", 2014, 8, "Ecuador");
            g1[2] = new GreenDays("Morat", "Pop", ">>Martin >>Alejandro ", "Como si Ayer Fuera Hoy", 4, "Simon Vargas", 2014, 3, "Brasil");
            g1[3] = new GreenDays("ss-501", "K-pop", ">>Kim Hyun Joong >>Jung Saeng ", "UR-Man", 5, "Kim Hyun Joong", 2010, 10, "Japon");
                        for (int i = 0; i < 4; i++) {
                            System.out.println(g1[i]);
                        }
            break;
                    case "3":
                        System.out.println("");
            ComidaNivelMundial[] c1 = new ComidaNivelMundial[4];
            c1[0] = new Comida("Encebollado", "Ecuador", 2.75, "Marisqueria", "Pescado ", "Yuca", "Cebolla", "Pimienta ", "Verde", "1:30 hora");
            c1[1] = new Comida("Pasta", "Italia", 5.00, "Nonna's", "Tallarin", "Tomate", "Cebollin", "Camaron", "Hierbas", "30:00 minutos");
            c1[2] = new Comida("Lasaña", "Gran Bretaña", 5.50, "House lasagnas", "Fideo", "Carne molida", "Tomate", "Queso ", "Hierbas", "2:30 horas");
            c1[3] = new Comida("Kimbap", "Corea", 3.50, "Cocina con Coqui", "Arroz", "Alga seca", "Atun", "Rabano", "Espinaca", "1:00 hoas");
                        for (int i = 0; i < 4; i++) {
                            System.out.println(c1[i]);
                        }
            break;
                    default:
                        System.out.println("\u001B[31mOpcion No Encontrada!!!");
                }
                System.out.println("\u001B[34mDesea Continuar ? \nPresione S para continuar : ");
                repetir = sc.next();
            } while (repetir.equals("S") || repetir.equals("s"));
        }catch (Exception e){
            System.out.println("\u001B[31mIngreso Erroneo de Datos " + e.getMessage());
        }finally {
            System.out.println("\u001B[36mEl  Programa ah Finalizado!!!!");
        }
    }
    static String Menu() {
        System.out.println("\u001B[33m\t-/-/-/-/-/-/ TEMAS DE APLICACION -/-/-/-/-/-/");
        System.out.println("\u001B[35m1. Video Juegos");
        System.out.println("\u001B[31m2. Grupos Musicales o Artistas");
        System.out.println("\u001B[32m3. Comida a Nivel Mundial");
        System.out.print("\u001B[36mSeleccione la Opcion que Desee: ");
        String opcion = sc.next();
        return opcion;
    }
}