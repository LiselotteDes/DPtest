package be.vdab;
public enum InwonerFactory {
    INSTANCE;
    public Inwoner maakInwoner(String regel) {
        char soort = regel.charAt(0);
        String naam = regel.substring(2);
        switch(soort) {
            case 'V': return new Vogel(naam);
            case 'Z': return new Zoogdier(naam);
            default: throw new IllegalArgumentException();
        }
    }
}
