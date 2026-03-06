package vri;

public class Corrente {
    private double r1, r2, r3, tt;

    public double getR1() {
        return r1;
    }

    public void setR1(double r1) {
        this.r1 = r1;
    }

    public double getR2() {
        return r2;
    }

    public void setR2(double r2) {
        this.r2 = r2;
    }

    public double getR3() {
        return r3;
    }

    public void setR3(double r3) {
        this.r3 = r3;
    }

    public double getTt() {
        return tt;
    }

    public void setTt(double tt) {
        this.tt = tt;
    }

    public void corrente(){
        double c1 = tt/r1;
        System.out.printf("Corrente 1: %.2fA\n", c1);

        double c2 = tt/r2;
        System.out.printf("Corrente 2: %.2fA\n", c2);

        double c3 = tt/r3;
        System.out.printf("Corrente 3: %.2fA\n", c3);
    };
}
