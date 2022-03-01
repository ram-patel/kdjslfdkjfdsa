public class InterestCalc {

    public static void main(String[] args) {
        // Varibles
        double principle = 5000;
        double rate = 4.5;
        double duration = 3;
        double interest;
        double maturity;

        interest = (principle * rate * duration);
        maturity = principle + interest;
        // Print Statements
        System.out.println("Principle : " + principle);
        System.out.println("Rate Of Interest : " + rate);
        System.out.println("Duration : " + duration);
        System.out.println("interest : " + interest);
        System.out.println("maturity : " + maturity);
    }
}
