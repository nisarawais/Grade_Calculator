// Awais Nisar Lakehead U Student ID #: 1110642
// This program allows the user to calculate and display one overall letter grade for the student’s entire academic career.
import java.util.Scanner;

public class GradeCenter

{
    public static void main(String[] args)

    {
        int n = 1; // declaring the value for n
        int numberint = 1; // this will be the number that display on the screen for the course
        String number = "";

        //here is an edit
        
        // actiavtes the scanner for the user to input their response
        Scanner keyboard = new Scanner(System.in);

        //JW edit

        // below here will repeat asking the user to input the student's mark for each of the course 6 times which means
        // that the student is entering 6 classes' marks.
        for (int x = 0; x <6; x++)
        {


            if(n == 1)
            {
                numberint = n;
                number = "st";
            }

            else if (n == 2)
            {
                numberint = n;
                number = "nd";
            }

            else if (n == 3)
            {
                numberint = n;
                number = "rd";
            }

            else if (n == 4)
            {
                numberint = n;
                number = "th";
            }

            else if (n == 5)
            {
                numberint = n;
                number = "th";
            }

            else
            {
                numberint = n;
                number = "th";
            }


            // it adds 1 to n for the next course
            n = n + 1;

            System.out.printf("Please enter your grade for %d%s course:  ", numberint, number);
            String gender = keyboard.nextLine();
        }
    }

    public static void coursenumber()
{
    int n = 1;
    int numberint = 0;
    String number = "";

    if(n == 1)
    {
        numberint = n;
        number = "st";
    }

    else if (n == 2)
    {
        numberint = n;
        number = "nd";
    }

    else if (n == 3)
    {
        numberint = n;
        number = "rd";
    }

    else if (n == 4)
    {
        numberint = n;
        number = "th";
    }

    else if (n == 5)
    {
        numberint = n;
        number = "th";
    }

    else
    {
        numberint = n;
        number = "th";
    }
}

}

