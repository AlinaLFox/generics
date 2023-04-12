package biblioteca;

public class Carte {
    String tipDeCarte;

    public Carte (String tipDeCarte) {
        this.tipDeCarte = tipDeCarte;
    }

    @Override
    public String toString() {
        return tipDeCarte;
    }
}
