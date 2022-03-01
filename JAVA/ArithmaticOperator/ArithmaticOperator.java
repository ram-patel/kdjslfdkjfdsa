public class ArithmaticOperator {

    public static void main(String[] args) {
        short x = 6;
        int y = 10;
        float a = 10.5f;
        float b = 7.3f;

        System.out.println("X : " + x + " Y : " + y);
        System.out.println("X + Y = " + (x + y));
        System.out.println("X - Y = " + (x - y));
        System.out.println("X * Y = " + (x * y));
        System.out.println("X / Y = " + (x / y));

        x = -5;

        System.out.println("X : " + x + " Y : " + y);
        System.out.println("X % Y = " + (x % y));

        y = -10;

        System.out.println("X : " + x + " Y : " + y);
        System.out.println("X % Y = " + (x % y));

        x = 7;
        y = 14;

        System.out.println("X : " + x + " Y : " + y);
        System.out.println("X % Y = " + (x % y));

        System.out.println("A + B = " + (a + b));
        System.out.println("A - B = " + (a - b));
        System.out.println("A * B = " + (a * b));
        System.out.println("A / B = " + (a / b));
        System.out.println("A % B = " + (a % b));
        System.out.println("A / X = " + (a / x));
        System.out.println("A % X = " + (a % b));
    }
}
