import java.io.*;
import java.util.*;
public class CopyImage{
public static void main (String [] args) throws IOException{
    FileInputStream in = new FileInputStream("image.png");
    FileOutputStream out = new FileOutputStream("image_copy.png");
        
        int c;
        while ((c = in.read()) != -1){
            out.write(c);
        }
        
        in.close();
        out.close();
   }
}