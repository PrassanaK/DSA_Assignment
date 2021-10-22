//******************************************
//Name: Prassana Kamalakanna
//Date Modified: 28/10
//******************************************
import java.util.*;

public class UnitTestNominee
{
    public static void main(String [] args)
    {
        Nominee nominee = new Nominee("WA", 101, "DivNm", "partyAb", "PartyNm", 34235, "Surname", "givenNm", "elected", "HistoricElected");
        
        System.out.println("Testing setStateAb");
        try
        {
            nominee.setStateAb("NSW");
            System.out.println("PASS");
        }
        catch(Exception e)
        {
            System.out.println("FAIL");
        }
    
        System.out.println("Testing setDivId");
        try
        { 
            nominee.setDivId(102);
            System.out.println("PASS");
        }
        catch(Exception e)
        {
            System.out.println("FAIL");
        }

        System.out.println("Testing setDivNm");
        try
        {
            nominee.setDivNm("Banks");
            System.out.println("PASS"); 
        }
        catch(Exception e)
        {
            System.out.println("FAIL");
        }

        System.out.println("Testing setPartyAb");
        try
        {
            nominee.setPartyAb("ALP");
            System.out.println("PASS");
        }
        catch(Exception e)
        {
            System.out.println("FAIL");
        }

        System.out.println("Testing setPartyNm");
        try
        {
            nominee.setPartyNm("ALP Name");
            System.out.println("PASS");
        }
        catch(Exception e)
        {
            System.out.println("FAIL");
        }

        System.out.println("Testing setCandidateId");
        try
        {
            nominee.setCandidateId(435614);
            System.out.println("PASS");
        }
        catch(Exception e)
        {
            System.out.println("FAIL");
        }

        System.out.println("Testing setSurname");
        try
        {
            nominee.setSurname("Jimmy");
            System.out.println("PASS");
        }
        catch(Exception e)
        {
            System.out.println("FAIL");
        }

        System.out.println("Testing setGivenNm");
        try
        {
            nominee.setGivenNm("Kevin");
            System.out.println("PASS");
        }
        catch(Exception e)
        {
            System.out.println("FAIL");
        }

        System.out.println("Testing setElected");
        try
        {
            nominee.setElected("N");
            System.out.println("PASS");
        }
        catch(Exception e)
        {
            System.out.println("FAIL");
        }

        System.out.println("Testing setHistoricElected");
        try
        {
            nominee.setHElected("N");
            System.out.println("PASS");
        }
        catch(Exception e)
        {
            System.out.println("FAIL");
        }

        System.out.println("Testing getStateAb");
        if((nominee.getStateAb()).equals("NSW"))
        {
            System.out.println("PASS");
        }
        else
        { 
            System.out.println("FAIL");
        }

        System.out.println("Testing getDivId");
        if((nominee.getDivID())==(102))
        {
            System.out.println("PASS");
        }
        else
        {
            System.out.println("FAIL");
        }

        System.out.println("Testing getDivNm");
        if((nominee.getDivNm()).equals("Banks"))
        {
            System.out.println("PASS");
        }
        else
        {
            System.out.println("FAIL");
        }

        System.out.println("testing getPartyAb");
        if((nominee.getPartyAb()).equals("ALP"))
        {
            System.out.println("PASS");
        }
        else
        {
            System.out.println("FAIL");
        }

        System.out.println("testing getPartyNm");
        if((nominee.getPartyNm()).equals("ALP Name"))
        {
            System.out.println("PASS");
        }
        else
        {
            System.out.println("FAIL");
        }

        System.out.println("testing getCandId");
        if((nominee.getCandId()) == (435614))
        {
            System.out.println("PASS");
        }
        else
        {
            System.out.println("FAIL");
        }

        System.out.println("testing getSurname");
        if((nominee.getSurname()).equals("Jimmy"))
        {
            System.out.println("PASS");
        }
        else
        {
            System.out.println("FAIL");
        }

        System.out.println("testing getGivenNm");
        if((nominee.getGivenNm()).equals("Kevin"))
        {
            System.out.println("PASS");
        }
        else
        {
            System.out.println("FAIL");
        }

        System.out.println("testing getElected");
        if((nominee.getElected()).equals("N"))
        {
            System.out.println("PASS");
        }
        else
        {
            System.out.println("FAIL");
        }

        System.out.println("testing getHistoricElected");
        if((nominee.getHElected()).equals("N"))
        {
            System.out.println("PASS");
        }
        else
        {
            System.out.println("FAIL");
        }
    }
}
