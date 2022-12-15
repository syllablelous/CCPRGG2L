package FileHandling;

import java.io.File;
import java.io.IOException;

public class FileHandling_ {
    public static void main(String[] args) throws IOException {
        File file = new File("ïnput.txt");
        
        try{
            if(!file.exists()) {
                // This code runs in the case where input.txt file is not yet created
                // To which, it will generate the file.
                file.createNewFile();
                System.out.println(file.getName() + " successfully created!");
                System.out.println(file.getAbsolutePath());
            }
            else {
                // This code runs in the case where in input.txt file already exists
                // To which, it will delete the file
                System.out.println(file.getName() + " already exists.");
                System.out.println(file.getAbsolutePath());
                System.out.println(file.length());
                file.delete();
                System.out.println("File already deleted.");
            }
        }
        catch(IOException e) {
            System.out.println("There is an error: ");
            System.out.println(e.getMessage());
        }
    }
}
/*
createNewFile - creates an empty file.
delete - deletes an existing file
exists - checks if the file exists.
getName - returns the name of the file.
getAbsolutePath - returns the file path.
length - returns the size of the file in bytes.
*/
