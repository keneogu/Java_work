public class Controller {

    /**
     * @param arguments
     */
    public static void main(String[] arguments) {
        int x = add(1,2, 3);

        System.out.println(x);
    }

    static int add(int a, int b) {
        System.out.println("This is overloaded method 1");
        return a+b;
    }

    static int add(int a, int b, int c) {
        System.out.println("This is overloaded method 2");
        return a+b+c;
    }

    static int add(int a, int b, int c, int d) {
        System.out.println("This is overloaded method 3");
        return a+b+c+d;
    }
}
