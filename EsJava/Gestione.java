//Filippo Verri n.matricola: 174564
package EsJava;

import java.io.*;
import java.util.*;

public class Gestione {
    static List<Supermercato> Lsupermercati = new LinkedList<Supermercato>();
    static List<Cliente> Lclienti = new LinkedList<Cliente>();
    static List<Visita> LVisite = new LinkedList<Visita>();
    static Map<Integer, Supermercato> CodSuper = new HashMap<Integer, Supermercato>();
    static Map<Cliente, Double> SpesaCliente= new HashMap<Cliente, Double>();

    public static void main(String[] args) {

        // 1 memorizza supermercati
        try {
            BufferedReader br = new BufferedReader(new FileReader("supermercati.txt"));
            String line = br.readLine();
            while (line != null) {
                StringTokenizer tok = new StringTokenizer(line);
                int cod = Integer.parseInt(tok.nextToken());
                String tipo = tok.nextToken();
                line = br.readLine();
                String indirizzo = line;
                line = br.readLine();
                if (tipo.equals("cittadino")) {
                    tok = new StringTokenizer(line);
                    int apertura = Integer.parseInt(tok.nextToken());
                    int chiusura = Integer.parseInt(tok.nextToken());
                    double superfice = Double.parseDouble(tok.nextToken());
                    int addetti = Integer.parseInt(tok.nextToken());
                    Supermercato c = new SupCittadino(cod, indirizzo, apertura, chiusura, superfice, addetti);
                    Lsupermercati.add(c);
                    CodSuper.put(cod, c);
                    line = br.readLine();
                } else {
                    tok = new StringTokenizer(line);
                    double superfice = Double.parseDouble(tok.nextToken());
                    int addetti = Integer.parseInt(tok.nextToken());
                    line = br.readLine();
                    String nome = line;
                    Supermercato i = new Ipermercato(cod, indirizzo, superfice, addetti, nome);
                    Lsupermercati.add(i);
                    CodSuper.put(cod, i);
                    line = br.readLine();
                }
            }
            br.close();
        } catch (IOException e) {
            System.err.println(e);
        } catch (Exception e) {
            System.err.println(e);
        }

        // lettura clienti
        try {

            BufferedReader br = new BufferedReader(new FileReader("clienti.txt"));
            String line = br.readLine();
            while (line != null) {
                String cognome = line;
                line = br.readLine();
                String nome = line;
                Cliente c = new Cliente(cognome, nome);
                Lclienti.add(c);
                line = br.readLine();
                while (!line.equals("") & line != null) {
                    StringTokenizer tok = new StringTokenizer(line);
                    int cod = Integer.parseInt(tok.nextToken());
                    double spesa = Double.parseDouble(tok.nextToken());
                    Visita visita = new Visita(cod, spesa);
                    c.addVisita(visita);
                    LVisite.add(visita);
                    line = br.readLine();
                }
                Double t=c.getTot();
                SpesaCliente.put(c, t);
                line = br.readLine();
            }
            br.close();
        } catch (IOException e) {
            System.err.println(e);
        } catch (Exception e) {
            System.err.println(e);
        }

        // stampa
        System.out.println("codice, tipo, indirizzo, apertura, chiusura, superficie, n. addetti, centro commerciale");
        for (Supermercato s : Lsupermercati)
            System.out.println(s);

        System.out.println("Cognome, nome, spesaTot");
        for (Cliente c : Lclienti){
            System.out.println(c);
        }


        //lettura cod supermercato
        int cod= Integer.parseInt(args[0]);
        System.out.println(Total(cod));   

    }

    public static Double Total(Integer cod) {
        Double t=0.0;
        for(Visita v: LVisite){
            if(cod==v.getCodSuper()){
                t=t+v.getSpesa();
            }
        }

        return t;
    }
}
