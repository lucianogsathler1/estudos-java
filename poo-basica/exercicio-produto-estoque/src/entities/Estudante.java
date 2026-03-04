package entities;

public class Estudante {
    public String name;
    public double nota_1;
    public double nota_2;
    public double nota_3;

    public double nota_final() {
        return nota_1 + nota_2 + nota_3;

    }
}
