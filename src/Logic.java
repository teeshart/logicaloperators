public class Logic {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        boolean c = !(a < b) && true;

        if (a > b && b < 10) {

            System.out.println("value correct");
        }
        else {
            System.out.println("value not correct");
        }
    }
}