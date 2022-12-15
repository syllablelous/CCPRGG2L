package FileHandling;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class FileReading {
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("C:\\Users\\rapirg\\Documents\\NetBeansProjects\\RAPI_IntermediateProgramming\\ïnput.txt");
        Scanner inFile = new Scanner(inputFile);
        
        try{
            while(inFile.hasNextLine()) {
                System.out.println(inFile.nextLine());
            }
            System.out.println("");
        }
        catch(Exception e) {
            System.out.println("An error has occured: " + e.getMessage());
        }
        finally{
            inFile.close();
        }
    }
}
