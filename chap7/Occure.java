import java.util.*;
class Occure{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int sizeOfArray, i, j, count =  1;
        
        System.out.print("How many number do you want to input: ");
        sizeOfArray = input.nextInt();

        // Array decleration
        
        int [] numbers = new int[sizeOfArray];
        boolean [] Isfill = new boolean[sizeOfArray];
        System.out.println(" Enter the numbers");
        for(i = 0; i < numbers.length; i++){
            numbers[i] = input.nextInt();
            Isfill[i] = false;
        }

        for(i = 0; i < numbers.length; i++){
            for(j = i + 1; j < numbers.length ; j++){
                if(numbers[i] == numbers[j]){
                    count++;
                   
                }  


            
        }
            
                if(count > 1){
                 System.out.println(numbers[i] + " occurs " + count + " times");
                
                }else{
                 System.out.println(numbers[i] + " occurs " + count + " time");

                }
           
            count = 1;
        }





    }
}