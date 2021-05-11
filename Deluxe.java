
package restaurant;

class Deluxe extends normal {

    public Deluxe(String name) {
        super(name, "beef", "white");
        this.price = 60;
    }

    @Override
    public void addition() {
    }

    @Override
    public String toString() {
        return ( "** the Deluxe Burger sandwich price = " + this.price + " L.E");
    }

}