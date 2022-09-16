import java.util.Scanner;

public class Input {
    public static void main (String[]args) {
        Scanner keyboard = new Scanner(System.in);

        int intOne, intTwo;
        //double val = keyboard.nextDouble();
        //String word = keyboard.nextLine();

        System.out.print("Enter an integer :: ");
        intOne = keyboard.nextInt();

        System.out.print("Enter an integer :: ");
        intTwo = keyboard.nextInt();

        System.out.println();
        System.out.println("integer one = " + intOne );
        System.out.println("integer two = " + intTwo );

        //string
        System.out.print("What's your name? ");
        String name = keyboard.nextLine();
        keyboard.nextLine();

        System.out.print("Say something ");
        String word = keyboard.nextLine();

        //double
        System.out.print("Double one ");
        double dOne = keyboard.nextDouble();
        System.out.print("Double two ");
        double dTwo = keyboard.nextDouble();

        //float
        System.out.print("Float one ");
        float fOne = keyboard.nextFloat();
        System.out.print("Float two ");
        float fTwo = keyboard.nextFloat();

        //short
        System.out.print("Short one ");
        short sOne = keyboard.nextShort();
        System.out.print("Short two");
        short sTwo = keyboard.nextShort();





    }
}
