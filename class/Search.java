import java.util.Scanner;

class Search{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int [] array = new int[5];
        int miss, i;
       


        for(i = 0; i < 5; i++){
            System.out.println("Enter  element at index " + i) ;
            array[i] = input.nextInt();

        }

         System.out.println("Enter  The value to search") ;
         miss = input.nextInt();
         search(array , miss);

        System.out.println("UnSorted Array");
        for(i = 0; i < 5; i++){
            System.out.print(array[i] + " ") ;
            
        }

         
         System.out.println("\nSorted Array");
         int [] newArray = sort(array);
        //  sort(array);
        for(i = 0; i < 5; i++){
            System.out.print(newArray[i] + " ") ;
            
        }

         

    }

    public static void search(int [] arrays, int missN){
        int i;
         boolean index = false;
        for(i = 0; i < 5; i++){
            if(arrays[i] == missN){
                
                index = true;
                break;
            }
         }

        if(index == true){
            System.out.println("the value is at " + i);
        }else{
            System.out.println("-1" );
        }

    }

    public static int[]  sort(int [] array){
        int j, i;
        for(i = 0; i < 5; i++){
            int firtval = array[i];
            for(j = i-1; j >= 0 && array[ j ] > firtval; j --){
                array[ j + 1 ] = array[ j ];
                array[ j ] = firtval;

            }

        }
        return array;

    }
}