//******************************************
//Name: Prassana Kamalakanna
//Date Modified: 28/10
//******************************************
import java.util.*;
public class ReadMarginFile
{
    public static DSALinkedList<FirstPref> readMarginFile(String filename)
    {
        String [] pollList = FileIO.readFile(filename);
        DSALinkedList<FirstPref> firstPrefList = SplitFile.splitForMargin(pollList);
        return firstPrefList;
    }
}
