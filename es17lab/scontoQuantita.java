package es17lab;

public class scontoQuantita extends PoliticaSconto{
    //il numero minimo di articoli uguali da comprare per avere lo sconto
    protected int minimo; 
    protected double percentuale;
    protected double sconto;

    public scontoQuantita(int min, double perc){
        minimo=min;
        percentuale=perc;
        /*  this.minimo=minimo;
            this.percentuale=percentuale;
        */
    }

    public double calcolaSconto(int numeroArticoli, double prezzoArticoli){
        if(numeroArticoli>minimo){
            sconto=((prezzoArticoli*numeroArticoli)*percentuale)/100.00;
        }
        else
            sconto=0.00;

        return sconto;
    }
}
