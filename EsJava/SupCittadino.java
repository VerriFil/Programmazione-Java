//Filippo Verri n.matricola: 174564
package EsJava;

public class SupCittadino extends Supermercato {
    private int apertura, chiusura, addetti;
    private double superficie;

    public SupCittadino(int codice, String indirizzo, int apertura, int chiusura, double superficie,
            int addetti) {
        super(codice, indirizzo);
        this.apertura = apertura;
        this.chiusura = chiusura;
        this.superficie = superficie;
        this.addetti = addetti;
    }

    public String toString() {
        return "SupermercatoCittadino\t"+super.toString() + "\t" + apertura + "\t" + chiusura + "\t" + superficie + "\t" + addetti;
    }

}
