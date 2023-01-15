import GrupoMusicales.GreenDays;
import GrupoMusicales.GruposMusicales;
import Video_Juego.*;

public class Main {
    public static void main(String[] args) {
        VideoJuegos []v1 = new VideoJuegos[4];
        v1 [0] = new Nintendo64("Mario Kart","Famicom",3,"Carreras","Luigui",2,3);
        v1 [1] = new Nintendo64("Mario Party","GAMEQ",4,"Juego de Mesa","Peach",5,1);
        v1 [2] = new Nintendo64("Sonic","SEGA",1,"Aventura","Sonic",6,3);
        v1 [3] = new Nintendo64("Mario Paper","PC",1,"Plataformas","Mario",8,3);

        GruposMusicales []g1=new GruposMusicales[4];
        g1 [0] = new GreenDays("Banda 24 de Mayo","Nacional",">>Carlosama >>Cumbal ","La Mama de las Bandas",6,"Carlosama",2015,20,"Ecuador");
        g1 [1] = new GreenDays("Panda","Rock",">>Ricardo >>Jorge ","Narcista",4,"Jose Medardo",2014,8,"Ecuador");
        g1 [2] = new GreenDays("Morat","Pop",">>Martin >>Alejandro ","Como si Ayer Fuera Hoy",4,"Simon Vargas",2014,3,"Brasil");
        g1 [3] = new GreenDays("ss-501","K-pop",">>Kim Hyun Joong >>Jung Saeng ","UR-Man",5,"Kim Hyun Joong",2010,10,"Japon");


        for (int i = 0;i<4;i++){
            System.out.println(v1[i]);
            System.out.println(g1[i]);
        }
    }
}