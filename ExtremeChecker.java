import java.util.Scanner;

    public class Extreme{

        public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers do you want to enter? ");
        int NoOfNUmbers = input.nextInt();

        System.out.print("Enter a number 1: ");
        int userNumber = input.nextInt();


        int smallest = userNumber;
        int largest = userNumber;

        for (int count = 2; count <= number; count++){

            System.out.print("Enter a number " + count + ": ");
            userNumber = input.nextInt();


            if(numbers > largest){
                largest = userNumber;
            }

            if(numbers < smallest){
                smallest = userNumber;
            }

        }

        int sum = smallest + largest;


        System.out.print("Smallest Number: " + smallest);
        System.out.print("Largest Number: " + largest);
        System.out.print("Sum: " + sum);






}}
