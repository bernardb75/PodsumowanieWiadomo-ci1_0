import java.util.Scanner;

public class Trojkat {
    private int a;
    private int b;
    private int c;

    public Trojkat(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) throws Exception {
        if (a >= 0) {
            this.a = a;
        } else throw new Exception();
    }

    public int getB() {
        return b;
    }

    public void setB(int b) throws Exception {
        if (b >= 0) {
            this.b = b;
        } else throw new Exception();
    }

    public int getC() {
        return c;
    }

    public void setC(int c) throws Exception {
        if (c >= 0) {
            this.c = c;
        } else throw new Exception();
    }

    public boolean TrajkatProstokatny() {
        return ((getA() + getB() > getC() && getB() + getC() > getA() && getC() + getA() > getB())) &&
                ((Math.pow(getC(), 2.0) + Math.pow(getB(), 2.0) == Math.pow(getA(), 2.0)));
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        int a = scanner.nextInt();
        System.out.print("b: ");
        int b = scanner.nextInt();
        System.out.print("c: ");
        int c = scanner.nextInt();

        Trojkat trojkat = new Trojkat(a, b, c);
        System.out.println("Trójkąt jest prostokątny ?: "+trojkat.TrajkatProstokatny());
    }
}