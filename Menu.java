//******************************************
//Name: Prassana Kamalakanna
//Date Modified: 28/10
//******************************************
import java.util.*;
public class Menu
{
    public static void mainMenu()
    {
        Scanner sc = new Scanner(System.in);
        boolean mainLoop = true;

        String [] nomineeList = FileIO.readFile("HouseCandidatesDownload-20499.csv");

        int choice;
        char type;
        do
        {
            System.out.println("Choose option");
            System.out.println("1.) List Nominees"); 
            System.out.println("2.) Nominees Search");
            System.out.println("3.) List by Margin");
            System.out.println("4.) Itinerary by Margin");
            System.out.println("5.) Quit");
            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    filterNominees(nomineeList);
                    break;
                case 2:
                    nomineeSearch(nomineeList);
                    break;
                case 3:
                    listByMargin();
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("System Quitting");
                    break;
                default:
                    System.out.println("Invalid option. Please enter one of the given options");
                    break;
            }
        }while(choice != 5);
    }

    public static void listByMargin()
    {
        Scanner sc = new Scanner(System.in); 

        DSALinkedList<FirstPref> allFirstPrefs = new DSALinkedList<FirstPref>();
        DSALinkedList<FirstPref> pollLinkedList = new DSALinkedList<FirstPref>();
        
        pollLinkedList = ReadMarginFile.readMarginFile("HouseStateFirstPrefsByPollingPlaceDownload-20499-ACT.csv");
        for(FirstPref i : pollLinkedList)
        {
            allFirstPrefs.insertLast(i);
        }
        
        pollLinkedList = ReadMarginFile.readMarginFile("HouseStateFirstPrefsByPollingPlaceDownload-20499-NSW.csv");
        for(FirstPref j : pollLinkedList)
        {
            allFirstPrefs.insertLast(j);
        }
        
        pollLinkedList = ReadMarginFile.readMarginFile("HouseStateFirstPrefsByPollingPlaceDownload-20499-NT.csv");
        for(FirstPref k : pollLinkedList)
        {
            allFirstPrefs.insertLast(k);
        }
        
        pollLinkedList = ReadMarginFile.readMarginFile("HouseStateFirstPrefsByPollingPlaceDownload-20499-QLD.csv");
        for(FirstPref l : pollLinkedList)
        {
            allFirstPrefs.insertLast(l);
        }
        
        pollLinkedList = ReadMarginFile.readMarginFile("HouseStateFirstPrefsByPollingPlaceDownload-20499-SA.csv");
        for(FirstPref m : pollLinkedList)
        {
            allFirstPrefs.insertLast(m);
        }
        
        pollLinkedList = ReadMarginFile.readMarginFile("HouseStateFirstPrefsByPollingPlaceDownload-20499-TAS.csv");
        for(FirstPref n : pollLinkedList)
        {
            allFirstPrefs.insertLast(n);
        }
        
        pollLinkedList = ReadMarginFile.readMarginFile("HouseStateFirstPrefsByPollingPlaceDownload-20499-VIC.csv");
        for(FirstPref o : pollLinkedList)
        {
            allFirstPrefs.insertLast(o);
        }
        
        pollLinkedList = ReadMarginFile.readMarginFile("HouseStateFirstPrefsByPollingPlaceDownload-20499-WA.csv");
        for(FirstPref p : pollLinkedList)
        {
            allFirstPrefs.insertLast(p);
        }

        System.out.println("Enter Party Abreviation: ");
        String party = sc.next();

        for(FirstPref q : allFirstPrefs)
        {
            int votesFor = 0;
            int votesAgainst = 0; 

            if((party.equals(q.getPartyAb())))
            {
                System.out.println(party + " votes " + q.getOrdinaryVotes());
                votesFor = votesFor + q.getOrdinaryVotes();
            }
            else
            {
                System.out.println("Other votes " + q.getOrdinaryVotes());
                votesAgainst = votesAgainst + q.getOrdinaryVotes();
            }

            int totalVotes = votesFor + votesAgainst;
            if(totalVotes !=0)
            {
                double margin = ((votesFor/(votesFor + votesAgainst))*100-50);
    
                if((margin <= 6.0) && (margin >= -6.0))
                {
                    System.out.println("Total for " + votesFor); 
                    System.out.println("Total against " + votesAgainst);
                    System.out.println("Percent " + (votesFor/(votesFor + votesAgainst))*100 + "%");
                    System.out.println("Margin " + margin);
                    System.out.println("");
                }
            }
        }
    }
 
    public static void nomineeSearch(String [] nomineeList)
    {
        Scanner sc = new Scanner(System.in);

        DSALinkedList<Nominee> nomineesLinkedList = new DSALinkedList<Nominee>();

        nomineesLinkedList = SplitFile.splitCandidateFile(nomineeList);

        System.out.print("Enter Part of Candidate Surname: ");
        String inputSubstring  = sc.next();
        System.out.println("");
        
        System.out.println("Filter by:");
        System.out.println("1)State");
        System.out.println("2)Party");
        System.out.println("4)State and Party");
        int filter = sc.nextInt();

        switch(filter)
        {
            case 1: 
                System.out.println("Enter State Abbreviation");
                String input1 = sc.next();
                for(Nominee n : nomineesLinkedList)
                {
                    if((n.getStateAb()).equals(input1) && (n.getSurname()).startsWith(inputSubstring))
                    {
                        System.out.println(n.toString());
                    }
                }
                break;
            case 2:
                System.out.println("Enter Party Abbreviation");
                String input2 = sc.next();
                for(Nominee o : nomineesLinkedList)
                {
                    if((o.getPartyAb()).equals(input2) && (o.getSurname()).startsWith(inputSubstring))
                    {
                        System.out.println(o.toString());
                    }
                }
                break;
            case 4:
                System.out.println("Enter State Abbreviation");
                String input4 = sc.next();
                System.out.println("Enter Party Abbreviation");
                String input5 = sc.next();
                for(Nominee q : nomineesLinkedList)
                {
                    if((q.getStateAb()).equals(input4) && (q.getPartyAb()).equals(input5) && (q.getSurname()).startsWith(inputSubstring))
                        System.out.println(q.toString());
                }
                break;
            default:
                System.out.println("Invalid Option");
                break;
        }   
    }

    public static void filterNominees(String [] nomineeList)
    {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        DSALinkedList<Nominee> nomineesLinkedList = new DSALinkedList<Nominee>();
        DSALinkedList<Nominee> sortedLinkedList = new DSALinkedList<Nominee>();

        nomineesLinkedList = SplitFile.splitCandidateFile(nomineeList);
        Nominee [] nomineesArray = new Nominee[nomineeList.length-2];
        
        for(Iterator<Nominee> iter = nomineesLinkedList.iterator(); iter.hasNext();)
        {
            Nominee temp = iter.next();
            if(temp == null)
            {
                i++;
            }
            else
            {
                nomineesArray[i] = temp;
                i++;
            }
        }

        Nominee [] sortedList = new Nominee[nomineesArray.length];
        sortedList = Sorts.nomineeSort(nomineesArray);

        for(int jj = 0; jj < sortedList.length; jj++)
        {
            sortedLinkedList.insertLast(sortedList[jj]);
        }

        System.out.println("Filter by:");
        System.out.println("1)State");
        System.out.println("2)Party");
        System.out.println("3)Division");
        System.out.println("4)State and Party");
        System.out.println("5)State and Division");
        System.out.println("6)Party and Division");
        System.out.println("7)State Party and Division");
        int filter = sc.nextInt();

        switch(filter)
        {
            case 1: 
                System.out.println("Enter State Abbreviation");
                String input1 = sc.next();
                for(Nominee n : sortedLinkedList)
                {
                    if((n.getStateAb()).equals(input1))
                    {
                        System.out.println(n.toString());
                    }
                }
                break;
            case 2:
                System.out.println("Enter Party Abbreviation");
                String input2 = sc.next();
                for(Nominee o : sortedLinkedList)
                {
                    if((o.getPartyAb()).equals(input2))
                    {
                        System.out.println(o.toString());
                    }
                }
                break;
            case 3:
                System.out.println("Enter Division ID");
                int input3 = sc.nextInt();
                for(Nominee p : sortedLinkedList)
                {
                    if((p.getDivID()) == (input3))
                    {
                        System.out.println(p.toString());
                    }
                }
                break;
            case 4:
                System.out.println("Enter State Abbreviation");
                String input4 = sc.next();
                System.out.println("Enter Party Abbreviation");
                String input5 = sc.next();
                for(Nominee q : sortedLinkedList)
                {
                    if((q.getStateAb()).equals(input4) && (q.getPartyAb()).equals(input5))
                        System.out.println(q.toString());
                }
                break;
            case 5:
                System.out.println("Enter State Abbreviation");
                String input6 = sc.next();
                System.out.println("Enter Division ID");
                int input7 = sc.nextInt();
                for(Nominee r : sortedLinkedList)
                {
                    if((r.getStateAb()).equals(input6) && (r.getDivID()) == (input7))
                    {
                        System.out.println(r.toString());
                    }
                }
                break;
            case 6:
                System.out.println("Enter Party Abbreviation");
                String input8 = sc.next();
                System.out.println("Enter Division ID");
                int input9 = sc.nextInt();
                for(Nominee s : sortedLinkedList)
                {
                    if((s.getPartyAb()).equals(input8) && (s.getDivID()) == (input9))
                    {
                        System.out.println(s.toString());
                    }
                }
                break;
            case 7:
                System.out.println("Enter State Abbreviation");
                String input10 = sc.next();
                System.out.println("Enter Party Abbreviation");
                String input11 = sc.next();
                System.out.println("Enter Division ID");
                int input12 = sc.nextInt();
                for(Nominee t : sortedLinkedList)
                {
                    if((t.getStateAb()).equals(input10) && (t.getPartyAb()).equals(input11) && (t.getDivID()) == (input12))
                    {
                        System.out.println(t.toString());
                    }
                }
                break;
            default:
                System.out.println("Invalid Option");
                break;
        }
    }
}
