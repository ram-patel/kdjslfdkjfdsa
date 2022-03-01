class Rectangle {

    float length, width;
    byte windows;

    void setAttr(float l, float w, byte win) {
        length = l;
        width = w;
        windows = win;
    }

    void display() {
        System.out.println("Length : " + length + " Width : " + width + " Windows : " + windows);
    }

    double area() {
        return (length * width);
    }
}

public class RoomDemo {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();
        r1.display();
        r2.display();
        r1.setAttr(23, 56, (byte) 2);
        r1.display();
        System.out.println("Area : " + r1.area());
        r2.setAttr(32, 45, (byte) 5);
        r2.display();
        System.out.println("Area : " + r2.area());
    }
}
