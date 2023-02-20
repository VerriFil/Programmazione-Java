//Filippo Verri n.matricola: 174564
package EsJava;

import java.util.*;

public class Supermercato {
    private int codice; // addetti;
    // private float superficie;
    private String  indirizzo;

    public Supermercato(int codice, String indirizzo) {
        this.codice = codice;
        this.indirizzo = indirizzo;
        // this.superficie = superficie;
        // this.addetti = addetti;
    }

    public int getCodice() {
        return codice;
    }

    public String toString() {
        return codice + "\t" + "\t" + indirizzo;
    }
}
