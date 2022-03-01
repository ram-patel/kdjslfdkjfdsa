public class StringComparison1 {

    public static void main(String[] args) {
        String str1 = "Har Har Mahadev";
        String str2 = "HAR HAR MAHADEV";
        System.out.println(" Str1 Compare Str2 " + str1.compareTo(str2));
        System.out.println("Str1 Compare to Str2 ignore Case " + str1.compareToIgnoreCase(str2));
    }
}
