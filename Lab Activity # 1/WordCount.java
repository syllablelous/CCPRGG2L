/*  PROBLEM 4
 *  Write a Java program that reads a text file and counts the number of words in it. The program should prompt 
 *  the user for the file name and display the number of words in the file.
 */
package LabAct1;

import java.io.*;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) throws IOException, FileNotFoundException{
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter the name of the file (including its extension): ");
        String filename = sc.nextLine();
        String path = "C:\\Users\\WINDOWS 10\\Documents\\Programming Files\\Text Files\\";
        String pathname = path.concat(filename);

        File inFile = new File(pathname);
        FileReader fr = new FileReader(inFile);

        try {
            int words = 0;
            int i;

            while ((i = fr.read()) != -1) {
                char text = (char) i;
                if (text == ' ' || text == '\n') {
                    words++;
                }
            }
            if ((i = fr.read()) != 0) {
                words = words + 1;
            }
            System.out.println("The total amount of words in this file is: " + words);
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
