package ID;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortingAlphabetically {
    public static void Sort() throws IOException {
 
    	BufferedReader reader  = new BufferedReader(new FileReader("sc.text"));
    	PrintWriter outputStream  = new PrintWriter(new FileWriter("Buffersc"));
        ArrayList<String> rows = new ArrayList<String>();

        try {
            String file;
            while ((file = reader .readLine()) != null) {
                rows.add(file);
            }
            Collections.sort(rows);
            String[] strArr= rows.toArray(new String[0]);
            for (String cur : strArr)
                outputStream.println(cur);
            
            System.out.println("File sorted!!");
        } 
        	finally {
            if (reader  != null) {
                reader.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
   
    }
   

}


