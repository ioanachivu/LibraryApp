

public class Carte {
    public String idCarte;
    private String titlu;
    private String autor;
    private String domeniu;

    public String getDomeniu() {
        return domeniu;
    }

    public void setDomeniu(String domeniu) {
        this.domeniu = domeniu;
    }

    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }
    private String descriere;

    @Override
    public String toString() {
        return titlu + " de " + autor;
    }
    
    public Carte(String idCarte, String titlu, String autor, String domeniu) {
        this.idCarte = idCarte;
        this.titlu = titlu;
        this.autor = autor;
        this.domeniu = domeniu;
    }

    public String getIdCarte() {
        return idCarte;
    }

    public void setIdCarte(String idCarte) {
        this.idCarte = idCarte;
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    
    
}
