public abstract class Libro implements GestionePrestito{
    private String titolo;
    private String autore;
    private int annoPubblicazione;
    private StatoLibro statoLibro;

    public Libro(String titolo, String autore, int annoPubblicazione, StatoLibro statoLibro) {
        this.titolo = titolo;
        this.autore = autore;
        this.annoPubblicazione = annoPubblicazione;
        this.statoLibro = statoLibro;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public int getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    public void setAnnoPubblicazione(int annoPubblicazione) {
        this.annoPubblicazione = annoPubblicazione;
    }

    public StatoLibro getStatoLibro() {
        return statoLibro;
    }

    public void setStatoLibro(StatoLibro statoLibro) {
        this.statoLibro = statoLibro;
    }

    protected abstract void calcolaPrezzo();

    @Override
    public String toString() {
        return "Libro{" +
                "titolo='" + titolo + '\'' +
                ", autore='" + autore + '\'' +
                ", annoPubblicazione=" + annoPubblicazione +
                ", statoLibro=" + statoLibro +
                '}';
    }
}
