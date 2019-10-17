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
        int grade[] = new int [6];

        //here is an edit

        // activates the scanner for the user to input their response
        Scanner keyboard = new Scanner(System.in);

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

            System.out.printf("Please enter your grade for %d%s course:  ", numberint, number);
            grade[x] = keyboard.nextInt();


            while (grade[x] < 0 && grade[x] > 100) {
                System.out.printf("The grade must be in the range of 0-100 %n");
                System.out.printf("Please enter your grade for %d%s course:  ", numberint, number);
                grade[x] = keyboard.nextInt();
            }

            // it adds 1 to n for the next course
            n = n + 1;
        }

        // displaying the grade for each courses and averaging the all courses
        for (int x=0; x <6; x++)
        {
            System.out.printf("The mark for the %d%s course is %d% which is %s%n",numberint,number,grade[x],convertingtoGrade(grade[x]));
        }

        System.out.printf("The average mark is %d% which is %s",averageGrade(grade[x],convertingtoGrade(averageGrade(grade[x]))));


    }

    // matching the percentage to letter grade
    public static String convertingtoGrade (int grade)
    {
        if (grade <= 49)
        {
            return "an E";
        }

        else if (grade <= 54)
        {
            return "a D";
        }

        else if (grade <= 59)
        {
            return "a D+";
        }

        else if (grade <= 64)
        {
            return "a C";
        }

        else if (grade <= 69)
        {
            return "a C+";
        }

        else if (grade <= 74)
        {
            return "a B";
        }

        else if (grade <= 79)
        {
            return "a B+";
        }

        else if (grade <= 89)
        {
            return "an A";
        }

        // for grade 90% and over
        else
        {
            return "an A+";
        }
    }

    public static double averageGrade(int grade1, int grade2, int grade3, int grade4,int grade5, int grade6)
    {
        return (double) (grade1+grade2+grade3+grade4+grade5+grade6)/6;
    }

}

