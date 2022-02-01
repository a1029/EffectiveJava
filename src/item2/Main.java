package item2;

import static item2.NyPizza.Size.MEDIUM;
import static item2.NyPizza.Size.SMALL;
import static item2.Pizza.Topping.*;


public class Main {

    public static void main(String[] args) {
        Unit marine = new Unit.Builder()
                .power(6)
                .armor(0)
                .hp(50)
                .build();

        NyPizza pizza = new NyPizza.Builder(SMALL)
                .addTopping(SAUSAGE)
                .addTopping(ONION)
                .build();

        Calzone pizza2 = new Calzone.Builder()
                .addTopping(PEPPER)
                .sauceInside()
                .build();
    }
}
