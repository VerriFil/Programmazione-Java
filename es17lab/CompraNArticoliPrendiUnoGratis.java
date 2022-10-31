package es17lab;

public class CompraNArticoliPrendiUnoGratis extends PoliticaSconto{
    protected int n;
    protected double sconto;
    public CompraNArticoliPrendiUnoGratis( int n){
        this.n=n;
    }

    public double calcolaSconto(int numeroArticoli, double prezzoArticoli) {
        sconto=((double)numeroArticoli/n)*prezzoArticoli;
        return sconto;
    }
}
