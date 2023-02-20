//Filippo Verri n.matricola: 174564
package EsJava;

import java.util.*;

public class Cliente {
    private String cognome, nome;
    protected List<Visita> visita;

    public Cliente(String cognome, String nome) {
        this.cognome = cognome;
        this.nome = nome;
        visita = new LinkedList<Visita>();
    }

    public void addVisita(Visita v) {
        visita.add(v);
    }

    public Double getTot(){
        Double t=0.0;
        Double s;
        for(Visita v: visita){
            s=v.getSpesa();
            t=+s;
        }
        return t;
    }

    public String toString() {
        return cognome + ", " + nome + ", " + visita;
    }
}
