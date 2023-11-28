import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Libro romanzo1 = new Romanzo("1984",
                "George Orwell", 1949, StatoLibro.Disponibile);
        Libro fantasy1 = new Fantasy("Harry potter e la pietra filosofale",
                "JK Rowling", 1998, StatoLibro.Disponibile);
        Libro storia1 = new Storia("Tossici. L’arma segreta del Reich",
                "Norman Ohler", 2016, StatoLibro.Disponibile);
        Libro[] libri = {romanzo1, fantasy1, storia1};
        Libreria libreria = new Libreria(libri);
        System.out.println(libreria);

        //fare una stampa del metodo statoLibro in libreria per visualizzare la disponibilità del libro
        System.out.println(libreria.statoLibro(romanzo1));

        //usare il motodo calcoloPrezzo in libro per visualizzare il prezzo del libro
        romanzo1.calcolaPrezzo();

        //usare il metodo prestoLibro in libri per modificare lo stato del libro
        //ogni volta che viene prestato un libro, eseguire il metodo aggiornaPrestito da libreria
        romanzo1.prestaLibro();
        libreria.aggiornaPrestito();

        //usare il metodo libriDisponibili in libreria per visualizzare i titoli dei libri disponibili
        libreria.libriDisponibili();

        System.out.println(libreria);
        System.out.println(libreria.statoLibro(romanzo1));

        //usare il metodo restituisciLibro in libri per modificare lo stato del libro
        //ogni volta che viene restituito un libro, eseguire il metodo aggiungiLibro da libreria
        romanzo1.restituisciLibro();
        //se si vuole aggiungere un nuovo libro alla libreria, eseguire il metodo aggiungiLibro da libreria
        libreria.aggiungiLibro(romanzo1);

        System.out.println(libreria.statoLibro(romanzo1));
        System.out.println(libreria);

        libreria.libriDisponibili();

        //usare metodo carcaLibroPer in libreria, per avviare una ricerca personalizzata, inserire prima il
        //filtro (autore, titolo, anno di pubblicazione) e poi la Stringa di ricerca
        libreria.cercaLibroPer("autore", "Norman Ohler");
        libreria.cercaLibroPer("titolo", "1984");
        libreria.cercaLibroPer("anno di pubblicazione", "1998");
        libreria.cercaLibroPer("anno di pubblicazione", "1949");

    }
}
