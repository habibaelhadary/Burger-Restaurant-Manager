
package restaurant;

public class Deluxe extends normal{

    public Deluxe() {
        super();
    }
    public Deluxe(String name) {
      this.name=name; 
      this.bread="white";
      this.meat="beef";
      this.price=60;
    }
     @Override
 public String toString()
 {
 return (this.name+" Your order is ready "+"the Deluxe Burger sandwich price = "+this.price+" L.E");
 }
    
}
