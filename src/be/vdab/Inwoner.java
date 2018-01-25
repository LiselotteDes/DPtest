package be.vdab;
import java.util.Observer;
public abstract class Inwoner implements Observer {
    private final String naam;
    public Inwoner(String naam) {
        this.naam = naam;
    }
    public String getNaam() {
        return naam;
    }
}
