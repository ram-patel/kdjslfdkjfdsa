public class ThrowDemo {

    public static void main(String[] args) {
        try {
            Exception err = new Exception("I solemnly swear that I am up to no good.");
            throw err;
        } catch (Exception err) {
            System.out.println(err);
        }
    }
}
