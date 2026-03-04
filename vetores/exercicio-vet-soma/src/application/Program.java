package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        double[] vet = new double[n];

        for ( int i=0; i < n; i++) {
            System.out.println("Digite um numero: ");
            vet[i] = sc.nextDouble();
        }

        System.out.println("VALORES = ");
        for (int i = 0; i < n; i++) {
            System.out.print(vet[i] + " ");
        }
    }
}
