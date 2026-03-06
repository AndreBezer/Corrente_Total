package vri;

public class Corrente {

    // Atributos
    //Resistencia
    private double r1, r2, r3;
    
    //Tensão
    double tt;

    //corrente
    double c1, c2, c3;

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

        if (r1 == 0){
            this.r1 = 1;
        }

        if (r2 == 0){
            this.r2 = 1;
        }
        
        if (r3 == 0){
            this.r3 = 1;
        }

        // Erro se resistencia = 0 -- Corrigido!
        c1 = tt/r1;
        c2 = tt/r2;
        c3 = tt/r3;

        System.out.printf("%nCorrente 1: %.2fA%n", c1);
        System.out.printf("Corrente 2: %.2fA%n", c2);
        System.out.printf("Corrente 3: %.2fA%n", c3);
    };

    public void total(){
        double req = 0;

        if (tt != 0){
            req = tt/ (c1 + c2 + c3);        
        };

        System.out.printf("%nreq: %.2f%n", req);
    }
}
