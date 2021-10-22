//******************************************
//Name: Prassana Kamalakanna
//Date Modified: 28/10
//******************************************
public class FirstPref
{
    private String stateAb;
    private int divID;
    private String divNm;
    private int pollPlaceID;
    private String pollingPlace;
    private int candidateID;
    private String surname;
    private String givenNm;
    private int ballotPosition;
    private String elected;
    private String historicElected;
    private String partyAb;
    private String partyName;
    private int ordinaryVotes;
    private double swing;

    public FirstPref(String inStateAb, int inDivID, String inDivNm, int inPollPlace, String inPollingPlace, int inCandidateID, String inSurname, String inGivenNm, int inBallotPosition, String inElected, String inHistElected, 
                      String inPartyAb, String inPartyName, int inOrdinaryVotes, double inSwing)
    {
        stateAb = inStateAb;
        divID = inDivID;
        divNm = inDivNm;
        pollPlaceID = inPollPlace;
        pollingPlace = inPollingPlace;
        candidateID = inCandidateID;
        surname = inSurname; 
        givenNm = inGivenNm;
        ballotPosition = inBallotPosition;
        elected = inElected;
        historicElected = inHistElected;
        partyAb = inPartyAb;
        partyName = inPartyName;
        ordinaryVotes = inOrdinaryVotes;
        swing = inSwing;
    }

    public String getStateAb()
    {
        return stateAb;
    }
  
    public int getDivID()
    {
        return divID;
    }

    public String getDivNm()
    {
        return divNm;
    }

    public int getPollPlaceID()
    {
        return pollPlaceID;
    }
    
    public String getPollingPlace()
    {
        return pollingPlace;
    }

    public int getCandidateID()
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

    public int getBallotPosition()
    {
        return ballotPosition;
    }

    public String getElected()
    {
        return elected;
    }

    public String getHistElected()
    {
        return historicElected;
    }

    public String getPartyAb()
    {
        return partyAb;
    }

    public String getPartyName()
    {
        return partyName;
    }

    public int getOrdinaryVotes()
    {
        return ordinaryVotes;
    }

    public double getSwing()
    {
        return swing;
    }
  
    public void setStateAb(String inStateAb)
    {
        stateAb = inStateAb;
    }

    public void setDivId(int inDivID)
    {
        divID = inDivID;
    }

    public void setDivNm(String inDivNm)
    {
        divNm = inDivNm;
    }
   
    public void setPollPlaceID(int inPollPlace)
    {
        pollPlaceID = inPollPlace;
    }

    public void setPollingPlace(String inPollingPlace)
    {
        pollingPlace = inPollingPlace;
    }

    public void setCandidateID(int inCandidateID)
    {
        candidateID = inCandidateID;
    }

    public void setSurname(String inSurname)
    {
        surname = inSurname;
    }

    public void setGivenNm(String inGivenNm)
    {
        givenNm = inGivenNm;
    }
   
    public void setBallotPosition(int inBallotPosition)
    {
        ballotPosition = inBallotPosition;
    }

    public void setElected(String inElected)
    {
        elected = inElected;
    }

    public void setHistElected(String inHistElected)
    {
        historicElected = inHistElected;
    }

    public void setPartyAb(String inPartyAb)
    {
        partyAb = inPartyAb;
    }
  
    public void setPartyNm(String inPartyNm)
    {
        partyName = inPartyNm;
    }

    public void setOrdinaryVotes(int inOrdinaryVotes)
    {
        ordinaryVotes = inOrdinaryVotes;
    }

    public void setSwing(double inSwing)
    {
        swing = inSwing;
    }
} 
