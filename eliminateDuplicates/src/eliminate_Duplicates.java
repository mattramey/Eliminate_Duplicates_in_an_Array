import java.util.Scanner;

public class eliminate_Duplicates {

    public static void main(String[] args) throws Exception {
// get input from the user for 10 integer values and store in an array
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Please Enter 10 Numbers with no decimal place:");

            int[] number = new int [10];

            for (int i = 0; i < number.length; i++){
                number[i] = input.nextInt();

            }
// eliminate duplicates and put the distinct numbers in another array
            int[] eliminate_Duplicates = eliminateDuplicates(number);
            System.out.println("The disinct numbers are: ");
            
            for(int numbers : eliminate_Duplicates){
                System.out.println(numbers + " ");
            }
        }


    }
// method that returns the new array
    public static int[] eliminateDuplicates(int[] list) {

        int [] distinctList = new int [list.length];
        int distinctCount = 0;
        
        for( int number : list){
            boolean isDuplicate = false;

// check if the number is in the distinct list

        for (int i = 0; i < distinctCount; i++) {
            if (distinctList[i] == number){
                isDuplicate = true;
                break;
            }
        
        }
// if the number is not a duplicate add it to distinct list
        if (!isDuplicate){
            distinctList[distinctCount]= number;
            distinctCount++;

          }
        }

// create a new array for distinctCount
        int[] result = new int[distinctCount];
        System.arraycopy(distinctList,0, result, 0, distinctCount);

        return result;
    }
}
