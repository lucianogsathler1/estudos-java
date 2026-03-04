package util;

public class Dolar {

    public static double IOF = 0.06;

    public static double CurrencyConverter(double quant, double dolar){
        return (quant * dolar) * (1 + IOF);

        

    }

}
