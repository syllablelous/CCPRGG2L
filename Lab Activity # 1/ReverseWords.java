/*  PROBLEM 5
 *  Write a Java program that reads a text file and creates a new file with the same contents but with all the words
 *  in reverse order. The program should prompt the user for the input and output file names. Hint: Use an array.
 */
package LabAct1;

import java.io.*;
import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter the name of the file (including its extension): ");
        String filename = sc.nextLine();

        //You can change the value of this path variable to fit what filepath you have on your computer.
        String path = "C:\\Users\\WINDOWS 10\\Documents\\Programming Files\\Text Files\\"; 
        String pathname = path.concat(filename);

        System.out.println("Please enter the name of the output file (including extension): ");
        String output = sc.nextLine();
        File outFile = new File(output);
        

        File inFile = new File(pathname);
        BufferedReader br = new BufferedReader(new FileReader(inFile));
        FileWriter fw = new FileWriter(outFile, true);
        

        try {
            String line;
            int s;
            String[] rev_words;
             
            while ((line = br.readLine()) != null) {
                String text = (String) line;
                rev_words = text.split(" ");
                
                for (s = rev_words.length - 1; s >= 0; s--) {
                    fw.write(rev_words[s] + " ");
                }
                fw.write("\n");
            }
        }

        catch (Exception e) {
            System.out.println("An error has occured while handling the file: ");
            System.out.println(e.getMessage());
        }

        finally {
            br.close();
            fw.close();
        }
    }
    
}
