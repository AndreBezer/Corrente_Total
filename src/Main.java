import java.util.Locale;
import java.util.Scanner;
import vri.Corrente;

public class Main{
    void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Corrente corrente = new Corrente();
        Locale.setDefault(Locale.US);

        System.out.print("Digite o valor da resistencia 1: ");
        corrente.setR1(sc.nextDouble());

        System.out.print("Digite o valor da resistencia 2: ");
        corrente.setR2(sc.nextDouble());

        System.out.print("Digite o valor da resistencia 3: ");
        corrente.setR3(sc.nextDouble());

        System.out.print("Digite o valor da tensão: ");
        corrente.setTt(sc.nextDouble());

        corrente.corrente();
        corrente.total();
        
        sc.close();
    }
}
