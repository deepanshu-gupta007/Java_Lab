import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader; 
import java.io.IOException; 
public class MyFileProg {
    public static void main(String a[]){ 
        BufferedReader br=null;
        String revword, strLine=""; 
        int c=0;
        try {
            br=new BufferedReader(new FileReader("MyFile.txt"));
            while((strLine=br.readLine()) != null) {
                System.out.println(strLine); 
                String st[]=strLine.split(" "); 
                for(String tmp:st) {
                    StringBuffer data=new StringBuffer(tmp); 
                    data.reverse();
                    revword=data.toString();
                    if(tmp.equalsIgnoreCase(revword))
                        c++;
                }
            }
            System.out.println("Total number of palindrome = "+c); 
            br.close();
        }
        catch (FileNotFoundException e) { 
            System.err.println("File not found");
        }
        catch (IOException e) {
            System.err.println("Unable to read the file.");
        }
    }
}
