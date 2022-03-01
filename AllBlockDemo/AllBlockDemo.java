public class MultipleCatchDemo {

    public static void main(String[] args) {
        String names[] = { "Harry Potter", "Hermione Granger ", "Tadra Potter", "Sirus Black" };
        int num1 = 0, num2 = 5;
        try {
            System.out.println(names[4]);
            double answer = num2 / num1;
        } catch (ArrayIndexOutOfBoundsException errObj) {
            System.out.println("Mai to kidhu tuj '" + errObj + "' aavshe");
        } catch (ArithmeticException errObj) {
            System.out.println("Sumaar " + errObj + " aave che");
        } catch (Exception errObj) {
            System.out.println("Not Agaaaaaaain 😫");
        } finally {
            System.out.println("Avada Kedavra !!!!!");
        }
    }
}
