import biblioteca.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        BibliotecaGen<Carte> carti = new BibliotecaGen<>();
        carti.stocare(new Carte("Horror book"));
        carti.stocare(new Carte("Science book"));

        BibliotecaGen<Video> video = new BibliotecaGen<>();
        video.stocare(new Video("Video tape 1"));
        video.stocare(new Video("Video tape 2"));

        BibliotecaGen<Ziar> ziare = new BibliotecaGen<>();
        ziare.stocare(new Ziar("Ziar din anul 2023"));
        ziare.stocare(new Ziar("Ziar din anul 2022"));

        carti.preluare();
        video.preluare();
        ziare.preluare();
    }
}