
package restaurant;

import java.util.Scanner;


public class Restaurant {

    public static void main(String[] args) {
          System.out.println("Welcome to our restaurant ...");
          System.out.println("We offer three types of sandwiches..");
          System.out.println("1-Normal burger sandwich \n 2-Healthy Burger \n  3-Deluxe Burger ");
          System.out.println("Please enter the number of your favorite sandwich!!... ");
            Scanner input=new Scanner(System.in);
            int n=input.nextInt();
            System.out.println("Please enter your name :  ");
            String name=input.next();
            
            if(n==1)
            {
                normal m=new normal(name);
                System.out.println(m);
            }
          
            else if(n==2)
            {
                healthy m=new healthy(name);
                System.out.println(m);
            }
            else if(n==3)
            {
                Deluxe m=new Deluxe(name);
                System.out.println(m);
            }
            else System.out.println("the order does not exist.");
    }
    
}
