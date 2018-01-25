package be.vdab;
import java.util.Observable;
public class Zoogdier extends Inwoner {
    public Zoogdier(String naam) {
        super(naam);
    }
    @Override
    public void update(Observable o, Object argument) {
        if (!(o instanceof Vulkaan)) {
            throw new IllegalArgumentException();
        }
        Vulkaan vulkaan = (Vulkaan) o;
        System.out.println(super.getNaam() + " schuilt in zijn hol");
    }
    
}
