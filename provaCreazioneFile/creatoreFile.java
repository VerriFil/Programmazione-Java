package provaCreazioneFile;
import java.io.*;

public class creatoreFile {
    public creatoreFile(String nomefile)throws IOException{
        File f = new File(nomefile); /*normalmente ci andrebbe il path del file, visto che lo screiamo nella stessa cartella basta scrivere il nome*/

        if(f.exists()){
            System.out.println("Il file "+nomefile+" esiste già");
        }else if(f.createNewFile()){
            System.out.println("Il file "+nomefile+" è sato creato");
        }
    }
}
