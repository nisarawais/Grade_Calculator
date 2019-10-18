// Awais Nisar Lakehead U Student ID #: 1110642
// This program allows the user to calculate and display one overall letter grade for the student’s entire academic career.
import java.util.Scanner;

public class GradeCenter

{
    public static void main(String[] args)

    {
        int tracker = 1; // declaring the value for tracker. it helps to identify which number is at
        int numberint = 1; // this will be the number that display on the screen for the course
        String number = "";
        double grade1 = 0;
        double grade2 = 0;
        double grade3= 0;
        double grade4= 0;
        double grade5 = 0;
        double grade6= 0;
        double temporarygrade; // temporarily stores the value for grade


        // activates the scanner for the user to input their response
        Scanner keyboard = new Scanner(System.in);

        // below here will repeat asking the user to input the student's mark for each of the course 6 times which means
        // that the student is entering 6 classes' marks.

        for (int x = 0; x <6; x++)
        {


            if(tracker == 1)
            {
                numberint = tracker;
                number = "st";

                System.out.printf("Please enter your grade for %d%s course:  ", numberint, number);
                temporarygrade = keyboard.nextInt();


                checkerPercentage(temporarygrade,numberint,number);

                grade1 = temporarygrade;

            }

            else if (tracker == 2)
            {
                numberint = tracker;
                number = "nd";

                System.out.printf("Please enter your grade for %d%s course:  ", numberint, number);
                temporarygrade = keyboard.nextInt();


                checkerPercentage(temporarygrade,numberint,number);

                grade2 = temporarygrade;
            }

            else if (tracker == 3)
            {
                numberint = tracker;
                number = "rd";

                System.out.printf("Please enter your grade for %d%s course:  ", numberint, number);
                temporarygrade = keyboard.nextInt();

                checkerPercentage(temporarygrade,numberint,number);
                grade3 = temporarygrade;
            }

            else if (tracker == 4)
            {
                numberint = tracker;
                number = "th";

                System.out.printf("Please enter your grade for %d%s course:  ", numberint, number);
                temporarygrade = keyboard.nextInt();


                checkerPercentage(temporarygrade,numberint,number);

                grade4 = temporarygrade;
            }

            else if (tracker == 5)
            {
                numberint = tracker;
                number = "th";

                System.out.printf("Please enter your grade for %d%s course:  ", numberint, number);
                temporarygrade = keyboard.nextInt();

                checkerPercentage(temporarygrade,numberint,number);

                grade5 = temporarygrade;
            }

            else
            {
                numberint = tracker;
                number = "th";

                System.out.printf("Please enter your grade for %d%s course:  ", numberint, number);
                temporarygrade = keyboard.nextInt();

                checkerPercentage(temporarygrade,numberint,number);


                grade6 = temporarygrade;
            }



            // it adds 1 to tracker for the next course
            tracker = tracker + 1;

        }

        // displaying the grade for each courses and averaging the all courses


        System.out.printf("The mark for the %d%s course is %.1f%% which is %s%n",numberint,number,grade1,convertingtoGrade(grade1));
        System.out.printf("The mark for the %d%s course is %.1f%% which is %s%n",numberint,number,grade2,convertingtoGrade(grade2));
        System.out.printf("The mark for the %d%s course is %.1f%% which is %s%n",numberint,number,grade3,convertingtoGrade(grade3));
        System.out.printf("The mark for the %d%s course is %.1f%% which is %s%n",numberint,number,grade4,convertingtoGrade(grade4));
        System.out.printf("The mark for the %d%s course is %.1f%% which is %s%n",numberint,number,grade5,convertingtoGrade(grade5));
        System.out.printf("The mark for the %d%s course is %.1f%% which is %s%n",numberint,number,grade6,convertingtoGrade(grade6));

        System.out.printf("The average mark is %.1f%% which is %s",averageGrade(grade1,grade2,grade3,grade4,grade5,grade6),convertingtoGrade(averageGrade(grade1,grade2,grade3,grade4,grade5,grade6)));

    }

    // matching the percentage to letter grade
    public static String convertingtoGrade (double grade)
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

    public static double averageGrade(double grade1, double grade2, double grade3, double grade4, double grade5, double grade6)
    {
        return (grade1+grade2+grade3+grade4+grade5+grade6)/6;
    }

    public static double checkerPercentage(double grade, int numberint,String number)
    {
        // activates the scanner for the user to input their response
        Scanner keyboard = new Scanner(System.in);

        while (grade < 0 || grade > 100) {
            System.out.printf("The grade must be in the range of 0-100 %n");
            System.out.printf("Please enter your grade for %d%s course:  ", numberint, number);
            grade = keyboard.nextDouble();
        }

        return grade;

    }

}

