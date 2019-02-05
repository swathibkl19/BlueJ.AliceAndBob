import java.util.*;
/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args ){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
       
        if(name.equals("Alice"))
        System.out.println("Hi Alice...");
        else if(name.equals("Bob"))
        System.out.println("Hi Bob...");
        else
        System.out.println("Hi");
        
        
        
   
    }
}
