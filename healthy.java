
package restaurant;

import java.util.*;

public class healthy extends normal{

    public healthy() {
        super();
    }

    public healthy(String name) {
           Scanner input=new Scanner(System.in);
        this.name = name;
        
        System.out.println("Do you want Beef or chicken ??");
        m=input.next();
        this.meat=m;
        if("beef".equals(this.meat)||"Beef".equals(this.meat))
            this.price+=30;
        else
            this.price+=25;
        this.bread="Brown";
        this.price+=10;
        System.out.println("Do you want additions (please answer (YES or NO))? \n But you are allowed two additions from the available additions "); 
        d=input.next();
       add(d); 
    }
    @Override
 public String toString()
 {
 return (this.name+" Your order is ready "+"the Healthy Burger price = "+this.price+" L.E");
 }
  
}
