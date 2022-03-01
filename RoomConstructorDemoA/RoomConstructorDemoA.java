class Room {

    float length, breath, height;
    byte nWindows;
    static int totWindows = 0;

    Room(float l, float b, float h, byte n) {
        length = l;
        breath = b;
        height = h;
        nWindows = n;
        totWindows += n;
    }

    Room(float l, float b, float h) {
        length = l;
        breath = b;
        height = h;
        nWindows = 0;
        totWindows++;
    }

    double area() {
        return (length * breath);
    }

    void display() {
        System.out.println("Length : " + length + "Breath : " + breath + " Height : " + height);
        System.out.println("Widows : " + nWindows);
    }
}

class RoomConstructorDemoA {

    public static void main(String[] args) {
        Room r1 = new Room(34, 22, 56, (byte) 2);

        System.out.println("R1");
        r1.display();
        System.out.println(" Total Windows : " + r1.totWindows);
        System.out.println(" Area : " + r1.area());
        Room r2 = new Room(12, 34, 34);
        System.out.println("R2");
        r2.display();
        System.out.println(" Total Windows : " + r2.totWindows);
        System.out.println(" Area : " + r2.area());
    }
}
