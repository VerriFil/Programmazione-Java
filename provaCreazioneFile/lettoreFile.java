package provaCreazioneFile;
import java.io.*;

public class lettoreFile {
    public lettoreFile(String nomefile) throws IOException{
        FileReader fr = new FileReader(nomefile);
        BufferedReader inLine = new BufferedReader(fr);

        System.out.println("Il testo salvato è: ");
        String linea = inLine.readLine();
        while(linea!=null){
            System.out.println(linea);
            linea=inLine.readLine();
        }

        inLine.close();
    }
}
