import java.io.*;
public class Chars
{
    public static void main(String[] args) throws IOException
    {
        FileReader sourceStream = null;
        try
        {
            sourceStream = new FileReader("test.txt");
              
            int temp;
            while ((temp = sourceStream.read()) != -1)
                 System.out.println((char)temp);
        }
        finally
        {             
            if (sourceStream != null)            
                sourceStream.close();         
        }
    }
}