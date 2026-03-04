package application;

import entities.Estudante;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Estudante estudante = new Estudante();

        System.out.println("Por favor, digite seu nome: ");
        estudante.name = sc.nextLine();
        System.out.println("Por favor, digite a nota 1");
        estudante.nota_1 = sc.nextDouble();
        System.out.println(estudante.nota_1);
        System.out.println("Por favor, digite a nota 2");
        estudante.nota_2 = sc.nextDouble();
        System.out.println(estudante.nota_2);
        System.out.println("Por favor, digite a nota 3");
        estudante.nota_3 = sc.nextDouble();
        System.out.println(estudante.nota_3);

        if ( estudante.nota_final() < 60){
            System.out.println("REPROVADO!");
            System.out.println("Faltam: " + (60 - estudante.nota_final()) + " Pontos" );
        } else {
            System.out.println("Aprovado!");
        }
    }
}
