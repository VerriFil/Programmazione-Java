package es19lab;

import java.io.*;

public class writeLines {
    public writeLines(String nomefile) throws IOException{
        //stream di output
        //FileWriter è uno stream di dati che permette di "collegarsi" ad un file di testo in scrittura
        //PrintWriter è uno stream di manipolazione per scrivere righe di testo
        //FileWriter fw = new FileWriter(nomefile);
        //PrintWriter pr = new PrintWriter(fw);
        PrintWriter output =new PrintWriter(new FileWriter(nomefile));

        //stream di input
        //InputStreamReader converte uno stream di byte in uno stream di caratteri
        //BufferedReader è uno stream di manipolazione a caratteri che consente di leggere stringhe
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Inserire il testo da salvare:   ");
        String linea=input.readLine();
        while(!linea.equals("")){
            output.println(linea);
            linea=input.readLine();
        }

        input.close();
        output.close();
    }
}
