//******************************************
//Name: Prassana Kamalakanna
//Date Modified: 28/10
//******************************************
public class Nominee
{
    private String stateAb;
    private int divisionID;
    private String  divisionNm;
    private String partyAb;
    private String partyNm;
    private int candidateID;
    private String surname;
    private String givenNm;
    private String elected;
    private String historicElected;

    public Nominee(String inStateAb, int inDivID, String inDivNm, String inPartyAb, String inPartyNm, int inCandId, String inSurname, String inGivenNm, String inElected, String hElected)
    {
        stateAb = inStateAb;
        divisionID = inDivID;
        divisionNm = inDivNm;
        partyAb = inPartyAb;
        partyNm = inPartyNm;
        candidateID = inCandId;
        surname = inSurname;
        givenNm = inGivenNm;
        elected = inElected;
        historicElected = hElected;
    }

    public String getStateAb()
    {
        return stateAb;
    }

    public int getDivID()
    {
        return divisionID;
    }

    public String getDivNm()
    {
        return divisionNm;
    }
 
    public String getPartyAb()
    {
        return partyAb;
    }

    public String getPartyNm()
    {
        return partyNm;
    }

    public int getCandId()
    {
        return candidateID;
    }
  
    public String getSurname()
    {
        return surname;
    }
  
    public String getGivenNm()
    {
        return givenNm;
    }
   
    public String getElected()
    {
        return elected;
    }
  
    public String getHElected()
    {
        return historicElected;
    }

    public void setStateAb(String inStateAb)
    {
        stateAb = inStateAb;
    }

    public void setDivId(int inDivID)
    {
        divisionID = inDivID;
    }

    public void setDivNm(String inDivNm)
    {
        divisionNm = inDivNm;
    }
   
    public void setPartyAb(String inPartyAb)
    {
        partyAb = inPartyAb;
    }
 
    public void setPartyNm(String inPartyNm)
    {
        partyNm = inPartyNm;
    }

    public void setCandidateId(int inCandId)
    {
        candidateID = inCandId;
    }
     
    public void setSurname(String inSurname)
    {
        surname = inSurname;
    }
  
    public void setGivenNm(String inGivenNm)
    {
        givenNm = inGivenNm;
    }

    public void setElected(String inElected)
    {
        elected = inElected;
    }

    public void setHElected(String hElected)
    {
        historicElected = hElected;
    }

    @Override
    public String toString()
    {
        String toStr = stateAb +" "+ divisionID +" "+ divisionNm +" "+ partyAb +" "+ partyNm +" "+ candidateID +" "+ surname +" "+ givenNm +" "+ elected +" "+ historicElected;
        return toStr;
    }
}
