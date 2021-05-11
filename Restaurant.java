
package restaurant;

 import java.util.Scanner;


 public class Restaurant {
     
    static Scanner input=new Scanner(System.in); 
    
    public static String meat(){ 
       System.out.println("Do you want Beef or chicken ??");
       String m=input.next();
       return m;
    }
    
    public static String bread(){ 
      System.out.println("Do you want white or brown bread?");
      String b=input.next();
      return b;
    }
    
    public static void print(normal[]arr){
        int sum=0;
        System.out.println(arr[0].getName()+" Your order is ready " );
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            sum+=arr[i].getPrice();
        }
        System.out.println("the total price is "+sum);
    }
             
         
     
    public static void main(String[] args) {
        System.out.println("Welcome to our restaurant ...");
           System.out.println("Please enter your name :  ");
        
        String name=input.nextLine();
        System.out.println("We offer three types of sandwiches..");
        
        System.out.println("Please enter number of sandwiches you want  :  ");   
        
        int x=input.nextInt();
        
       System.out.println("1) Normal burger sandwich  \n 2) Healthy Burger (With brown bread)\n  3) Deluxe Burger (With beef meat,brown bread and (chips&drink))");
          
          
          
       normal [] arr = new normal[x];
       for (int i = 0; i <x; i++) {
    
       System.out.println("Please enter sandwich number you want Is in the list : "+"\n {"+(i+1)+" sandwich}");
       int n=input.nextInt();
       
      if(n==1)
 
        arr[i]= new normal(name,meat(),bread());
                 
     else if(n==2)
 
        arr[i]=new healthy(name,meat());
        

     else if(n==3)

       arr[i]=new Deluxe(name);

     else 
         System.out.println("the order does not exist.");
    }
    print(arr);
 }
    
 }
 