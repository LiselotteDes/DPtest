package be.vdab;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;
public class SpelFacade {
    private final static Path INWONERS_PATH = Paths.get("/data/inwoners.txt");
    
    public void start() {
        vulInwoners();
        vulVulkanen();
        laatObserveren();
    }
    private void vulInwoners() {
        try (Stream<String> stream = Files.lines(INWONERS_PATH)) {
            stream.map(regel -> InwonerFactory.INSTANCE.maakInwoner(regel))
                    .forEach(inwoner -> Eiland.INSTANCE.addInwoner(inwoner));
        } catch (IOException ex) {
            ex.printStackTrace();
        }        
    }
    private void vulVulkanen() {
        Eiland.INSTANCE.addVulkaan(new Vulkaan());
    }
    private void laatObserveren() {
        // Elke inwoner van het eiland voeg je toe als Observer bij elke vulkaan van het eiland
        Eiland.INSTANCE.getVulkanen().stream()
                .forEach(vulkaan -> Eiland.INSTANCE.getInwoners().stream()
                                                                    .forEach(inwoner -> vulkaan.addObserver(inwoner)));
    }
    public void uitbarsten(int i) {
        if(i<0 || i> Eiland.INSTANCE.getVulkanen().size()-1) {
            throw new IllegalArgumentException();
        }
        Eiland.INSTANCE.getVulkanen().get(i).barstUit();
    }
}
