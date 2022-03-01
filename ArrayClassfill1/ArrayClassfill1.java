public class ArrayClassfill1 {

    public static void main(String[] args) {
        double[] list = { 3.4, 2.1, 9.9, 6.5, 3.4, 6, 7.9, 5.5, 4.7, 3.9, 6.6 };
        display(list);
        java.util.Arrays.fill(list, 7);
        System.out.println();
        display(list);
    }

    static void display(double list[]) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
    }
}
