
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        
        Library biblioteca = new Library();
        
        // CARTE --------------------------------------------------------- 
        // creare obiecte carte
        Carte carte1 = new Carte("1","Morometii","Preda","Roman");
        Carte carte2 = new Carte("2","Luceafarul","Eminescu","Poezii");
        Carte carte3 = new Carte("3","Maitreyi","Mircea Eliade","Roman");
        Carte carte4 = new Carte("4","Teatru","Caragiale","Comedie");
        Carte carte5 = new Carte("5","Baltagul","Sadoveanu","Roman");
       
  
        // adaugare obiecte carte in set
        biblioteca.adaugaCarte(carte1);
        biblioteca.adaugaCarte(carte2);
        biblioteca.adaugaCarte(carte3);
        biblioteca.adaugaCarte(carte4);
        biblioteca.adaugaCarte(carte5);
        
        // actualizarea unei carti
        biblioteca.actualizareCarte("Teatru", "Caragiale");
        System.out.println(carte4.getDomeniu()+": "+carte4.getDescriere());
        
        // stergerea unei carti
        biblioteca.stergereCarte();
        //biblioteca.stergereCarte(carte1);
        
        // listare carti din biblioteca 
        biblioteca.listareCarti();
        
        // listare autori din biblioteca
        biblioteca.listareAutori();
        
        // CITITOR-----------------------------------------------------
        // creare obiecte cititor
        Cititor cititor1 = new Cititor("Mihai Lungu","1870625452268");
        Cititor cititor2 = new Cititor("Ana Zaharia","2840621450087");
        Cititor cititor3 = new Cititor("Feli Matei","2850328442077");
        Cititor cititor4 = new Cititor("Miruna Tanase","2858442458023");
        Cititor cititor5 = new Cititor("Dragos Ionescu","1900158447892");
        
        // adaugare obiecte cititor in set
        biblioteca.adaugaCititor(cititor1);
        biblioteca.adaugaCititor(cititor2);
        biblioteca.adaugaCititor(cititor3);
        biblioteca.adaugaCititor(cititor4);
        biblioteca.adaugaCititor(cititor5);
        
        // actualizarea unui cititor
        //biblioteca.actualizareCititor("2840621450087");
        //System.out.println(cititor2.getNume());
        
        // stergerea unui cititor
        biblioteca.stergereCititor("1870625452268");
        //biblioteca.stergereCititor(cititor1);
        
        // listarea tuturor cititorilor
        biblioteca.listareCititori();
        
        
        // CAUTARE---------------------------------------------------------------------
        // cautarea unei carti
        Carte carteGasita = biblioteca.cautareCarte("Maitreyi");
        if (carteGasita instanceof Carte) {
            System.out.println("Cartea cautata: "+carteGasita.getTitlu()+" a fost gasita");
        } else {
            System.out.println("Cartea cautata nu a fost gasita");
        }
        
        // cautarea unui cititor
        Cititor cititorGasit = biblioteca.cautareCititor("Feli Matei");
        if (cititorGasit instanceof Cititor) {
            System.out.println("Cititorul: "+cititorGasit.getNume()+" a fost gasit");
        } else {
            System.out.println("Cititorul nu exista in baza de date");
        }
        
        // IMPRUMUT ------------------------------------------------------------
        
        ImprumutCarte imprumut1 = new ImprumutCarte(carte2, cititor2, new Date());
        ImprumutCarte imprumut2 = new ImprumutCarte(carte3, cititor3, new Date());
        ImprumutCarte imprumut3 = new ImprumutCarte(carte4, cititor4, new Date());
        ImprumutCarte imprumut4 = new ImprumutCarte(carte5, cititor5, new Date());
        
        biblioteca.imprumutCarte(imprumut1);
        biblioteca.imprumutCarte(imprumut2);
        biblioteca.imprumutCarte(imprumut3);
        biblioteca.imprumutCarte(imprumut4);
        
        
        // lista carti netreturnate
        biblioteca.listaNereturnate();
    }
}
