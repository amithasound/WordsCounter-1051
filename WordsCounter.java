import java.io.File;
import java.io.PrintWriter;  
import java.io.*;
import java.util.*;
public class WordsCounter{
public static void main (String [] args) throws IOException{
File myFile = new File("intro.txt");
Scanner fileScan = new Scanner (myFile);
int count = 0;
  while (fileScan.hasNext()) {
            String line = fileScan.nextLine();
            String words[] = line.split(" ");
            count += words.length;      
        }

System.out.println("Total words: " +  count);



   }
}