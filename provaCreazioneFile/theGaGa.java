package provaCreazioneFile;
import java.io.*;

public class theGaGa {
    public static void main(String[] args){
         
        try{
            creatoreFile cf = new creatoreFile(args[0]);//dobbiamo scrivere ogni volta nel terminale il nome del file
        }
        catch(IOException ex){
            System.out.println("Errore di I/O");
            System.exit(1);
        }

        try{
            scrittoreFile sf = new scrittoreFile(args[0]); //per smettere di scrivere premi 2 volte invio
        }
        catch(IOException ex){
            System.out.println("Errore di I/O");
            System.exit(1);
        }

        try{
            lettoreFile lf = new lettoreFile(args[0]);
        }
        catch(IOException ex){
            System.out.println("Errore di I/O");
            System.exit(1);
        }
        
    }
}
