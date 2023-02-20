//Filippo Verri n.matricola: 174564
package EsJava;

import java.util.*;

public class Visita {
    protected int codSuper;
    protected Double spesa;

    public Visita(int codSuper, Double spesa) {
        this.codSuper = codSuper;
        this.spesa = spesa;
    }

    public int getCodSuper() {
        return codSuper;
    }

    public Double getSpesa() {
        return spesa;
    }

    public String ToString(){
        return "("+codSuper+", "+spesa+")";
    }
}
