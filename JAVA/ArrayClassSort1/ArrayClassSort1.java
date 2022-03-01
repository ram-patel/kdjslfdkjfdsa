class ArrayClassSort1 {

    public static void main(String[] args) {
        double list[] = { 6.4, 8, 7.8, 9.8, 9.5, 6, 7, 8, 8.5, 5.9 };
        System.out.println("Initial Elements");
        display(list);
        java.util.Arrays.sort(list, 3, 9);
        System.out.println("\n sort partial array: list[3] to list[8]");
        display(list);
    }

    static void display(double ary[]) {
        for (int i = 0; i < ary.length; i++) {
            System.out.print(ary[i] + "\t");
        }
        System.out.println();
    }
}
