import java.util.ArrayList;
import java.util.Scanner;

class Arraylist{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        ArrayList <String> subjectL = new ArrayList <String>();

        String name = "jih" ;
        subjectL.add("Database");
        subjectL.add("Mobile Progamming");
        subjectL.add("Web Programming");
        subjectL.add("Cyber");
        subjectL.add("Network");
        subjectL.add("Information System");
        int i = 0;
        do{
            System.out.println("Enter a name");
                
            
            subjectL.add(name);
            name = input.next();
        i++;
        }while( i < 6);
        
    //    subjectL.add(name);

        System.out.println(subjectL);
        System.out.println(subjectL.get(subjectL.size() - 10));
        System.out.println(subjectL.remove(4));
        subjectL.clear();


         System.out.println(subjectL);
    }

}