public class String2 {

    public static void main(String[] args) {
        String str1 = "I Love India";
        String str2 = "I Love India";
        String str3 = new String("Lune Lovegood");
        String str4 = new String(str3);
        System.out.println("Str1 : " + str1);
        System.out.println("is Str1 Equal to Str2 " + (str1 == str2));
        System.out.println("is Str2 Equal to Str4 " + (str3 == str4));
    }
}
