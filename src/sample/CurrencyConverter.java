package sample;

import java.util.ArrayList;

/**
 * @author Paul Duschek
 * @version 1.0, 16.11.2020 <- Uebung 7
 * @version 2.0, 25.11.2020 <- Uebung 8
 */

public class CurrencyConverter {

    ArrayList<Currency> cl = new ArrayList<Currency>();

    public CurrencyConverter()
    {
        cl.add(new Currency("US-Dollar", 1.19));
        cl.add(new Currency("Yen", 124));
    }

    public ArrayList<String> Signs()
    {
        ArrayList<String> list = new ArrayList<String>();
        for(Currency c : cl)
        {
            list.add(c.getSign());
        }
        return list;
    }

    public String Name(int n){
        return cl.get(n).getSign();
    }

    public double euroTo(String s, double euro)
    {
        Currency v = null;
        for(int x = 0; x < cl.size(); x++)
        {
            if(cl.get(x).getSign().equals(s))
            {
                v = cl.get(x);
            }
        }
        return euro * v.getValue();
    }
}
