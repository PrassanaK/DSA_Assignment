import java.util.*;

class Sorts
{
    // bubble sort
    public static Nominee [] nomineeSort(Nominee[] nomineesArray)
    {
        Scanner sc = new Scanner(System.in);
        Nominee [] sortedList = new Nominee[nomineesArray.length];

        System.out.println("Sort by: ");
        System.out.println("1) Surname");
        System.out.println("2) State");
        System.out.println("3) Party");
        System.out.println("4) Division");
        int sortBy = sc.nextInt();

        switch(sortBy)
        {
            case 1:
                sortedList = sortBySurname(nomineesArray);
                break;
            case 2:
                sortedList = sortByState(nomineesArray);
                break;
            case 3:
                sortedList = sortByParty(nomineesArray);
                break;
            case 4:
                sortedList = sortByDiv(nomineesArray);
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
 
        return sortedList;
    }//nomineeSort()

    public static Nominee [] sortBySurname(Nominee [] nomineesArray)
    {
        int pass;
        Nominee temp;
        boolean sorted;
        int count = 0;

        pass = 0;
        do
        {
            sorted = true;
            for (int jj = 0; jj <= (nomineesArray.length-1-pass)-1; jj++)
            {
                if((nomineesArray[jj] != null) && (nomineesArray[jj].getSurname()).compareTo(nomineesArray[jj+1].getSurname())>0)
                {
                    temp = nomineesArray[jj];
                    nomineesArray[jj] = nomineesArray[jj+1];
                    nomineesArray[jj+1] = temp;
                    sorted = false;
                }
            }
            pass = pass + 1;
            count++;
        }while (sorted == false);
        return nomineesArray;
    }

    public static Nominee [] sortByState(Nominee [] nomineesArray)
    {
        int pass;
        Nominee temp;
        boolean sorted;
  
        pass = 0;
        do
        {
            sorted = true;
            for (int ii = 2; ii <= (nomineesArray.length-1-pass)-1; ii++) 
            {
                if((nomineesArray[ii] != null) && (nomineesArray[ii] != null) && ((nomineesArray[ii].getStateAb()).compareTo(nomineesArray[ii+1].getStateAb()))>0)
                {
                    temp = nomineesArray[ii];
                    nomineesArray[ii] = nomineesArray[ii+1];
                    nomineesArray[ii+1] = temp;
                    sorted = false;
                }
            }
            pass = pass + 1;
        }while(sorted == false);
        return nomineesArray;
    }

    public static Nominee [] sortByParty(Nominee [] nomineesArray)
    {
        int pass;
        Nominee temp;
        boolean sorted;
  
        pass = 0;
        do
        {
           sorted = true;
           for(int kk = 2; kk <= (nomineesArray.length-1-pass)-1; kk++)
           {
               if((nomineesArray[kk] != null) && ((nomineesArray[kk].getPartyAb()).compareTo(nomineesArray[kk+1].getPartyAb()))>0)
               {
                   temp = nomineesArray[kk];
                   nomineesArray[kk] = nomineesArray[kk+1];
                   nomineesArray[kk+1] = temp;
                   sorted = false;
               }
           }
        }while(sorted == false);
        return nomineesArray;
    }
    
    public static Nominee [] sortByDiv(Nominee [] nomineesArray)
    {
        int pass;
        Nominee temp;
        boolean sorted;
  
        pass = 0;
        do
        {
            sorted = true;
            for(int ll = 2; ll <= (nomineesArray.length-1-pass)-1; ll++)
            {
                if((nomineesArray[ll] != null) && (nomineesArray[ll].getDivID()) > (nomineesArray[ll+1].getDivID()))
                {
                    temp = nomineesArray[ll];
                    nomineesArray[ll] = nomineesArray[ll+1];
                    nomineesArray[ll+1] = temp;
                    sorted = false;
                }
            }
            pass = pass +1;
        }while (sorted == false);
        return nomineesArray;
    }
}//end Sorts calss
