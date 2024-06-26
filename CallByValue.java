public class CallByValue {
    public static void main(String[] args) {
        int x = 10;
        System.out.println(x);
        change(x);
        System.out.println(x);
        System.out.println(change(x));
    }

    public static int change(int x) {
        x = 20;
        return x;
    }
}