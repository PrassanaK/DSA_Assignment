//******************************************
//Name: Prassana Kamalakanna
//Date Modified: 28/10
//Taken Directly from prac 1. write method removed
//******************************************
import java.util.*;
import java.io.*;
public class FileIO
{
    public static String[] readFile(String inFilename)
    {
         InputStreamReader rdr = null;
         BufferedReader bufRdr = null;
         FileInputStream fileStrm = null;
         String lineArray[] = new String[0];
         int numLines = 0;

         try
         {
            fileStrm = new FileInputStream(inFilename);
            rdr = new InputStreamReader(fileStrm);
            bufRdr = new BufferedReader(rdr);

            String line;

            line = bufRdr.readLine();
            while (line != null)
            {
                numLines = numLines + 1;
                line = bufRdr.readLine();
            }
 
            lineArray = new String[numLines];
     
            fileStrm.close();
            fileStrm = new FileInputStream(inFilename);
            rdr = new InputStreamReader(fileStrm);
            bufRdr = new BufferedReader(rdr);
            for(int ii=0; ii<=(lineArray.length-1); ii++)
            {
                String temp = bufRdr.readLine();
                lineArray[ii] = temp;
            }
            fileStrm.close();
         }
         catch (IOException e)
         {
             if (fileStrm != null)
             {
                 try
                 {
                     fileStrm.close();
                 }//END TRY
                 catch (IOException ex2)
                 {
                 }//END CATCH
             }//ENDIF
         }
         return lineArray;
    }
}
