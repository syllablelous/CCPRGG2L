/* PROBLEM 2
 * Write a Java program that will read and display in the console the first 5 lines in the file (dummy.txt).
 */
package LabAct1;

import java.io.*;

public class DisplayDummy {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        File inFile = new File("C:\\Users\\WINDOWS 10\\Documents\\Programming Files\\Text Files\\dummy.txt");
        BufferedReader br = new BufferedReader(new FileReader(inFile));

        try {
            String line;
            int num = 0;
            while((line = br.readLine()) != null){
                if (num < 5) {
                    System.out.println(line);
                }
                else {
                    break;
                }
                num++;
            }
        }
        catch (Exception e) {
            System.out.println("An error has occured in reading the file.");
            System.out.println(e.getMessage());
        }
        finally {
            br.close();
        }
    }
}
