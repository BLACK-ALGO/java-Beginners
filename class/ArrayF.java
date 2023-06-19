import java.util.Scanner;

class ArrayF{
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);
        int [] number = new int[5];
         int [] numbers = new int[5];
        int i, sum = 0;
        double Avg;
        System.out.println("Enter array element") ;

        for(i = 0; i < 5; i++){
            System.out.println("Enter  element at index " + i) ;
            number[i] = input.nextInt();


        }

        for(i = 0; i < 5; i++){
            sum += number[i];


        }
         System.out.println("The sum of the element is " + sum) ;

        Avg = sum / 5;
        System.out.println("The average of the element is " + Avg) ;


        System.out.println("Elements greater than " + Avg ) ;
            for(i = 0; i < 5; i++){
                if(number[i] > Avg){
                    System.out.println(number[i]);
                }
            }
        // To copy an array
        System.arraycopy(number,0,numbers,0,number.length);
            for(i = 0; i < 5; i++){
                System.out.print(numbers[i] + " " ) ;

            }





    }
}