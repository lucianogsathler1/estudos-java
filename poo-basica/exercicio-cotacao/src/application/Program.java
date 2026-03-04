package application;

import util.Dolar;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double quant;
        double dolar;
        System.out.print("What´s is the dollar price?");
        dolar = sc.nextDouble();
        System.out.println(dolar);
        System.out.print("How many dollars will be bought?");
        quant = sc.nextDouble();
        System.out.print("Amount to be paid in reais: ");
        System.out.println(Dolar.CurrencyConverter(quant, dolar));

        sc.close();
    }


}
