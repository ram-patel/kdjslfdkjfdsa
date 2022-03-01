public class String1 {

    public static void main(String[] args) {
        char[] name = { 't', 'a', 'd', 'r', 'a' };
        String str1 = new String();
        String str2 = new String(name);
        String str3 = new String(name, 0, 2);
        String str4 = new String(str3);
        String str5 = new String("Luna");
        System.out.println("Str1 : " + str1);
        System.out.println("Str2 : " + str2);
        System.out.println("Str3 : " + str3);
        System.out.println("Str4 : " + str4);
        System.out.println("Str5 : " + str5);
    }
}
