/* PROBLEM 1
 * Write a Java program that will read the input file (data.txt) and add all the data in the text. The program
 * will also create a file (sum.txt) and write the sum in the file created.
 */
package LabAct1;

import java.io.*;

public class DataAndSum {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        File inFile = new File("C:\\Users\\WINDOWS 10\\Documents\\Programming Files\\Text Files\\data.txt");
        File outFile = new File("sum.txt");
        BufferedReader br = new BufferedReader(new FileReader(inFile));
        FileWriter fw = new FileWriter(outFile, true);
        BufferedWriter bw = new BufferedWriter(fw);

        try {
            String num;
            int sum = 0;
            while((num = br.readLine()) != null){
                sum += Integer.parseInt(num);
            }
            
            outFile.createNewFile();
            System.out.println(outFile.getName() + " successfully created");
            bw.write("The sum of the numbers in the data.txt file is: " + sum);

        }
        catch (Exception e) {
            System.out.println("There is an error in handling the file: ");
            System.out.println(e.getMessage());
        }
        finally {
            br.close();
            bw.flush();
            bw.close();
        }
    }
}
