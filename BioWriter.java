import java.io.File;
import java.io.PrintWriter;  
import java.io.*;
import java.util.*;
public class BioWriter{
public static void main (String [] args) throws IOException{
String filePath = "bio.txt";
File myFile = new File(filePath);
PrintWriter outFile = new PrintWriter(myFile);

outFile.println("Name: Amitha Soundararajan");
outFile.println("Major: Computer Science");
outFile.close();






   }
}