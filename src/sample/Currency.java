package sample;

/**
 * @author Paul Duschek
 * @version 2.0, 25.11.2020 <- Uebung 8
 */

public class Currency {

    public String sign;
    public double value;

    //getter and setter
    public String getSign()
    {
        return sign;
    }

    public double getValue() {
        return value;
    }

    //constructor
    public Currency(String s, double v)
    {
        this.sign = s;
        this.value = v;
    }
}
