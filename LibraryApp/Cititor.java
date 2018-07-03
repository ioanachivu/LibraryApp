

public class Cititor {
    private String nume;
    private String cnp;

    public Cititor(String nume, String cnp) {
        this.nume = nume;
        this.cnp = cnp;
    }

    @Override
    public String toString() {
        return nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }
    
    
}
