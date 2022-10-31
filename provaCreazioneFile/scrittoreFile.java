package provaCreazioneFile;
import java.io.*;

public class scrittoreFile {
    public scrittoreFile(String nomefile)throws IOException{

        PrintWriter output = new PrintWriter(new FileWriter(nomefile));
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Inserire testo da scrivere nel File: ");
        String linea = input.readLine();
        while(!linea.equals("")){
            output.println(linea);
            linea=input.readLine();
        }

        input.close();
        output.close();
    }

}