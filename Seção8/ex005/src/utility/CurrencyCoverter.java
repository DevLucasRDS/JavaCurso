package utility;

public class CurrencyCoverter {

    public static final double IOF = 0.06;

    public static double coverter(double dollar_price,double dollar_buy){
        return dollar_buy * dollar_price * (1.0+ IOF);
    }
}
