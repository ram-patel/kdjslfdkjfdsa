class ArrayAvg {

    public static void main(String[] args) {
        double numbers[] = { 10.5, 20.6, 30.8, 15.5, 17.3, 25.5, 27.2, 20, 30, 18.5 };
        byte ctr;
        double sum = 0, avg;

        System.out.println("List of number is");
        for (ctr = 0; ctr < 10; ctr++) {
            sum = sum + numbers[ctr];
            System.out.println(sum);
        }
        avg = sum / 10;
        System.out.println("Sum of above numbers is: " + sum);
        System.out.println("Average of above numbers is: " + avg);
    }
}
