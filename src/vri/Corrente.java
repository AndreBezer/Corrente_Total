package vri;

public class Corrente {

    // Atributos
    private double r1, r2, r3, tt;

    // Getters e Setters
    public void setR1(double r1) {
        this.r1 = r1;
    }

    public void setR2(double r2) {
        this.r2 = r2;
    }

    public void setR3(double r3) {
        this.r3 = r3;
    }

    public void setTt(double tt) {
        this.tt = tt;
    }

    //Metodos
    public void corrente(){

        // Erro se resistencia = 0
        double c1 = tt/r1;
        double c2 = tt/r2;
        double c3 = tt/r3;

        System.out.printf("Corrente 1: %.2fA%n", c1);
        System.out.printf("Corrente 2: %.2fA%n", c2);
        System.out.printf("Corrente 3: %.2fA%n", c3);
    };
}
