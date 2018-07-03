
import java.time.ZonedDateTime;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Biblioteca {
    
    Set<Cititor> listaCititori = new HashSet<>();
    Set<Carte> listaCarti = new HashSet<>();
    Set<ImprumutCarte> listaImprumutCarte = new HashSet<>();
   
    // 
    // CARTE -------------------------------------------------------------------
    // adaugare carte 
    public void adaugaCarte (Carte carte) {
        listaCarti.add(carte);
    }
    
    // actualizarea unei carti
    public void actualizareCarte(String numeCarte, String autorCarte ){
        Scanner input = new Scanner(System.in);
        for(Carte c: listaCarti) {
            if (c.getTitlu().equals(numeCarte) && c.getAutor().equals(autorCarte)) {
                System.out.println("Ce doriti sa modificati: domeniu/descriere");
                if (input.nextLine().equals("domeniu")) {
                    System.out.println("Introduceti noul domeniu:");
                    c.setDomeniu(input.nextLine());
                } else {
                    System.out.println("Introduceti o descriere");
                    c.setDescriere(input.nextLine());
                }
            } input.close();
        }
    }
    
    // stergerea unei carti dupa nume carte si autor 
    public void stergereCarte() {
    	Scanner input = new Scanner(System.in);
    	System.out.println("Insert the name of the book you want to delete:");
    	String numeCarte = input.nextLine();
    	System.out.println("Insert the author of the book you want to delete:");
    	String autorCarte = input.nextLine();
        for (Carte c: listaCarti) {
            if (c.getTitlu().equals(numeCarte) && c.getAutor().equals(autorCarte)) {
                listaCarti.remove(c);
                System.out.println("Cartea: "+c.getTitlu()+" de "+c.getAutor()+" a fost stearsa");
                break;
            } 
        }  input.close();
    }
    
    // stergerea unei carti avand disponibil obiectul carte
    public void stergereCarte(Carte c) {
        listaCarti.remove(c); // hashset-ul isi pastreaza hash-ul intern al fiecarui obiect
        System.out.println("Cartea: "+c.getTitlu()+" de "+c.getAutor()+" a fost stearsa");
    }
    
    // listarea tuturor cartilor
    public void listareCarti(){
        for(Carte c: listaCarti) 
            System.out.println(c.getTitlu()+": "+c.getAutor()+" este in biblioteca");
    }
    
    // listarea tuturor autorilor
    public void listareAutori() {
        for(Carte c: listaCarti) {
            System.out.println("Autorul: "+c.getAutor()+" este in biblioteca");
        }
    }
    
    // CITITOR -----------------------------------------------------------------
    // adaugarea unui cititor
    public void adaugaCititor (Cititor cititor) {
        listaCititori.add(cititor);
    }
    
    // actualizarea unui cititor
    public void actualizareCititor(String cnp){
        Scanner input = new Scanner(System.in);
        for(Cititor c: listaCititori) {
            if (c.getCnp().equals(cnp)) {
                System.out.println("Introduceti noul nume");
                    c.setNume(input.nextLine());
                } 
            } input.close();
        }
    
    // stergerea unui cititor
    public void stergereCititor(String cititorDeSters) {
        for (Cititor c: listaCititori) {
            if (c.getCnp().equals(cititorDeSters)) {
                listaCititori.remove(c);
                System.out.println("Cititorul: "+c.getNume()+" a fost sters");
            break;
            } 
        } 
    }
    
    // stergerea unui cititor folosind obiectul cititor
    public void stergereCititor(Cititor c) {
        listaCititori.remove(c);
        System.out.println("Cititorul: "+c.getNume()+" a fost sters");
    }
    
    // listarea tuturor cititorilor
    public void listareCititori () {
        for(Cititor c: listaCititori) {
            System.out.println("Cititorul "+c.getNume()+" este in baza de date");
        }
    }
    
    // CAUTARE -----------------------------------------------------------------
    // cautarea unei carti dupa titlu/autor
    public Carte cautareCarte (String termenCautare) {         
        Carte carteGasita = null;   
        for(Carte c : listaCarti) {
            if (c.getTitlu().equals(termenCautare) || c.getAutor().equals(termenCautare)) {
                carteGasita = c;
                break; 
            }
        }   
        return carteGasita;
    }
    
    // cautarea unui cititor dupa nume/cnp
    public Cititor cautareCititor (String persCautata) {
        Cititor persGasita = null;
        for (Cititor c: listaCititori) {
            if (c.getCnp().equals(persCautata) || c.getNume().equals(persCautata)) {
                persGasita = c;
                break;
            }
        }
        return persGasita;
    }
    
    // imprumtarea unei carti
    public void imprumutCarte(ImprumutCarte imprumut) {
        listaImprumutCarte.add(imprumut);
        System.out.println(imprumut.cititorImprumuta.toString()+" a imprumutat "+imprumut.carteImprumutata.toString());
    }
    
    // returnarea unei carti
    public void returnareCarte (ImprumutCarte returnare) {
        listaImprumutCarte.remove(returnare);
        System.out.println(returnare.cititorImprumuta.toString()+ " a returnat "+returnare.carteImprumutata.toString());
    }
    
    public void listaNereturnate () { 
        System.out.println("Lista cartilor nereturnate:");
        ZonedDateTime now = ZonedDateTime.now();
        ZonedDateTime trecut = now.plusDays(-30);
        for(ImprumutCarte c: listaImprumutCarte) {
            if(c.dataImprumut.toInstant().isBefore(trecut.toInstant()))
                System.out.println(c.toString());
        }
    }
}
