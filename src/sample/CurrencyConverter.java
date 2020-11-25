package sample;

import java.util.ArrayList;

/**
 * @author Paul Duschek
 * @version 1.0, 16.11.2020 <- Uebung 7
 * @version 2.0, 25.11.2020 <- Uebung 8
 */

public class CurrencyConverter {

    private ArrayList<Currency> al = new ArrayList<Currency>();

    public CurrencyConverter()
    {
        al.add(new Currency("US-Dollar", 1.19));
        al.add(new Currency("Yen", 124));
    }

    public ArrayList<String> Signs()
    {
        ArrayList<String> list = new ArrayList<String>();
        for(Currency c : al)
        {
            list.add(c.getSign());
        }
        return list;
    }

    public double euroTo(String s, double euro)
    {
        double v = 1;

        for(Currency c : al)
        {
            if(c.getSign().equals(s));
            v = c.getValue();
        }
        return euro * v;
    }

}
