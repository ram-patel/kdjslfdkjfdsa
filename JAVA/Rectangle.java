class Room {

    float length, breath;

    void setAttr(float l, float b) {
        length = l;
        breath = b;
    }

    double area() {
        return (length * breath);
    }
}

public class Rectangle {

    public static void main(String[] args) {
        Room r1 = new Room();
        r1.setAttr(34, 34);
        System.out.println(r1.area());
    }
}
