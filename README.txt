Name: Prassana Kamalakannan
Date: 29/10/2018

First Compile the code using the command javac *.java

In order to run the program, you must use the command java Main.

If class is called x, then the test harness for that class will be called UnitTestx. To run test harness, use command, java UnitTestx.

The Main, class simply initiates the program by calling the mainMenu function from the Menu class.

The Menu class contains methods to display a menu where you can choose from different options, list nominees, search nominees, list nominees by margin, and Display the itinerary by margin
- The filterNominees gives you the option to filter the list by different attributes and then displays the list
- nomineeSearch gives you the option to search a nominee or nominees by entering part of their surname and then filtering the list like in the previous method.
- listByMargin, calculates the marginal seat for each party and displays all marginal seats within a threshold.

The Nominee class is a regular container class that creates objects from each line of the nominees. 

The ReadMarginClass contains only one method that splits a read in Margin file and then exports a linked list of objects made from the read lines.

The sorts class, contains a method that displays a menu which lets you choose how you want to sort the nominees.
- The sortBySurname method compares the surnames of each nominee and sorts them in ascending order.
- The sortByParty method compares the partyAbbreviations of each nominee and sorts them in ascending order.
- The sortByDivision method compares the division IDs of each nominee and sorts them in ascending order.

The SplitFile class contains methods to split the read in files into its individual elements in order to create objects.

The DSAGraph was meant to be used for part 4 of the assignment which was displaying the itinerary but I couldn't due to time constraints.
-It contains methods that implicitly defines a graph.

DSALinkedList is a class that contains generic methods to create a list of any elements of any datatype or object.

