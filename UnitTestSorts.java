//******************************************
//Name: Prassana Kamalakanna
//Date Modified: 28/10
//******************************************
import java.util.*;
public class UnitTestSorts
{

    public static void main(String [] args)
    {
        Nominee nominee1 = new Nominee("WA", 1, "DivNm1", "ALP", "PartyNm1", 1, "Surname1", "givenNm1", "N", "N");
     
        Nominee nominee2 = new Nominee("NSW", 2, "DivNm2", "FCC", "PartyNm2", 2, "Surname2", "givenNm2", "N", "N");

        Nominee nominee3 = new Nominee("ADC", 3, "DivNm3", "SA", "PartyNm3", 3, "Surname3", "givenNm3", "N", "N");

        Nominee [] sortedArray;    
 
        Nominee [] nomineeArray = {nominee1, nominee2, nominee3};
    
        System.out.println("Testing sortBySurname");
        try
        {
            sortedArray = Sorts.sortBySurname(nomineeArray);
            System.out.println("PASS");
        }
        catch(Exception e)
        {
            System.out.println("FAIL");
        }

        System.out.println("Testing sortByState");
        try
        {
            sortedArray = Sorts.sortByState(nomineeArray);
            System.out.println("PASS");
        }
        catch(Exception e)
        {
            System.out.println("FAIL");
        }
 
        System.out.println("Testing sortByParty");
        try
        {
            sortedArray = Sorts.sortByParty(nomineeArray);
            System.out.println("PASS");
        }
        catch(Exception e)
        {
            System.out.println("FAIL");
        }
    }
}

