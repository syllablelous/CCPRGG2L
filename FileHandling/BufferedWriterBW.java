package FileHandling;

import java.io.*;

public class BufferedWriterBW {
    public static void main(String[] args) throws IOException, FileNotFoundException{
        File outFile = new File("output.txt");
        System.out.println("File path: " + outFile.getAbsolutePath());
        FileWriter fw = new FileWriter(outFile, true); //ADDING TRUE APPENDS THE TEXT IN FW.WRITE TO THE FILE
        BufferedWriter bw = new BufferedWriter(fw);
        
        try{
            bw.write("DON'T LET ME STOP YOU NOW.");
            bw.newLine();
            bw.write("DON'T LET ME STOP YOU.");
            
        }
        catch(Exception e){
            System.out.println("Error has occured when writing file: " + e.getMessage());
        }
        finally{
            bw.flush();
            bw.close();
        }
    }
}
