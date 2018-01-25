package be.vdab;

import java.util.ArrayList;
import java.util.List;

public enum Eiland {
    INSTANCE;
    private List<Inwoner> inwoners = new ArrayList<>();
    private List<Vulkaan> vulkanen = new ArrayList<>();
//    private Vulkaan vulkaan = new Vulkaan();
    
    public void addInwoner(Inwoner inwoner) {
        inwoners.add(inwoner);
    }
    public void addVulkaan(Vulkaan vulkaan) {
        vulkanen.add(vulkaan);
    }
    public List<Inwoner> getInwoners() {
        return inwoners;
    }
    public List<Vulkaan> getVulkanen() {
        return vulkanen;
    }    
}
