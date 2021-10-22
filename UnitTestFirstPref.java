//******************************************
//Name: Prassana Kamalakanna
//Date Modified: 28/10
//******************************************
import java.util.*;

public class UnitTestFirstPref
{
    public static void main(String [] args)
    {
        FirstPref firstPref = new FirstPref("WA", 101, "DivNm", 123, "pollingPlace1", 34235, "Surname", "givenNm", 456, "Elected", "HistoricElected", "PartyAb", "PartyNm", 789, 10.0);
        
        System.out.println("Testing setStateAb");
        try
        {
            firstPref.setStateAb("NSW");
            System.out.println("PASS");
        }
        catch(Exception e)
        {
            System.out.println("FAIL");
        }
    
        System.out.println("Testing setDivId");
        try
        { 
            firstPref.setDivId(102);
            System.out.println("PASS");
        }
        catch(Exception e)
        {
            System.out.println("FAIL");
        }

        System.out.println("Testing setDivNm");
        try
        {
            firstPref.setDivNm("Banks");
            System.out.println("PASS"); 
        }
        catch(Exception e)
        {
            System.out.println("FAIL");
        }

        System.out.println("Testing setPartyAb");
        try
        {
            firstPref.setPartyAb("ALP");
            System.out.println("PASS");
        }
        catch(Exception e)
        {
            System.out.println("FAIL");
        }

        System.out.println("Testing setPartyNm");
        try
        {
            firstPref.setPartyNm("ALP Name");
            System.out.println("PASS");
        }
        catch(Exception e)
        {
            System.out.println("FAIL");
        }

        System.out.println("Testing setCandidateId");
        try
        {
            firstPref.setCandidateID(435614);
            System.out.println("PASS");
        }
        catch(Exception e)
        {
            System.out.println("FAIL");
        }

        System.out.println("Testing setSurname");
        try
        {
            firstPref.setSurname("Jimmy");
            System.out.println("PASS");
        }
        catch(Exception e)
        {
            System.out.println("FAIL");
        }

        System.out.println("Testing setGivenNm");
        try
        {
            firstPref.setGivenNm("Kevin");
            System.out.println("PASS");
        }
        catch(Exception e)
        {
            System.out.println("FAIL");
        }

        System.out.println("Testing setElected");
        try
        {
            firstPref.setElected("N");
            System.out.println("PASS");
        }
        catch(Exception e)
        {
            System.out.println("FAIL");
        }

        System.out.println("Testing setHistoricElected");
        try
        {
            firstPref.setHistElected("N");
            System.out.println("PASS");
        }
        catch(Exception e)
        {
            System.out.println("FAIL");
        }

        System.out.println("Testing setPollingPlaceID");
        try
        {
            firstPref.setPollPlaceID(246);
            System.out.println("PASS");
        }
        catch(Exception e)
        {
            System.out.println("FAIL");
        }

        System.out.println("Testing setPollingPlace");
        try
        {
            firstPref.setPollingPlace("pollingPlace2");
            System.out.println("PASS");
        }
        catch(Exception e)
        {
            System.out.println("FAIL");
        }

        System.out.println("GETTER--Testing getStateAb--GETTER");
        if((firstPref.getStateAb()).equals("NSW"))
        {
            System.out.println("PASS");
        }
        else
        { 
            System.out.println("FAIL");
        }

        System.out.println("Testing setBallotPosition");
        try
        {
            firstPref.setBallotPosition(135);
            System.out.println("PASS");
        }
        catch(Exception e)
        {
            System.out.println("FAIL");
        }

        System.out.println("Testing setOrdinaryVotes");
        try
        {
            firstPref.setOrdinaryVotes(579);
            System.out.println("PASS");
        }
        catch(Exception e)
        {
            System.out.println("FAIL");
        }

        System.out.println("Testing setSwing");
        try
        {
            firstPref.setSwing(5.0);
            System.out.println("PASS");
        }
        catch(Exception e)
        {
            System.out.println("FAIL");
        }

        System.out.println("Testing getDivId");
        if((firstPref.getDivID())==(102))
        {
            System.out.println("PASS");
        }
        else
        {
            System.out.println("FAIL");
        }

        System.out.println("Testing getDivNm");
        if((firstPref.getDivNm()).equals("Banks"))
        {
            System.out.println("PASS");
        }
        else
        {
            System.out.println("FAIL");
        }

        System.out.println("testing getPartyAb");
        if((firstPref.getPartyAb()).equals("ALP"))
        {
            System.out.println("PASS");
        }
        else
        {
            System.out.println("FAIL");
        }

        System.out.println("testing getPartyNm");
        if((firstPref.getPartyName()).equals("ALP Name"))
        {
            System.out.println("PASS");
        }
        else
        {
            System.out.println("FAIL");
        }

        System.out.println("testing getCandId");
        if((firstPref.getCandidateID()) == (435614))
        {
            System.out.println("PASS");
        }
        else
        {
            System.out.println("FAIL");
        }

        System.out.println("testing getSurname");
        if((firstPref.getSurname()).equals("Jimmy"))
        {
            System.out.println("PASS");
        }
        else
        {
            System.out.println("FAIL");
        }

        System.out.println("testing getGivenNm");
        if((firstPref.getGivenNm()).equals("Kevin"))
        {
            System.out.println("PASS");
        }
        else
        {
            System.out.println("FAIL");
        }

        System.out.println("testing getElected");
        if((firstPref.getElected()).equals("N"))
        {
            System.out.println("PASS");
        }
        else
        {
            System.out.println("FAIL");
        }

        System.out.println("testing getHistoricElected");
        if((firstPref.getHistElected()).equals("N"))
        {
            System.out.println("PASS");
        }
        else
        {
            System.out.println("FAIL");
        }

        System.out.println("testing getPollPlaceID");
        if((firstPref.getPollPlaceID())==(246))
        {
            System.out.println("PASS");
        }
        else
        {
            System.out.println("FAIL");
        }

        System.out.println("testing getPollingPlace");
        if((firstPref.getPollingPlace()).equals("pollingPlace2"))
        {
            System.out.println("PASS");
        }
        else
        {
            System.out.println("FAIL");
        }

        System.out.println("testing getBallotPosition");
        if((firstPref.getBallotPosition())==(135))
        {
            System.out.println("PASS");
        }
        else
        {
            System.out.println("FAIL");
        }

        System.out.println("testing getOrdinaryVotes");
        if((firstPref.getOrdinaryVotes())==(579))
        {
            System.out.println("PASS");
        }
        else
        {
            System.out.println("FAIL");
        }

        System.out.println("testing getSwing");
        if((firstPref.getSwing())==(5.0))
        {
            System.out.println("PASS");
        }
        else
        {
            System.out.println("FAIL");
        }
    }
}
