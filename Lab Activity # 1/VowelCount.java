/*  PROBLEM 3
 `  Write a Java program that will count all the vowels (small or big) in the first 5 lines of dummy.txt.
 */
package LabAct1;

import java.io.*;

public class VowelCount {
    public static void main(String[] args) throws IOException, FileNotFoundException{
        File inFile = new File("C:\\Users\\WINDOWS 10\\Documents\\Programming Files\\Text Files\\dummy.txt");
        FileReader fr = new FileReader(inFile);

        try {
            int vowels = 0;
            int i;
            int line = 0;
                    
            while ((i = fr.read()) != -1) {
                char text = (char) i;
                if (text == '\n'){
                    line++;
                }
                if (line < 5) {
                    if (i == 'a' || i == 'A' || i == 'e' || i == 'E' || i == 'i' || i == 'I' || i == 'o' || i == 'O' || i == 'u' || i == 'U') {
                        vowels++;
                    }
                }    
                     
                else {
                    break;
                }
            }
            System.out.println("The total number of all vowels found in the file is: " + vowels);
        }

        catch (Exception e) {
            System.out.println("There was an error in handling the file: ");
            System.out.println(e.getMessage());
        }

        finally {
            fr.close();
        }
    }
}
