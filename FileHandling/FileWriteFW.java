package FileHandling;

import java.io.*;

public class FileWriteFW {
    public static void main(String[] args) throws IOException, FileNotFoundException{
        File outFile = new File("output.txt");
        System.out.println("File path: " + outFile.getAbsolutePath());
        FileWriter fw = new FileWriter(outFile, true); //ADDING TRUE APPENDS THE TEXT IN FW.WRITE TO THE FILE
        
        try{
            fw.write("DON'T LET ME STOP YOU.");
            
        }
        catch(Exception e){
            System.out.println("Error has occured when writing file: " + e.getMessage());
        }
        finally{
            fw.flush();
            fw.close();
        }
    }
}
