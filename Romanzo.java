public class Romanzo extends Libro {


    public Romanzo(String titolo, String autore, int annoPubblicazione, StatoLibro statoLibro) {
        super(titolo, autore, annoPubblicazione, statoLibro);
    }

    @Override
    public void calcolaPrezzo() {
        System.out.println("il prezzo è 10.99");
    }

    @Override
    public void prestaLibro() {
        if (getStatoLibro() == StatoLibro.Disponibile) {
            System.out.println("Il prestito è andato a buon fine");
            setStatoLibro(StatoLibro.InPrestito);
        } else {
            System.out.println("Il libro non è disponibile");
        }
    }

    @Override
    public void restituisciLibro() {
        setStatoLibro(StatoLibro.Disponibile);
        System.out.println("Il libro è stato restituito");
    }
}
