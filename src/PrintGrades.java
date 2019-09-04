import java.util.Scanner;

public class PrintGrades {
    public static void main(String[] args) {
        int examScore;              // variable used to convert the inputGrade to an integer.
        String inputGrade;          // variable input using the Scanner class
        String letterGrade;         // letter grade corresponding to the exam grade
        String continueGrades = "Do you want to enter another score (Y/N)?";
        String choice;              // variable to determine whether the user wants to continue.
        boolean gradeEnter = true;  // Boolean value used to manage a while loop.
        String outputGrade;

        Scanner keyboard = new Scanner(System.in);

        while(gradeEnter) {
            /* The user enters a numerical value for a grade. */
            System.out.println("Enter the exam score: ");
            inputGrade = keyboard.nextLine();
            examScore = Integer.parseInt(inputGrade);

            if ( examScore > 97 ) { outputGrade = "Great job!  Your grade is A+."; }
            else if ( examScore > 94 && examScore < 96 ) { outputGrade = "Very good job!  Your grade is an A."; }
            else if ( examScore > 90 && examScore < 93 ) { outputGrade = "Good job!  Your grade is an A-."; }
            else if ( examScore > 87 && examScore < 89 ) { outputGrade = "Boarding on greatness.  Your grade is an B+."; }
            else if ( examScore > 84 && examScore < 86 ) { outputGrade = "Solid!  Your grade is a B."; }
            else if ( examScore > 80 && examScore < 83 ) { outputGrade = "Not bad.  Your grade is a B-."; }
            else if ( examScore > 77 && examScore < 79 ) { outputGrade = "Above average.  Your grade is a C+."; }
            else if ( examScore > 74 && examScore < 76 ) { outputGrade = "Average.  Your grade is a C."; }
            else if ( examScore > 70 && examScore < 73 ) { outputGrade = "Need to work harder.  Your grade is a C-."; }
            else if ( examScore > 60 && examScore < 69 ) { outputGrade = "You are in trouble.  Your grade is a D."; }
            else { outputGrade = "Go back to School, your score was below 60"; }

            System.out.println(outputGrade);

            /*
               Determine whether the user wants to continue or whether they
               want to end the program.  If the user does not enter either a
               "Y"|"y"|"N"|"n", they will receive an error message and the program
               will terminate.
             */
            System.out.println(continueGrades);
            choice = keyboard.nextLine().toUpperCase();
            if ( choice.compareTo("Y") == 0 ) {
                gradeEnter = true;
            }
            else if ( choice.compareTo("N") == 0) {
                gradeEnter = false;
            }
            else {
                System.out.println("You must enter either Y or N.");
                System.out.println("The program will end.");
                gradeEnter = false;
            }
        }
    }
}
