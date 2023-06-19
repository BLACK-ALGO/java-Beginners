import java.util.*;

class smallindex{

    public static int indexOfSmallestElement(double[] array, int sizeOfArray){
       int i, index = 0;
       double minNum = array[0];
        for(i = 0; i < sizeOfArray; i++){
            if(array[i] < minNum){
                minNum = array[i];
                index = i;
            }
        }
        return index;
    }

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int sizeOfArray, i, j, count =  1;
        
        System.out.print("How many number do you want to input: ");
        sizeOfArray = input.nextInt();

        // Array decleration
        
        double [] numbers = new double[sizeOfArray];
        System.out.println(" Enter the numbers");

        for(i = 0; i < numbers.length; i++){
            numbers[i] = input.nextDouble();
        }

        System.out.print("The index is " + indexOfSmallestElement(numbers, sizeOfArray));
    }
}
