package es17lab;
import java.util.Scanner;

public class provaSconto {
    public static void main(String[] args){
        int num, min;
        double prezzo, perc;
        double sconto1, sconto2;
        Scanner input = new Scanner(System.in);
        //potevamo anche usare
        //InputStreamReader nome = new InputStreamReader(System.in);
        //BufferedReader kdb = new BufferedReader(nome);
        //oppure
        //BufferedReader kdb = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("qual'è il minimo di articole per avere lo sconto1 ?");
        min=input.nextInt();
        System.out.println("\nquant'è la percentuale dello sconto ?");
        perc=input.nextDouble();

        System.out.println("\nqual'è il prezzo dell'articolo che vuoi comprare ?");
        prezzo=input.nextDouble();
        System.out.println("\nquanti articoli vuoi comprare ?");
        num=input.nextInt();

        

        scontoQuantita offerta = new scontoQuantita(min, perc);
        sconto1=offerta.calcolaSconto(num, prezzo);
        System.out.println("\nCon lo sconto 1 hai risparmiato "+sconto1+" euro !!!\n\n");


        System.out.println("qual'è il minimo di articole per avere lo sconto2 ?");
        min=input.nextInt();
        CompraNArticoliPrendiUnoGratis cnapug = new CompraNArticoliPrendiUnoGratis(min);

        System.out.println("\nqual'è il prezzo dell'articolo che vuoi comprare ?");
        prezzo=input.nextDouble();
        System.out.println("\nquanti articoli vuoi comprare ?");
        num=input.nextInt();
        sconto2=cnapug.calcolaSconto(num, prezzo);

        System.out.println("\nCon lo sconto 2 hai risparmiato "+sconto2+" euro !!!\n\n");

        input.close();
    }
}
