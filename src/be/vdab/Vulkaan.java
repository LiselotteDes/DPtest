package be.vdab;
import java.util.Observable;
public class Vulkaan extends Observable {
    public void barstUit() {
        setChanged();
        notifyObservers();
    }
}
