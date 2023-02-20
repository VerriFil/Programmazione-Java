//Filippo Verri n.matricola: 174564
package EsJava;

import java.util.*;

public class Ipermercato extends Supermercato {
    private String nome;
    private double superficie;
    private int addetti;

    public Ipermercato(int codice, String indirizzo, double superficie, int addetti, String nome) {
        super(codice, indirizzo);
        this.superficie = superficie;
        this.addetti = addetti;
        this.nome = nome;
    }

    public String toString() {
        return "Ipermercato\t"+super.toString() + "\t" + superficie + "\t" + addetti + "\t" + nome;
    }
}
