public class OperasiMatematika {
    public static void main(String[] args) {
        int a = 100;
        int b = 10;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        System.out.println("======================");

        int c = 100;                            // Augmented Assignments
        
        c += 10;
        System.out.println(c);

        c -= 10;
        System.out.println(c);

        c *= 10;
        System.out.println(c);

        c /= 10;
        System.out.println(c);

        c %= 10;
        System.out.println(c);

        System.out.println("======================");

        int d = +100;                           // Unary Operator
        d++;
        System.out.println(d);

        d--;
        System.out.println(d);
    }
}