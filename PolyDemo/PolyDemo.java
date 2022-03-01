class PrintDesign {

    void print() {
        for (int i = 0; i < 40; i++) System.out.print("#");
        System.out.println();
    }

    void print(int n) {
        for (int i = 0; i < n; i++) System.out.print("+");
        System.out.println();
    }

    void print(int n, int intergration) {
        for (int i = intergration; i < n; i++) System.out.print("*");
        System.out.println();
    }

    void print(int n, int intergration, char ch) {
        for (int i = intergration; i < n; i++) System.out.print(ch);
        System.out.println();
    }
}

public class PolyDemo {

    public static void main(String[] args) {
        PrintDesign p1 = new PrintDesign();
        p1.print();
        p1.print(5);
        p1.print(40, 5);
        p1.print(50, 5, 'r');
    }
}
