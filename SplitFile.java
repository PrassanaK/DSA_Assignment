//******************************************
//Name: Prassana Kamalakanna
//Date Modified: 28/10
//******************************************
import java.util.*;
public class SplitFile
{
    public static DSALinkedList<Nominee> splitCandidateFile(String [] nomineeList)
    {
        Scanner sc = new Scanner(System.in);
        String [] nomineeDetails1 = new String[4];
        String nomineeDetails2 = "";
        String [] nomineeDetails3 = new String[5];
        String [] nomineeFragments = new String[3];
        String [] nomineeDetails = new String[10];

        DSALinkedList<Nominee> nomineesLinkedList = new DSALinkedList<Nominee>();

        for(int i = 2; i < nomineeList.length; i++)
        {
            if(nomineeList[i].contains("\""))
            {
                nomineeFragments = nomineeList[i].split("\"");
                nomineeDetails1 = nomineeFragments[0].split(",");    
                nomineeDetails2 = nomineeFragments[1];
                nomineeDetails3 = (nomineeFragments[2].substring(1)).split(",");
                int divisionID = Integer.parseInt(nomineeDetails1[1]);
                int candidateID = Integer.parseInt(nomineeDetails3[0]);
                Nominee n = new Nominee(nomineeDetails1[0], divisionID, nomineeDetails1[2], nomineeDetails1[3], nomineeDetails2, candidateID, nomineeDetails3[1], 
                                                                                                  nomineeDetails3[2], nomineeDetails3[3], nomineeDetails3[4]);
                nomineesLinkedList.insertLast(n);
            }
            else
            {
                nomineeDetails = nomineeList[i].split(",");
                int divisionID = Integer.parseInt(nomineeDetails[1]);
                int candidateID = Integer.parseInt(nomineeDetails[5]);
                Nominee n = new Nominee(nomineeDetails[0], divisionID, nomineeDetails[2], nomineeDetails[3], nomineeDetails[4], candidateID, nomineeDetails[6], 
                                                                                                  nomineeDetails[7], nomineeDetails[8], nomineeDetails[9]);
                nomineesLinkedList.insertLast(n);
            }
        }//Bracket for the for loop
        return nomineesLinkedList;
    }

    public static DSALinkedList<FirstPref> splitForMargin(String [] pollList)
    {
        Scanner sc = new Scanner(System.in);
        String [] pollDetails = new String[16];
        String [] pollDetails1 = new String[12];
        String partyName = "";
        String [] pollDetails2 = new String[2];
        String [] pollFragments = new String[3];

        DSALinkedList<FirstPref> pollLinkedList = new DSALinkedList<FirstPref>();

        for(int j = 2; j < pollList.length; j++)
        {
            if(pollList[j].contains("\""))
            {
                pollFragments = pollList[j].split("\"");
                pollDetails1 = pollFragments[0].split(",");
                int divID = Integer.parseInt(pollDetails1[1]);
                int pollingID = Integer.parseInt(pollDetails1[3]);
                int candidateID = Integer.parseInt(pollDetails1[5]);
                int ballotPosition = Integer.parseInt(pollDetails1[8]);
                partyName = pollFragments[1];
                pollDetails2 = (pollFragments[2].substring(1)).split(",");
                int ordinaryVotes = Integer.parseInt(pollDetails2[0]);
                double swing = Double.parseDouble(pollDetails2[1]);
                FirstPref f = new FirstPref(pollDetails1[0], divID, pollDetails1[2], pollingID, pollDetails1[4], candidateID, pollDetails1[6], pollDetails1[7], ballotPosition, pollDetails1[9], pollDetails1[10], 
                                                                                       pollDetails1[11], partyName, ordinaryVotes, swing);
                pollLinkedList.insertLast(f);
            }
            else
            {
                pollDetails = pollList[j].split(",");
                int divID = Integer.parseInt(pollDetails[1]);
                int pollingID = Integer.parseInt(pollDetails[3]);
                int candidateID = Integer.parseInt(pollDetails[5]);
                int ballotPosition = Integer.parseInt(pollDetails[8]);
                partyName = pollDetails[12];
                int ordinaryVotes = Integer.parseInt(pollDetails[13]);
                double swing = Double.parseDouble(pollDetails[14]);
                FirstPref f = new FirstPref(pollDetails[0], divID, pollDetails[2], pollingID, pollDetails[4], candidateID, pollDetails[6], pollDetails[7], ballotPosition, pollDetails[9], pollDetails[10], pollDetails[11], partyName,
                                                                                                                                                                                     ordinaryVotes, swing);
                pollLinkedList.insertLast(f);
            }
        }                
        return pollLinkedList;
    }
}
