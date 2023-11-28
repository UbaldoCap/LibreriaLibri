import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Libreria{
    public Libro[] libri;

    public Libreria(Libro[] libri) {
        this.libri = libri;
    }

    public Libro[] getLibri() {
        return libri;
    }

    public void setLibri(Libro[] libri) {
        this.libri = libri;
    }

    public String statoLibro (Libro libro){
        libro.setStatoLibro(StatoLibro.InPrestito);
        for (int i = 0; i < libri.length; i++) {
            if (Objects.equals(libro.getTitolo(), libri[i].getTitolo())) {
                libro.setStatoLibro(StatoLibro.Disponibile);
                return "libro disponibile";
            }
        }
        return "libro non disponibile";
    }

    public void aggiornaPrestito() {
        ArrayList<Libro> newLibri = new ArrayList<>();
        for (int i = 0; i < libri.length; i++) {
            newLibri.add(libri[i]);
            if (libri[i].getStatoLibro() == StatoLibro.InPrestito) {
                newLibri.remove(i);
            }
        }
        libri = newLibri.toArray(new Libro[0]);
    }

    public void aggiungiLibro(Libro libro) {
        libri = java.util.Arrays.copyOf(libri, libri.length + 1);
        libri[libri.length - 1] = libro;
    }

    public void libriDisponibili() {
        System.out.println("libri disponibili => " + libri.length);
        for (int i = 0; i < libri.length; i++) {
            System.out.println((i + 1) + ":" + libri[i].getTitolo());
        }
    }

    public void cercaLibroPer (String filtro, String valoreFiltro) {
        switch (filtro) {
            case "autore":
                System.out.println("Libri disponibili");
                for (Libro libro : libri) {
                    if (valoreFiltro.equals(libro.getAutore())) {
                        System.out.println(libro);
                    }
                }
                break;

            case "titolo":
                System.out.println("Libri disponibili");
                for (Libro libro : libri) {
                    if (valoreFiltro.equals(libro.getTitolo())) {
                        System.out.println(libro);
                    }
                }
                break;

            case "anno di pubblicazione":
                System.out.println("Libri disponibili");
                for (Libro libro : libri) {
                    if (valoreFiltro.equals(Integer.toString(libro.getAnnoPubblicazione()))) {
                        System.out.println(libro);
                    }
                }
        }
    }

    @Override
    public String toString() {
        return "Libreria{" +
                "libri=" + Arrays.toString(libri) +
                '}';
    }
}
