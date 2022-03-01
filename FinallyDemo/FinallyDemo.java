public class FinallyDemo {

    public static void main(String[] args) {
        String names[] = { "Harry Potter", "Hermione Granger ", "Tadra Potter", "Sirus Black" };
        int num1 = 0, num2 = 5;
        try {
            System.out.println(names[4]);
            double answer = num2 / num1;
        } finally {
            System.out.println("Avada Kedavra !!!!!");
        }
    }
}
