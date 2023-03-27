import java.util.*;

class Farmer {
    int pa;// principal amount
    float td;// time duration
    static float ri;// rate of interest
    float si;// simple interest

    static{
        ri=8.5f;
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please mention the amounrt required");
        pa = sc.nextInt();
        System.out.println("Please mention the time duration");
        td = sc.nextFloat();
        // ri=8.5f;
    }

    void compute() {
        si = (pa * ri * td) / 100f;
    }

    void disp() {
        System.out.println("simple interest is:" + si);
    }
}

public class LoanLaunchig {
    public static void main(String[] args) {
        Farmer f1 = new Farmer();
        f1.input();
        f1.compute();
        f1.disp();
        Farmer f2 = new Farmer();

        f2.input();
        f2.compute();
        f2.disp();

    }

}
