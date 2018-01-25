package be.vdab;
import java.util.Observable;
public class Vogel extends Inwoner {
    public Vogel(String naam) {
        super(naam);
    }
    @Override
    public void update(Observable o, Object argument) {
        if (!(o instanceof Vulkaan)) {
            throw new IllegalArgumentException();
        }
        Vulkaan vulkaan = (Vulkaan) o;
        System.out.println(super.getNaam() + " vliegt hoger");
    }
    
}
