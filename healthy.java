package restaurant;

import java.util.*;

class healthy extends normal {

    static Scanner input = new Scanner(System.in);

    public healthy(String name, String meat) {
        super(name, meat, "Brown");

    }

    @Override
    public void addition() {
        System.out.println("Do you want additions (please answer (YES or NO))?");
        String d = input.next();

        if ("YES".equals(d)) {
            System.out.println("The additions are 1) Cheese   2) Tomato   ");
            System.out.println("\"Please write \'0\' when you finish\" ");
            int a = input.nextInt();
            if (a <= 2) {
                price += add[a];
            } else {
                System.out.println("this addition is not exist");
            }
            while (a != 0) {
                a = input.nextInt();
                price += add[a];
            }
        }
    }

    @Override
    public String toString() {
        return (this.name + " Your order is ready " + "the Healthy Burger price = " + this.price + " L.E");
    }

}
