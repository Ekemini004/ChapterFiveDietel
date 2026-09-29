import java.util.Scanner;

public class SumOfMultiplesOfThree{

public static void main(String[] args){

Scanner input = new Scanner(System.in));

  int sum = 0;

   System.out.println("enter a number between 1 and 100");
   int userNumber = input.nextInt();

  for(int index = 1; index <= userNumber;  index++ ){
    
       sum += index;
        
    }
   
    System.out.pritnln(sum);




}



}
