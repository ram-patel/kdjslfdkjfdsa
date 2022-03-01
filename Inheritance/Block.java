public class Block {

    public static void main(String[] args) {
        int num1 = 5;
        block1:{
            int num2 = 10;
            System.out.println("From Block 1");
            System.out.println("num1 : " + num1 + " num2 : " + num2);
        }
        block2:{
            int num2 = 30;
            System.out.println("From Block 2");
            System.out.println("num1 : " + num1 + " num2 : " + num2);
        }
    }
}
