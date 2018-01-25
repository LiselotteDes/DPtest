package be.vdab;
public class Main {
    public static void main(String[] args) {
        SpelFacade spel = new SpelFacade();
        // start het spel
        spel.start();
        // laat een vulkaan uitbarsten
        spel.uitbarsten(0);
    }
    
}
