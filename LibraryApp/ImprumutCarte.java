
import java.util.Date;

public class ImprumutCarte {
    public Carte carteImprumutata;
    public Cititor cititorImprumuta;
    public Date dataImprumut;

    public ImprumutCarte(Carte carteImprumutata, Cititor cititorImprumuta, Date dataImprumut) {
        this.carteImprumutata = carteImprumutata;
        this.cititorImprumuta = cititorImprumuta;
        this.dataImprumut = dataImprumut;
    }

    @Override
    public String toString() {
        return carteImprumutata + " imprumutata de " + cititorImprumuta + " in data " + dataImprumut;
    }

    public Carte getCarteImprumutata() {
        return carteImprumutata;
    }

    public void setCarteImprumutata(Carte carteImprumutata) {
        this.carteImprumutata = carteImprumutata;
    }

    public Cititor getCititorImprumuta() {
        return cititorImprumuta;
    }

    public void setCititorImprumuta(Cititor cititorImprumuta) {
        this.cititorImprumuta = cititorImprumuta;
    }

    public Date getDataImprumut() {
        return dataImprumut;
    }

    public void setDataImprumut(Date dataImprumut) {
        this.dataImprumut = dataImprumut;
    }
    
    
    
}
