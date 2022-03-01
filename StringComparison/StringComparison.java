public class StringComparison {

    public static void main(String[] args) {
        String str1 = "Har Har Mahadev";
        String str2 = "HAR HAR MAHADEV";
        System.out.println("Is Str1 Equals Str2 " + str1.equals(str2));
        System.out.println("Is Str1 Equals Str2 " + str1.equalsIgnoreCase(str2));
    }
}
