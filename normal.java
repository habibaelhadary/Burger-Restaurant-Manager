

package restaurant;

import java.util.*;

 public class normal {
  static Scanner input=new Scanner(System.in);
  protected String name;
  protected String meat;
  protected String bread;
  protected int price;
  protected int[] add={0,10,5,5,10};

   


    public normal(String name,String meat,String bread) {
        
        this.name = name;
        setMeat(meat);
        setBread(bread);
        addition();
    }
    public void addition(){
        System.out.println("Do you want additions (please answer (YES or NO))?"); 
           String  d=input.next();

      if("YES".equals(d)) {   
          System.out.println("The additions are 1) Cheese   2) Tomato   3)Chips    4) Drink "); 
          System.out.println("\"Please write \'0\' when you finish\" ");
     int a=input.nextInt();
     if(a<=4)
        price+=add[a];
     else
              System.out.println("this addition is not exist");
     while(a!=0){ 
       a=input.nextInt();
    if(a<=4)
        price+=add[a];
     else
              System.out.println("this addition is not exist Choose another number");
     }
        
          }
      }
   
    public void setName(String name) {
        this.name = name;
    }

    public void setMeat(String meat) {
        this.meat = meat;
        if("beef".equals(this.meat)||"Beef".equals(this.meat))
            this.price+=30;
        else
            this.price+=25;
    }

    public void setBread(String bread) {
        this.bread = bread;
        if("brown".equals(this.bread)||"Brown".equals(this.bread))
           this.price+=10;
        else 
             this.price+=15;
    }
     public int getPrice() {
        return price;
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

     @Override
    public String toString(){
   
      return ("** the normal burger sandwich price = "+this.price+" L.E");
    } 
  
  
}
