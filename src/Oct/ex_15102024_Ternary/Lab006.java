package Oct.ex_15102024_Ternary;

public class Lab006 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 15;
                int result = (a >= b && a >= c) ? a : (b >= c ? b : c);
        System.out.println("Max no. is ->" + result);

    }
}
