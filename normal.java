
package restaurant;

import java.util.*;

public class normal {
  protected String name;
  protected String meat;
  protected String bread;
  protected String addition;
  protected int price;
  protected String m;
  private String b;
  protected String d;
    public normal() {
        
    }
    
    public normal(String name) {
        Scanner input=new Scanner(System.in);
        this.name = name;
        
        System.out.println("Do you want Beef or chicken ??");
        m=input.next();
        this.meat=m;
        if("beef".equals(this.meat)||"Beef".equals(this.meat))
            this.price+=30;
        else
            this.price+=25;
        System.out.println("Do you want white or brown bread?");
        b=input.next();
        this.bread=b;
        if("brown".equals(this.bread)||"Brown".equals(this.bread))
           this.price+=10;
        else 
             this.price+=15;
        System.out.println("Do you want additions (please answer (YES or NO))?"); 
        d=input.next();
       add(d); 
        
    }
   public void add(String d){
         Scanner input=new Scanner(System.in);
      if("YES".equals(d)) {      
          System.out.println("The additions are (Cheese, Tomato, Chips, Drink) \n How much do you want?"); 
          int c=input.nextInt();
          System.out.println("Please write the additions you want : ");
          while(c>0){
              String a=input.next();
              this.addition=a;
              if("Cheese".equals(this.addition)||"cheese".equals(this.addition))
                  price+=10;
              else if ("Chips".equals(this.addition)||"chips".equals(this.addition))
                  price+=5;
              else if ("Drink".equals(this.addition)||"drink".equals(this.addition))
                  price+=10;
              else 
                  price+=5;
              c--;
          }
      }
   }
    public void setName(String name) {
        this.name = name;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public void setAddition(String addition) {
        this.addition = addition;
    }

    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public String getBread() {
        return bread;
    }

    public String getAddition() {
        return addition;
    }
     @Override
 public String toString()
 {
 return (this.name+" Your order is ready "+"the normal burger sandwich price = "+this.price+" L.E");
 }
  
  
}
