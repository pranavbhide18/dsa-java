package recursion;

public class Basic {
    void main() {
//        print(1);
        printBack(5);
//        printBack2(1, 5);
    }

    public static void print(int num) {
        if(num > 10) return;
        System.out.println(num);
        print(num + 1);
    }

    public static void printBack(int num) {
        if(num < 1) return;
        printBack(num - 1);
        System.out.println(num);
    }

    public static void printBack2(int i, int num) {
        if(i > num) return;
        printBack2(i + 1, num);
        System.out.println(i);
    }
}
