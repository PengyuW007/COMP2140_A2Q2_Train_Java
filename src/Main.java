import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan;
        String filename;

        scan = new Scanner(System.in);
        System.out.println("\nPlease enter the input file name: ");
        filename = scan.nextLine();

        processFile(filename);

    }//end main

    public static void processFile(String filename) {
        BufferedReader inFile;
        String nextLine;
        String tokens[];

        System.out.println("Process file " + filename + "...");

        try{
            inFile = new BufferedReader(new FileReader(filename));
            nextLine = inFile.readLine();

            while(nextLine!=null){

            }

        }catch (Exception e){

        }//end try-catch
    }
}
